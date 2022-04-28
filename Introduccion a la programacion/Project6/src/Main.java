public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido ("BRRR");
        System.out.println(coche.getSonido ());
    }
}

 abstract class Vehiculo {
     int velocidadMaxima;
     String sonido;
     String matricula;

     public Vehiculo () {
         System.out.println("Estoy en el constructor de Vehiculo");
     }

     abstract public String getMatricula();

     abstract public void setMatricula(String matricula);

     abstract public void setSonido(String sonido);

     abstract public String getSonido();

     public void setVelocidadMaxima(int velocidadMaxima) {
         this.velocidadMaxima = velocidadMaxima;
     }
 }

 class Motor {
     public Motor() {
         System.out.println("Estoy en el motor");
     }

     String tipoMotor;

 }

 class Coche extends Vehiculo {
    public String getSonido(){
        return this.sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }

     public String getMatricula(){
        return this.matricula;
     }

     public void setMatricula(String matricula){
        this.matricula = matricula;
     }
 }

//Final class: clase de la cual no se va a poder heredar
 final class CocheElectrico extends  Coche {

 }

 //Polimorfismo
class Vehiculo2 {
    public void diHola() {
        System.out.println("Hola!!");
    }
}

class Coche2 extends Vehiculo2 {
    public void diHola() {
        System.out.println("Soy un coche!!");
    }
}

//Inteface and Implements
interface Vehiculo3 {
    public void diHola();
}

class Coche3 implements Vehiculo3 {
    public void diHola() {
        System.out.println("Soy un coche!!");
    }
}