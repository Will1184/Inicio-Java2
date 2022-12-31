package array;

import java.util.Scanner;

public class EjemploArreglo {
    public static void main(String[] args) {
    /*    int edades[];
        Scanner gs = new Scanner(System.in);
        edades = new int[3];
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        System.out.println("Arreglo de entero indice 0 = " + edades[0]);
        System.out.println("Arreglo de entero indice 1 = " + edades[1]);
        System.out.println("Arreglo de entero indice 2 = " + edades[2]);
*/
        Persona[] personass = new Persona[3];
        Persona metodos = new Persona();
        metodos.agregarNombre(personass);


        Persona[] personas = new Persona[3];

      /*  for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingrese el nombre");
            personas[i] = new Persona(gs.next().toUpperCase());
            System.out.println(personas[i]);
        }*/

        Persona[]personas1=new Persona[3];
        personas1[0]=new Persona("Juan");
        personas1[1]=new Persona("Carlo");
        personas1[2]=new Persona("Frank");
        for (int i=0; i<personas1.length;i++){
            if (i==2){
                personas1[2]=new Persona("Robin");
            }
            System.out.println(personas1[i]);
        }

    }
}

