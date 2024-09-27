package models;

public class Estudiante {
    private String codigo;
    private String nombre;
    private String edad;
    private String carrera;
    private Notas notas;

    public Estudiante(String codigo, String nombre, String edad, String carrera, Notas notas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.notas = notas;
    }

    public String getCodigo() {return codigo;}

    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getEdad() {return edad;}

    public void setEdad(String edad) {this.edad = edad;}

    public String getCarrera() {return carrera;}

    public void setCarrera(String carrera) {this.carrera = carrera;}

    public Notas getNotas() {return notas;}

    public void setNotas(Notas notas) {this.notas = notas;}

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", carrera='" + carrera + '\'' +
                ", notas=" + notas +
                '}';
    }
}
