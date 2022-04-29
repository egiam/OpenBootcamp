public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(19,"Ezequiel","3214569870",24);

        System.out.println(
                "Edad: " + cliente.getEdad()
                + "Nombre: " + cliente.getNombre()
                + "Telefono: " + cliente.getTelefono()
                + "Credito: " + cliente.getCredito()
        );
    }
}

class Persona {

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    int edad;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    String nombre, telefono;
}

class Cliente extends Persona {
    public int getCredito() {
        return credito;
    }

    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    int credito;
}

class Trabajador extends Persona {
    public int getSalario() {
        return salario;
    }

    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    int salario;
}

//Profe
public class Main2 {

    public static void main(String[] args) {
        Cliente2 cliente2 = new Cliente2();
        Trabajador2 trabajador = new Trabajador2();
        cliente2.nombre = "Raúl";
        cliente2.edad = 23;
        cliente2.telefono = 293214122;
        cliente2.credito = 150.55;
        System.out.println("Soy " + cliente2.nombre + ", tengo " + cliente2.edad + " años y mi telefono es " + cliente2.telefono
                + " y mi credito disponible es " + cliente2.credito + "€");

        trabajador.nombre = "Jose";
        trabajador.edad = 42;
        trabajador.telefono = 582910244;
        trabajador.salario = 2000.32;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");

    }
}

class Persona2{
    int edad;
    int telefono;
    String nombre;
}

class Cliente2 extends Persona2{
    double credito;
}

class Trabajador2 extends Persona2 {
    double salario;
}