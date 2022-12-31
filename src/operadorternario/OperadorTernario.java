package operadorternario;

import javax.print.DocFlavor;
import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
//        String estado="";
//
//        double promedio;
//        double matematicas=0.0,ciencias=0.0,historia=0.0;
//
       Scanner s=new Scanner(System.in);
//        System.out.println("Ingrese la nota de matematicas entre 2-0-7.0");
//        matematicas=s.nextDouble();
//        System.out.println("Ingrese la nota de matematicas entre 2-0-7.0");
//        ciencias=s.nextDouble();
//        System.out.println("Ingrese la nota de matematicas entre 2-0-7.0");
//        historia=s.nextDouble();
//
//        promedio=(matematicas+ciencias+historia)/3;
//
//        estado= promedio>5.49 ? "Aprobado":"No Aprobado";
//
//        System.out.println("Estado = "+estado);

        int num1,num2,num3,num4;
        int max;
        System.out.println("Ingrese un numero");
        num1=s.nextInt();
        System.out.println("Ingrese un numero");
        num2=s.nextInt();
        System.out.println("Ingrese un numero");
        num3=s.nextInt();
        System.out.println("Ingrese un numero");
        num4=s.nextInt();

        max=(num1>num2)?num1:num2;
        max=(max>num3)?max:num3;
        max=(max>num4)?max:num4;


        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
        System.out.println("Num3: "+num3);
        System.out.println("Num4: "+num4);
        System.out.println("El numero maximo es: "+max);


     System.out.println(""+30%7);
    }
}
