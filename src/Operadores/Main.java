package Operadores;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        System.out.println("Operadores Aritmeticos");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);


        System.out.println("\n Operador Modulo (Residuo)");
        System.out.println("x mod 10= " + a % 2);

        System.out.println("\n Operador Compuesto");
        //a=a+4
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\n Operador Incremento");
        //int a = a+1
        //Puede reescribirse como
        a++;
        System.out.println("a = "+a);

        //Preincremento/decremento (se incrementa antes de asignar el valor )
        c = ++a;

        //Postincremento/ decremento (se incrementa despues de asignar el valor)
        //La siguiente vez que evalua b, es cuando se incrementa
        d= b++;
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);

        System.out.println("\n Operador realacional:");
        //a es menor que b
        boolean res = a< b;
        System.out.println("res = "+res);

        System.out.println("Operador ternario:");
        int min = (a<b)? a:b;
        System.out.println("min = "+min);

        System.out.println("\nOperador de asignacion:");
        int i,j,k;
        //Cadena de asignacion
        i=j=k=100; //Valor de x,y and z igual a 100
        System.out.println("i = "+i);
        System.out.println("j = "+j);
        System.out.println("k = "+k);

        int x=(((25-5)*4)/(2-10))+4;
        x=((20*4)/(2-10))+4;
        x=(80/(2-10))+4;
        x=(80/-8)+4;
        x=-10+4;
        System.out.println(x);
        System.out.println((1+2-(3*(4/5))));
    }
  }
