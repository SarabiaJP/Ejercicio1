
public class Usuario {
    private int id;
    private String username;
    private String correo;
    private boolean activo;
    private int nivel;

    private static int contadorUsuarios = 0;

    public Usuario(String username, String correo) {
        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.isEmpty()) {
            this.correo = correo;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void activar() {
        activo = true;
    }

    public void desactivar() {
        activo = false;
    }
        public static int getTotalUsuarios() {
            return contadorUsuarios;
    }
}
