package autoboxing;

public class AutoBoxingUnBoxing {
    private int i;
    public int j;
    int k;
    protected int l;

    public static void main(String[] args) {
        Integer enteroObj=10;
        Float flotanteObj=15.2F;
        Double doubleObj=40.1;

        System.out.println("AutoBoxing");
        System.out.println("Enterto Obj: "+enteroObj.intValue());
        System.out.println("Flotante Obj: "+flotanteObj.floatValue());
        System.out.println("Double Obj: "+ doubleObj.doubleValue());

        int entero= enteroObj;
        float flotante= flotanteObj;
        double doble= doubleObj;

        System.out.println("\nUnboxing");
        System.out.println("Entero: "+entero);
        System.out.println("Flotante: "+flotante);
        System.out.println("Double: "+doble);

    }
}
