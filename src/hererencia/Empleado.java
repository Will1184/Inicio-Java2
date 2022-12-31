package hererencia;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contenedorEmpleados;

    public Empleado() {
    }


    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++contenedorEmpleados;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContenedorEmpleados() {
        return contenedorEmpleados;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +"Contador: "+this.getContenedorEmpleados()+
                '}';
    }
}
