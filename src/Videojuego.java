
public class Videojuego {

    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Version: " + version);
        System.out.println("Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
    }

    public void cerrar() {
        activo = false;
    }

    void mostrarVersion() {
        System.out.println("Version: " + version);
    }
}

