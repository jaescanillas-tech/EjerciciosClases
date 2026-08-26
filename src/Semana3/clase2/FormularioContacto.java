package Semana3.clase2;

public class FormularioContacto extends Formulario {

    private String nombreContacto;
    private String mensaje;

    public FormularioContacto(int id, boolean consentimiento, String tipo, String email, String nombreContacto, String mensaje) {
        super(id, consentimiento, tipo, email);
        this.nombreContacto = nombreContacto;
        this.mensaje = mensaje;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void guardar() {
        System.out.println("Guardando contacto");
        this.setConsentimiento(true);
    }
}
