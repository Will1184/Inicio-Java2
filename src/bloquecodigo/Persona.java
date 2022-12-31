package bloquecodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;

    static {
        //Iniciador el idPersona desde  el valor 10
        contadorPersona = 10;
        //Aqui no se pueden usar ariables no estaticas
        //idPersonas=1
        System.out.println("EJECUTA EL BLOQUE ESTATICO");
    }

    //BLOQUE DE CODIGO PARA INICIALIZAR ATRIBUTOS DE LA CLASE
    //EL BLOQUE SE COPIA A CADA ONSTRUCTOR DE LA CLASE
    {
        System.out.println("EJECUTA EL BLOQUE INICIALIZADOR");
        idPersona=++contadorPersona;
    }
    public Persona() {
        System.out.println("EJECUTA EL CONSTRUCTOR");
    }

    public int getIdPersona() {
        return idPersona;
    }
}
