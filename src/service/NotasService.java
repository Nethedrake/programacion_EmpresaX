package service;

import models.Notas;

import java.util.Scanner;

public class NotasService {
    private Scanner sc;
    private Notas notas;

    public NotasService() {
        sc = new Scanner(System.in);
    }
    public Notas tusNotas(){
        System.out.println(" Ingresa tus parciales ");
        System.out.println(" Ingresa tu primer parcial ");
        double nota1 = sc.nextDouble();
        System.out.println(" Ingresa tu primer parcial ");
        double nota2 = sc.nextDouble();
        System.out.println(" Ingresa tu primer parcial ");
        double nota3 = sc.nextDouble();
        System.out.println(" Ingresa tu Examen Final ");
        double examenFinal = sc.nextDouble();

        double nota70 = (((nota1+nota2+nota3)/3)*0.7);
        double nota30 = examenFinal * 0.3;

        double notaFinal = (nota70+nota30);

        notas = new Notas(nota1,nota2,nota3,examenFinal,notaFinal);
        return notas;
    }
}
