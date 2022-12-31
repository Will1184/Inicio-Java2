package array;

import java.util.Random;

public class Persona {
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "nombre: " + nombre ;
    }

    //Metodo que se usa para evitar digitar por teclado los nombres para acelerar el proceso
    public void agregarNombre(Persona[] personas){
        String[]nombres={"Robin","Marlon","Brandon","Diaz","Byron","carlos","Roberto","wilhem","Rene","Montenegro"};
        for(int i=0; i< personas.length;i++){
            int r = (int)(Math.random() * 10);
            String nombreAgregar=nombres[r];
            personas[i]=new Persona(nombreAgregar );
            System.out.println(personas[i]);
            System.out.println("---------------");
        }
    }
}
