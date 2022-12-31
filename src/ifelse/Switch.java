package ifelse;

public class Switch {
    public static void main(String[] args) {
        int mes=0;
        String estacion;
        String saludo = "hola mundo";

        switch (mes){
            case 1: case 2: case 12:
                estacion="Invierno";
                break;
            case 3: case 4: case 5:
                estacion="Primavera";
                break;
            case 6: case 7: case 8:
                estacion="Verano";
                break;
            case 9: case 10: case 11:
                estacion="Otoño";
                break;

            default:
                estacion="mes incorrecto";
        }
    }
}
