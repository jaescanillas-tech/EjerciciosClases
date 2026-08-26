package Semana3.clase2;

public class FormularioCotizacion extends Formulario implements Calculable {

    private String nombreSocial;
    private String rut;
    private Pedido pedidos;
    private String expiraEl;

    public FormularioCotizacion(int id, boolean consentimiento, String tipo, String email, String nombreSocial, String rut, Pedido[] pedidos, String expiraEl) {
        super(id, consentimiento, tipo, email);
        this.nombreSocial = nombreSocial;
        this.rut = rut;
        this.pedidos = pedidos;
        this.expiraEl = "El dia despues de mañana";
    }

    @Override
    public int precioTotal(){

        int total = 0;

        for (Pedido pedido : this.pedidos) {
            total += pedido.getValor();
        }
        return total;
    }

    @Override
    public void guardar() {
        System.out.println("Guardando contacto");
        this.isConsentimiento(true);
    }
}
