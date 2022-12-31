package array;

import java.util.Scanner;

public class EjemploArregloNotas {
    public static void main(String[] args) {
       /* double[] claseMatematicas,claseHistoria,claseLenguaje;
        double sumNotasMatematicas=0,sumaNotasHistoria=0,sumNotasLenguaje=0;

        claseMatematicas=new double[7];
        claseHistoria=new double[7];
        claseLenguaje=new double[7];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para Matematicas");
        for (int i=0; i<claseMatematicas.length;i++){
            clseMatematicas[i]=s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Historia");
        for (int i=0; i<claseMatematicas.length;i++){
            claseHistoria[i]=s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje");
        for (int i=0; i<claseMatematicas.length;i++){
            claseLenguaje[i]=s.nextDouble();
        }
        for (int i=0;i<7;i++){
            sumNotasMatematicas+=claseMatematicas[i];
            sumaNotasHistoria+=claseHistoria[i];
            sumNotasLenguaje+=claseLenguaje[i];
        }
        double promedioMatematicas=sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria=sumaNotasHistoria/claseHistoria.length;
        double promedioLenguaje=sumNotasLenguaje/claseLenguaje.length;

        System.out.println("EL PROMEDIO DE LA CLASE DE MATEMATICAS ES: "+promedioMatematicas);
        System.out.println("EL PROMEDIO DE LA CLASE DE HISTORIA ES: "+promedioHistoria);
        System.out.println("EL PROMEDIO DE LA CLASE DE LENGUAJE ES: "+promedioLenguaje);
        System.out.println("PROMEDIO TOTAL DEL CURSO ES: "+promedioHistoria+promedioLenguaje+promedioMatematicas);

        System.out.println("INGRESE EL IDENTIFICADOR DEL ALUMNO (DE 0-6):");
        int id=s.nextInt();

        double promedioAlumno=(claseHistoria[id]+claseLenguaje[id]+claseMatematicas[id])/3;
        System.out.println("PROMEDIO DEL ALUMNO Nro: "+id+":"+promedioAlumno);*/

    Materia materia=new Materia();
    materia.ingresarNotas();
    materia.sumaNotas();
    materia.imprimirPromedio();

    }
}
