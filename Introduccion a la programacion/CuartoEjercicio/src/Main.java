public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(19);
        cliente.setNombre("Ezequiel");
        cliente.setTelefono("321456321");
        cliente.setCredito(24);

        System.out.println(
                "Edad: " + cliente.getEdad()
                + "Nombre: " + cliente.getNombre()
                + "Telefono: " + cliente.getTelefono()
                + "Credito: " + cliente.getCredito()
        );
    }
}

class Persona {
    int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    String nombre, telefono;
}

class Cliente extends Persona {
    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    int credito;
}

class Trabajador extends Persona {
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    int salario;
}