package one;

public class CocheElectrico extends Coche {
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }
    public CocheElectrico(){
        super();
    }

    String motorElectrico;

    public CocheElectrico(String motorElectrico) {
        super();
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        super.acelerar(cantidad * 2); // Aceleramos el doble ya que es un coche electrico
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
