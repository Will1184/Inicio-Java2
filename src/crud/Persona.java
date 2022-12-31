package crud;
import java.util.ArrayList;
import java.util.Scanner;
public class Persona {
        //Se crean los atributos
        private String nombre;
        private double edad;
        private  int i;

        //Se crea el constructor de la clase
        public Persona(String nombre, int i, int edad) {
                this.nombre = nombre;
                this.i = i;
                this.edad=edad;
        }

        //Se crean los sets y gets para poder escribir y leer los datos
        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public int getI() {
                return i;
        }

        public void setI(int i) {
                this.i = i;
        }

        public double getEdad() {
                return edad;
        }

        public void setEdad(double edad) {
                this.edad = edad;
        }

        //ToString para la visualizacion
        @Override
        public String toString() {
                return   i+") " +"nombre: " + nombre+",  Edad: "+edad ;
        }

        //Creacion de metodos para los procesos que usuario quiere hacer

        //Metodo que crea un dato

        static void creaDato(ArrayList<Persona> personas, Scanner leerC, Scanner leer, String nom,int edad){

                System.out.println("Cantidad de datos a ingresar");
                //Se guarda el dato introducido por consola en la variable "datos"
                int datos= leerC.nextInt();
                //Se crea un for para ingresar datos la cantidad de veces que se requirio

                for (int i =0; i<datos;i++){

                        System.out.println("Ingrese el nombre");
                        //Se guarda el dato introducido de tipo string por consola en la variable "nom" que guarda el nombre
                        nom= leer.next();
                        System.out.println("Ingrese la edad");
                        //Se guarda el dato introducido de tipo int por consola en la variable "edad" que guarda la edad
                        edad= leer.nextInt();
                        //Se crea un objeto de la clase persona, se inicializa y se le asigna los valores de las variables "nom","i","edad"
                        Persona nombre= new Persona(nom,i,edad);
                        //Se le añade los datos al arraylist de tipo persona
                        personas.add(nombre);

                }
        }
        //Metodo que lee el tamaño de la lista
        static  void leeSize(ArrayList<Persona> personas){
                System.out.println("\nLa cantidad de datos es: "+personas.size());

        }
        //Metodo que lee un dato
        static  void leeDato(ArrayList<Persona> personas,Scanner leerC){

                int numDato;
                System.out.println("\nDato que quiere imprimir");
                //Se guarda numero del index del arraylist que el usuario quiera imprimir
                numDato= leerC.nextInt();
                System.out.println(personas.get(numDato));

        }

        //Metodo que actualiza un dato
        static void actualizaDato(ArrayList<Persona> personas, Scanner leerC,Scanner leer){

                //Imprime un toString para que el usuario vea el index del arraylist y los datos que quiere modificar
                System.out.println(personas.toString());
                int modDato,modEdadDato;
                String modNomDato;
                System.out.println("Dato que quiere modifcar");
                //Se guarda eL numero del index del arraylist que se quiere modificar
                modDato= leerC.nextInt();
                System.out.println("Ingrese nombre");
                //Se guarda el dato de tipo string que cambia el primer dato del index que se quiere modificar
                modNomDato= leer.next();
                System.out.println("Ingrese edad");
                //Se guarda el dato de tipo double que cambia el segundo dato del index que se quiere modificar
                modEdadDato= leer.nextInt();
                //Se crea un objeto de la clase persona, se inicializa y se le asigna los valores de las variables "modNomDato","modDato","modEdadDato"
                Persona nombre= new Persona(modNomDato,modDato,modEdadDato);
                personas.set(modDato,nombre);
        }
        //Metodo que elimina un dato
        static void eliminaDato(ArrayList<Persona> personas, Scanner leerC,Scanner leer){

                //Imun toString para que el usuario vea el index del arraylist y los datos que quiere eliminar
                System.out.println(personas.toString());
                int elimDato;
                String seguridad;
                System.out.println("Dato que quiere eliminar");
                //Se guarda eL numero del index del arraylist que se quiere eliminar
                elimDato= leerC.nextInt();
                //Se hace un if que evite que se elimine datos de manera accidental
                System.out.println("¿Esta seguro de querer eliminar el dato? Escriba Si o no");
                seguridad=leer.next().toUpperCase();
                if (seguridad.equals("SI"))
                {
                        personas.remove(elimDato);
                } else {
                        System.out.println("Dato no eliminado");
                }

        }

        //Metodo que lee todos los datos
        static  void leeDatos(ArrayList<Persona> personas) {
                //Lee todos los datos que se hayan introducido en el arraylist por medio del toString
                System.out.println("Todos los datos:" + personas.toString());
        }
        //Metodo salir del programa
        static  void salir(Scanner leer) {
                int ex;
                //Codigo que ayuda al usuario salir del programa en ejecucion
                System.out.println("¿QUIERE SALIR DEL PROGRAMA? Escriba 1 PARA SI:;  ESCRIBA 2 PARA NO");
                ex=leer.nextInt();
                System.exit(ex);
        }
}

