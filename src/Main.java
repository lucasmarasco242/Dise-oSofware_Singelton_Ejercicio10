public class Main {
    public static void main(String[] args) {
        AuditorSeguridad a1 = AuditorSeguridad.getInstancia();
        AuditorSeguridad a2 = AuditorSeguridad.getInstancia();

        System.out.println("¿Es la misma instancia de auditor?: " + (a1 == a2));

        a1.registrarEvento("LOGIN: Operador1");
        a1.registrarEvento("TRANSFERENCIA: $5000");

        System.out.println("Total registros: " + a1.getTotalRegistros());
        a1.mostrarTraza();
    }
}