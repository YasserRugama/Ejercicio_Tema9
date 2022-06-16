package clases;

public class main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Yasser";
        cliente.edad = 37;
        cliente.telefono = 856226325;
        cliente.credito = 5000;

        System.out.println("El nombre del clientes es: " + cliente.nombre);
        System.out.println("La edad del cliente es: " + cliente.edad + " años");
        System.out.println("El número de teléfono del cliente es: " + cliente.telefono);
        System.out.println("El cliente cuenta con un credito de: " + cliente.credito);
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("");

        Trabajador trabajador = new Trabajador();
        trabajador.mostrarDatosTrabajador("Juan", 27, 85621688, 15000);

    }
}

class Persona {

    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona {

    int credito;
}

class Trabajador extends Persona {

    int salario;

    public void mostrarDatosTrabajador(String nombre, int edad, int telefono, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.salario = salario;

        System.out.println("El nombre del trabajador es: " + nombre);
        System.out.println("La edad del trabajador es: " + edad + " años");
        System.out.println("El telefono del trabajador es: " + telefono);
        System.out.println("El salario del trabajador es: " + salario);

    }
}
