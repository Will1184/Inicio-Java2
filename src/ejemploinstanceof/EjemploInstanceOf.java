package ejemploinstanceof;

public class EjemploInstanceOf {
    public static void main(String[] args) {
        FiguraGeometrica figura;
        figura = new Elipse();

        //Determina solo un tipo el que corresponde con la jerarquia
        determinaTipo(figura);

        //Determina todos los tipos posibles
        System.out.println("\nTodos sus tipos");
        determinaTodosLosTipos(figura);


       /* System.out.println("");
        figura = new Circulo();
        determinaTipo(figura);

        System.out.println("");
        figura = new Triangulo();
        determinaTipo(figura);

        System.out.println("");
        figura = new Rectangulo();
        determinaTipo(figura);*/


        //Mas ejemplo
    }

    private static void determinaTipo(FiguraGeometrica figura) {

        if (figura instanceof Elipse) {
            System.out.println("Es una Elipse");
        } else if (figura instanceof Circulo) {
            System.out.println("Es un Circulo");
        } else if (figura instanceof FiguraGeometrica) {
            System.out.println("Es una Figura geometrica");
        } else if (figura instanceof Object) {
            System.out.println("Es un Objeto");
        }else{
            System.out.println("No es una figura geometrica");
        }

    }

    private static void determinaTodosLosTipos(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            System.out.println("Es una Elipse");
        }
        if (figura instanceof Circulo) {
            System.out.println("Es un Circulo");
        }
        if (figura instanceof FiguraGeometrica) {
            System.out.println("Es una Figura geometrica");
        }
        if (figura instanceof Object) {
            System.out.println("Es un Objeto");
        }
    }
}

