package foreach;

public class ForEach {
    public static void main(String[] args) {
        Persona [] personas={ new Persona("Juan"), new Persona("Karla")};

        for (Persona p: personas){
            String nombre = p.getNombre();
            System.out.println("Nombre persona: "+nombre);
        }

        System.out.println(Persona.getContadorPersonas());
        int[] edades={15,20,41,50};

        for (int edad: edades){
            System.out.println("Edad: "+edad);
        }
    }
}
