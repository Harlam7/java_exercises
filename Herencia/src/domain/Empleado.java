package domain;

public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
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

//soobrescribir el comportamiento heredado
    public String toStrig() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado(idEmpleado)=").append(idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", nombre=").append(this.nombre);
        sb.append('}');
        return sb.toString();
    }

}
