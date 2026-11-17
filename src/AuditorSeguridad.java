public class AuditorSeguridad {
    private static AuditorSeguridad instancia;
    private String evento1;
    private String evento2;
    private int totalRegistros;

    private AuditorSeguridad() {
        this.totalRegistros = 0;
    }

    public static AuditorSeguridad getInstancia() {
        if (instancia == null) {
            instancia = new AuditorSeguridad();
        }
        return instancia;
    }

    public void registrarEvento(String descripcion) {
        if (totalRegistros == 0) {
            this.evento1 = descripcion;
            this.totalRegistros = 1;
            System.out.println("Evento registrado: " + descripcion);
        } else if (totalRegistros == 1) {
            this.evento2 = descripcion;
            this.totalRegistros = 2;
            System.out.println("Evento registrado: " + descripcion);
        } else {
            System.out.println("Capacidad de auditoría llena.");
        }
    }

    public int getTotalRegistros() {
        return totalRegistros;
    }

    public void mostrarTraza() {
        System.out.println("--- Traza de Auditoría ---");
        if (totalRegistros > 0) {
            System.out.println("1. " + evento1);
        }
        if (totalRegistros > 1) {
            System.out.println("2. " + evento2);
        }
    }
}