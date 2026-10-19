
public class MainAplicacion {
    public static void main(String[] args) {
        Aplicacion app1 = new Aplicacion("WhatsApp", "2.0");
        Aplicacion app2 = new Aplicacion("Instagram", "3.0");
        Aplicacion app3 = new Aplicacion("Spotify", "1.5");

        app1.iniciar();
        app2.iniciar();

        System.out.println("Aplicación 1: " + app1.getNombre());
        System.out.println("Versión: " + app1.getVersion());
        System.out.println("Ejecutando: " + app1.isEjecutando());

        System.out.println("Aplicación 2: " + app2.getNombre());
        System.out.println("Ejecutando: " + app2.isEjecutando());

        System.out.println("Aplicación 3: " + app3.getNombre());
        System.out.println("Ejecutando: " + app3.isEjecutando());

        System.out.println("Total de aplicaciones: "
                + Aplicacion.getTotalAplicaciones());

        app1.cerrar();
        System.out.println("WhatsApp después de cerrar: "
                + app1.isEjecutando());
    }
}
