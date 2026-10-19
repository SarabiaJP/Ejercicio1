
public class MainServicio {

    public static void main(String[] args) {

        Servicio servicio1 = new Servicio();

        servicio1.setNombre("Servidor web");
        servicio1.setPuerto(8080);
        servicio1.setCantidadPeticiones(0);

        servicio1.iniciar();

        servicio1.registrarPeticion();
        servicio1.registrarPeticion();
        servicio1.registrarPeticion();

        System.out.println("Informacion del servicio:");
        servicio1.mostrarInformacion();

        System.out.println("Despues de detener:");

        servicio1.detener();
        servicio1.mostrarInformacion();
    }
}
