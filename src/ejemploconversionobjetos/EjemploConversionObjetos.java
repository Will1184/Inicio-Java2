package ejemploconversionobjetos;

public class EjemploConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado =new Escritor("Roy",15000,TipoEscritura.CLASICO);
        imprimirDetalles(empleado);

        empleado=new Gerente("Laura",18000,"Sistemas");
        imprimirDetalles(empleado);

    }
        private static void imprimirDetalles(Empleado empleado){
        String resultado=null;
            System.out.println("\nDetales: "+empleado.obtenerDetalles());
            if (empleado instanceof Escritor){
                Escritor escritor= (Escritor) empleado;
                resultado=escritor.getTipoDeEscrituraEnTexto();
                resultado=((Escritor)empleado).tipoEscritura.getDescripcion();
                System.out.println("Resultado TipoEscritura: "+resultado);
                System.out.println();
            } else if (empleado instanceof Gerente) {
                Gerente gerente=(Gerente) empleado;
                resultado=gerente.getDepartamento();
                resultado=((Gerente)empleado).getDepartamento();
                System.out.println("Resultado Departamento: "+resultado);
                System.out.println();
            }


        }
}
