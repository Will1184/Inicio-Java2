package ciclos;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("Por favor introduzca el numero de elementos a iterar");
        int maxElementos;
        Scanner entradaScanner= new Scanner(System.in);
        maxElementos=entradaScanner.nextInt();

        int contador=0;
        while (contador <maxElementos){
            System.out.println("contador = "+contador);
            contador++;
        }
    }
}
