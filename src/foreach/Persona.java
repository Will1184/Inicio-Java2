package foreach;

public class Persona {
    private final int idPersonas;
    private String nombre;
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.idPersonas = ++contadorPersonas;
        this.nombre = nombre;
    }

    public int getIdPersonas() {
        return idPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
}
