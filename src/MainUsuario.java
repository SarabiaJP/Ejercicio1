public class MainUsuario {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("juan123", "juan@gmail.com");
        Usuario usuario2 = new Usuario("maria456", "maria@gmail.com");
        Usuario usuario3 = new Usuario("pedro789", "pedro@gmail.com");
        Usuario usuario4 = new Usuario("ana101", "ana@gmail.com");

        System.out.println("Usuario 1: " + usuario1.getUsername());
        System.out.println("Usuario 2: " + usuario2.getUsername());
        System.out.println("Usuario 3: " + usuario3.getUsername());
        System.out.println("Usuario 4: " + usuario4.getUsername());

        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());
    }
}