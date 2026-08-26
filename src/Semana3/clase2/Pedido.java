package Semana3.clase2;

public class Pedido {
    private String nombre;
    private int valor;

    public Pedido(int valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
