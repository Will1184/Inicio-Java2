package claseobject;

public class ClaseObject {
    public static void main(String[] args) {
        Empleado emp1= new Empleado("Juan", 10000);
        Empleado emp2= new Empleado("Juan", 10000);
        compararObjectos(emp1,emp2);
    }
    private static void compararObjectos(Empleado emp1, Empleado emp2 ){
        System.out.println("Contenido objeto: "+ emp1);

        //Referencia
        if (emp1==emp2){
            System.out.println("Los objetos tienen misma direccion de memoria");

        }else {
            System.out.println("Los objetos tienen distinta direccion de memoria");
        }

        //equals
        if (emp1.equals(emp2)){
            System.out.println("Los objetos tienen el mismo contenido, son iguales");
        }else {
            System.out.println("Los objetos no tienen el mismo contenido, no son iguales");
        }

        //Hashcode
        if (emp1.hashCode()==emp2.hashCode()){
            System.out.println("Los objetos tienen el mismo codigo hash");
        } else {
            System.out.println("Los objetos no tienen el mismo codio hash");
        }

    }
}
