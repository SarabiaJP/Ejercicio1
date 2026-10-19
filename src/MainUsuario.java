
public class MainUsuario {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();

        usuario1.setUsername("juan123");
        usuario1.setCorreo("juan@gmail.com");
        usuario1.setNivel(2);

        usuario1.activar();

        System.out.println("Usuario: " + usuario1.getUsername());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Nivel: " + usuario1.getNivel());
        System.out.println("Activo: " + usuario1.isActivo());

        usuario1.setNivel(-5);

        System.out.println("Nivel despues del cambio: "
                + usuario1.getNivel());

        usuario1.desactivar();

        System.out.println("Activo despues del cambio: "
                + usuario1.isActivo());
    }
}
