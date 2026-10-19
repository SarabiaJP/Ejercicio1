
public class MainServicio {

    public static void main(String[] args) {

        Servicio servicio1 = new Servicio();

        servicio1.setNombre("Desarrollo web");
        servicio1.setPrecio(250.00);

        servicio1.activar();
        servicio1.mostrarInformacion();

        System.out.println("Despues de desactivar:");

        servicio1.desactivar();
        servicio1.mostrarInformacion();
    }
}
