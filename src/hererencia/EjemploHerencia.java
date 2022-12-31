package hererencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan",25000);
        System.out.println("Imprimimos el objeto Empleado1");
        System.out.println(e1);

        Empleado e2 = new Empleado("Juan",25000);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDireccion("Bogota,Colombia");
        System.out.println("\n Imprimimos el objeto Empleado2");
        System.out.println(e2);

        //Al crear un nuevo objeto e java.util.Date nos regresa la fecha
        Cliente c1=new Cliente(new java.util.Date(),false);
        System.out.println("\nImprimimos el objeto cliente1");
        System.out.println(c1);

        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDireccion("Mexico, DF");

        System.out.println("\nVolvemos a imprimir el cliente1");
        System.out.println(c1);
    }
}
