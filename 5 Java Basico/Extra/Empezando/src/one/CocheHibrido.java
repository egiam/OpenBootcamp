package one;

public class CocheHibrido extends Coche{

    String motorHibrido;
    public CocheHibrido(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico, String motorHibrido) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
        this.motorHibrido = motorHibrido;
    }
    public CocheHibrido(){
        super();
    }

    String motorElectrico;

    public CocheHibrido(String motorElectrico, String motorHibrido) {
        super();
        this.motorElectrico = motorElectrico;
        this.motorHibrido = motorHibrido;
    }

    @Override
    public void acelerar(Integer cantidad) {
        super.acelerar(cantidad * 2); // Aceleramos el doble ya que es un coche electrico
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
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
