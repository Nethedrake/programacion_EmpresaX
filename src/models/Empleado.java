package models;

public class Empleado {
    private String codigo;
    private String nombreEmpleado;
    private int horasTrabajadas;
    private double valorHora;
    private double sueldo;
    private Direccion direccion;

    public Empleado() {
        this.nombreEmpleado = "Sin definir";
        this.horasTrabajadas = 0;
        this.valorHora = 0;
    }


    public Empleado(String codigo, String nombreEmpleado, int horasTrabajadas, double valorHora, double sueldo, Direccion direccion) {
        this.codigo = codigo;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Direccion getDireccion() {return direccion;}

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codigo='" + codigo + '\'' +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", valorHora=" + valorHora +
                ", sueldo=" + sueldo +
                ", direccion=" + direccion +
                '}';
    }
}
