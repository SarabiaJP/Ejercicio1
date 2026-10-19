
public class Main {

    public static void main(String[] args) {

        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "Minecraft";
        juego1.genero = "Aventura";
        juego1.version = "1.20";
        juego1.activo = false;

        juego2.nombre = "Fortnite";
        juego2.genero = "Battle Royale";
        juego2.version = "35.00";
        juego2.activo = false;

        juego3.nombre = "Resident Evil";
        juego3.genero = "Terror";
        juego3.version = "4";
        juego3.activo = false;

        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

        juego2.iniciar();

        System.out.println("Despues de iniciar Fortnite:");
        juego2.mostrarInformacion();

        System.out.println("Version de Minecraft:");
        juego1.mostrarVersion();

        juego3.cerrar();
    }
}
