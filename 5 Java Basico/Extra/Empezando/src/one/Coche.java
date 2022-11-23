package one;

public abstract class Coche {

    // Atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // Constructor
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    public Coche(){
        this.color = "Blanco";
        this.fabricante = "Fiat";
        this.modelo = "Uno";
        this.peso = 1000.0;
        this.largo = 4.0;
    }

    // Metodos
    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color = '" + color + '\'' +
                ", fabricante = '" + fabricante + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", peso = " + peso +
                ", largo = " + largo +
                ", velocidad = " + velocidad +
                '}';
    }
}
