package array;

import java.util.Scanner;

public class Materia {
    private double[] claseMatematicas,claseHistoria,claseLenguaje;
    private double sumNotasMatematicas=0,sumaNotasHistoria=0,sumNotasLenguaje=0;
    Scanner s=new Scanner(System.in);

    public Materia(){}

    public Materia(double[] claseMatematicas, double[] claseHistoria, double[] claseLenguaje) {
        this.claseMatematicas = claseMatematicas;
        this.claseHistoria = claseHistoria;
        this.claseLenguaje = claseLenguaje;
    }

    void ingresarNotas() {
        claseMatematicas = new double[7];
        System.out.println("Ingrese 7 notas de estudiantes para matematicas");
        for (int i=0; i<claseMatematicas.length;i++){
            claseMatematicas[i]=s.nextDouble();

        }
        claseHistoria = new double[7];
        System.out.println("Ingrese 7 notas de estudiantes para Historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }
        claseLenguaje=new double[7];
        System.out.println("Ingrese 7 notas de estudiantes para lenguaje");
        for (int i=0; i<claseLenguaje.length;i++){
            claseLenguaje[i]=s.nextDouble();
        }
    }

    void  sumaNotas(){
        for (int i=0;i<7;i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }
    }
    void imprimirPromedio(){

        double promedioMatematicas=sumNotasMatematicas/claseMatematicas.length;
        double promedioHistoria=sumaNotasHistoria/claseHistoria.length;
        double promedioLenguaje=sumNotasLenguaje/claseLenguaje.length;
        double promedios=(promedioHistoria+promedioLenguaje+promedioMatematicas)/3.0;

        System.out.println("EL PROMEDIO DE LA CLASE DE MATEMATICAS ES: "+promedioMatematicas);
        System.out.println("EL PROMEDIO DE LA CLASE DE HISTORIA ES: "+promedioHistoria);
        System.out.println("EL PROMEDIO DE LA CLASE DE LENGUAJE ES: "+promedioLenguaje);
        System.out.println("PROMEDIO TOTAL DEL CURSO ES: "+promedios);
    }
}

