
public class Servicio {

    private String nombre;
    private double precio;
    private boolean activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }

    public void mostrarInformacion() {
        System.out.println("Servicio: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Activo: " + activo);
    }
}
