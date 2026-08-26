package Semana3.clase2;

/*
    es una clase abstracta ya que no tiene un contexo de formulario determinado or los cass
    y requerimientos
 */

public abstract class Formulario {
    protected int id;
    private boolean consentimiento;
    protected String tipo;
    protected String email;

    public Formulario(int id, boolean consentimiento, String tipo, String email) {
        this.id = id;
        this.consentimiento = consentimiento;
        this.tipo = tipo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isConsentimiento() {
        return consentimiento;
    }

    /*
        es el consentimiendo indica si es o no es consentido
     */

    protected void setConsentimiento(boolean consentimiento) {
        this.consentimiento = consentimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
        recordar que la implementacion es sobrecargada para usar los aributos hijos
     */
    public abstract void guardar();
}