package Semana3;

public class Bicicleta extends Vehiculo implements TocableCampana {

    private boolean tieneMotor;

    public Bicicleta(String marca, String modelo, int velocidadMaxima, boolean tieneMotor) {
        super(marca, modelo, velocidadMaxima);
        this.tieneMotor = tieneMotor;
    }

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }

    @Override
    public void desplazarse() {
        System.out.println("Se mueve en ciclovia");
    }

    @Override
    public void tocar() {
        System.out.println("Toco campana: ring ring!.");
    }
}
