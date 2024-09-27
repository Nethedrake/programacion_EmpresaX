package models;

public class Notas{
    private double nota1;
    private double nota2;
    private double nota3;
    private double examenFinal;
    private double notaFinal;

    public Notas(double nota1, double nota2, double nota3, double examenFinal, double notaFinal) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.examenFinal = examenFinal;
        this.notaFinal = notaFinal;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", examenFinal=" + examenFinal +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
