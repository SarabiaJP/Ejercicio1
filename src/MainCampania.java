
public class MainCampania {

    public static void main(String[] args) {

        Campania campania1 = new Campania();
        Campania campania2 = new Campania();
        Campania campania3 = new Campania();

        campania1.nombre = "Campaña de Instagram";
        campania1.presupuesto = 300.00;
        campania1.plataforma = "Instagram";
        campania1.activa = true;

        campania2.nombre = "Campaña de TikTok";
        campania2.presupuesto = 250.00;
        campania2.plataforma = "TikTok";
        campania2.activa = false;

        campania3.nombre = "Campaña de Facebook";
        campania3.presupuesto = 200.00;
        campania3.plataforma = "Facebook";
        campania3.activa = false;

        campania1.mostrarInformacion();
        campania2.mostrarInformacion();
        campania3.mostrarInformacion();

        campania2.activar();

        System.out.println("Despues de activar TikTok:");
        campania2.mostrarInformacion();

        campania1.mostrarPresupuesto();
    }
}
