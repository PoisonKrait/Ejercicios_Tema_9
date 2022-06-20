public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Antonio Garcia");
        cliente.setEdad(26);
        cliente.setTelefono(55446328);
        cliente.setCredito(8000);
        System.out.println("El nombre del cliente es " + cliente.getNombre() + "\n" +
                "La edad del cliente es de " + cliente.getEdad() + "\n" +
                "El telefono del cliente es " + cliente.getTelefono() + "\n" +
                "El credito del cliente es " + cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Isai Martinez");
        trabajador.setEdad(19);
        trabajador.setTelefono(22557487);
        trabajador.setSalario(12587.76);
        System.out.println("El nombre del trabajador es " + trabajador.getNombre() + "\n" +
                "La edad del trabajador es de " + trabajador.getEdad() + "\n" +
                "El telefono del trabajador es " + trabajador.getTelefono() + "\n" +
                "El salario del trabajador es " + trabajador.getSalario());

    }
}

class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona{
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}
class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}