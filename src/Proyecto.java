
public class Proyecto {

    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            terminado = (progreso == 100);
        }
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        if (responsable != null && !responsable.isEmpty()) {
            this.responsable = responsable;
        }
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            progreso += porcentaje;

            if (progreso > 100) {
                progreso = 100;
            }

            terminado = (progreso == 100);
        }
    }
}
