
public class MainCupon {

    public static void main(String[] args) {

        Cupon cupon1 = new Cupon();
        Cupon cupon2 = new Cupon();
        Cupon cupon3 = new Cupon();

        cupon1.codigo = "VERANO20";
        cupon1.porcentajeDescuento = 20;
        cupon1.descripcion = "Descuento de verano";
        cupon1.activo = true;

        cupon2.codigo = "ESTUDIANTE15";
        cupon2.porcentajeDescuento = 15;
        cupon2.descripcion = "Descuento para estudiantes";
        cupon2.activo = false;

        cupon3.codigo = "BIENVENIDO10";
        cupon3.porcentajeDescuento = 10;
        cupon3.descripcion = "Descuento de bienvenida";
        cupon3.activo = false;

        cupon1.mostrarInformacion();
        cupon2.mostrarInformacion();
        cupon3.mostrarInformacion();

        cupon2.activar();

        System.out.println("Despues de activar el segundo cupon:");
        cupon2.mostrarInformacion();

        cupon1.mostrarDescuento();
        cupon1.mostrarResumen();
    }
}
