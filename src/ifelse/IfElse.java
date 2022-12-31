package ifelse;

public class IfElse {
    public static void main(String[] args) {
        int mes=5;
        String estacion;
        String saludo = "hola mundo";

    if (mes == 1 || mes == 2 || mes == 12){
        estacion="Invierno";
    } else if (mes ==3 ||mes==4 ||mes==5){
        estacion="Primavera";
    }else if (mes ==6 || mes==7 || mes==8){
        estacion="Verano";
    }else {
        estacion="Otoño";
    }
    System.out.println(estacion);


   }
}
