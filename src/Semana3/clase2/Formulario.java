package Semana3.clase2;

public class Formulario {
    private int id;
    private boolean consentimiento;
    private String tipo;
    private String email;

    public Formulario(int id, boolean consentimiento, String tipo, String email) {
        this.id = id;
        this.consentimiento = consentimiento;
        this.tipo = tipo;
        this.email = email;
    }

}