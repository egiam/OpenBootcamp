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