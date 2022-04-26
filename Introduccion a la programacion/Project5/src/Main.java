public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipo("Coche");
        String tipo = vehiculo.getTipo();
        System.out.println(tipo);
    }
}

abstract class Vehiculo {
    private String tipo;

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    private int velocidadMax;

    public boolean isRapido() {
        return rapido;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    private boolean rapido; //en el get del bool usamos is

    public void setTipo(String valor){
        this.tipo = valor;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    private String sonido;
}