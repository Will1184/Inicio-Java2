package crud;
import java.util.Scanner;
import java.util.ArrayList;
public class DatosPersonas {
    public static void main(String[] args) {

        ArrayList<Persona> personas= new ArrayList<>(); //Se crea un arraylist para guardar toda la informacion
        String nombre=""; //Se crea una variable que almacenara los nombres en los metodos
        int edad=0;
        int caso; //Se crea una variable de tipo int para que almacene el número que corresponde a la funcion del switch
        String resp; //Se crea una variable de tipo string que almacenara si o no ;
        // al escoger si el programa hace un bucle y al escoger no el programa termina

        Scanner leer = new Scanner(System.in);
        Scanner leerC = new Scanner(System.in);

        do {
            //El usuario debe digitar valores numericos para acceder a las diferentes funciones del sistema
            System.out.println("Digite el numero correspondiente a su peticion");
            System.out.println("1) Crear datos | 2) Leer Cantidad de datos digitados " +
                    "| 3) Leer un dato | 4) Actualizar un dato |" +
                    " 5) Eliminar un dato | 6) Leer Todos los datos | 7) Salir");

            caso= leerC.nextInt();

            switch (caso){
                //Metodo que crea un dato
                case 1 -> Persona.creaDato(personas, leerC, leer,
                        nombre,edad);

                //Metodo que lee el tamaño de la lista
                case 2 -> Persona.leeSize(personas);

                //Metodo que lee un dato
                case 3 -> Persona.leeDato(personas, leerC);

                //Metodo que actualiza un dato
                case 4 -> Persona.actualizaDato(personas, leerC, leer);

                //Metodo que elimina un dato
                case 5 -> Persona.eliminaDato(personas, leerC, leer);

                //Metodo que lee todos los datos
                case 6 -> Persona.leeDatos(personas);

                //Metodo sale del programa
                case 7 -> Persona.salir(leer);

                //Si el usuario hace algo mal le sale el texto
                default -> System.out.println("Proceso invalido");
            }
            //Codigo que pregunta al usuario si quiere continuar en el sistema o quiere salir
            System.out.println("\n¿QUIERE CONTINUAR? Escriba Si o No");
            resp = leer.next().toUpperCase();
            System.out.println();
        }
        //Codigo que hace compara el dato almacenado en la variable resp;
        //al escoger si el programa hace un bucle y si escoge no entonces el programa se cierra
        while (resp.equals("SI"));
    }
}



