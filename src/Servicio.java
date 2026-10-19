
public class Servicio {

    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        }
    }

    public void iniciar() {
        activo = true;
    }

    public void detener() {
        activo = false;
    }

    public void registrarPeticion() {
        if (activo) {
            cantidadPeticiones++;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puerto: " + puerto);
        System.out.println("Activo: " + activo);
        System.out.println("Cantidad de peticiones: "
                + cantidadPeticiones);
    }
}
