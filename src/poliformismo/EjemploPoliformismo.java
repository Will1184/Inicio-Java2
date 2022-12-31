package poliformismo;

public class EjemploPoliformismo {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Juan",1000);
        imprimirDetalles(emp);

        Gerente ger = new Gerente("Karla", 2000,"Ti");
        imprimirDetalles(ger);
    }
    static void imprimirDetalles(Empleado emp){
        System.out.println(emp.obtenerDetalles());
    }
}
