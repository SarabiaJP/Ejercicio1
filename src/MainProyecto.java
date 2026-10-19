
public class MainProyecto {

    public static void main(String[] args) {

        Proyecto proyecto1 = new Proyecto();

        proyecto1.setNombre("Aplicacion web");
        proyecto1.setResponsable("Juan");
        proyecto1.setProgreso(60);

        System.out.println("Proyecto: " + proyecto1.getNombre());
        System.out.println("Responsable: "
                + proyecto1.getResponsable());
        System.out.println("Progreso: " + proyecto1.getProgreso() + "%");

        proyecto1.avanzar(30);

        System.out.println("Despues de avanzar:");
        System.out.println("Progreso: " + proyecto1.getProgreso() + "%");

        proyecto1.avanzar(50);

        System.out.println("Progreso final: "
                + proyecto1.getProgreso() + "%");
        System.out.println("Terminado: " + proyecto1.isTerminado());
    }
}
