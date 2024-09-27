package service;

import models.Estudiante;
import models.Notas;


import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class EstudianteService {
    private Scanner sc;
    private Estudiante estudiante;
    private HashMap<String,Estudiante> listaEstudiante;
    private NotasService notasService;
    private Notas notas;

    public EstudianteService() {
        sc = new Scanner(System.in);
        listaEstudiante = new HashMap<>();
        notasService = new NotasService();
    }

    public void menu(){
        char opcion = 0;
        do {

            System.out.println(" Menu del estudiante ");
            System.out.println( " 1. Crear al estudiante " );
            System.out.println( " 2. Lista de estudiantes " );
            System.out.println( " 3. Promedio del grupo " );
            System.out.println( " 4. Nombres de estudiantes con nota baja " );
            System.out.println( " 5. Nota mas alta y estudiantes que la tienen " );
            System.out.println( " 6. Salir " );


            switch (opcion){
                case '1' -> crearEstudiante();
                case '2' -> listaEstudiante();
                case '3' -> promedioEstudiante();
                case '4' -> estudianteNotaBaja();
                case '5' -> notaMasAlta();
                default -> {
                    opcion = '6';
                    System.out.println( " Gracias por usar esto. Ten unbuen dia =) " );
                }
            }


        }while (opcion != '6');
    }

    private void listaEstudiante(){
        System.out.println(" Lista de estudiantes ");
        for (Estudiante estudiante : listaEstudiante.values()){
            System.out.println(estudiante.getNombre() + " | " + estudiante.getCarrera()+ " | " + estudiante.getCodigo() + " | " + estudiante.getEdad());
        }
    }




    private Estudiante estudianteNotaBaja(){
        System.out.println(" Buscar Estudiante " );

        return null;
    }

    private void crearEstudiante(){
        System.out.println( " ESTUDIANTE " );
        System.out.println( " Ingresa tu nombre " );
        String nombre = sc.next();
        System.out.println("Ingrese el codigo");
        String codigo = sc.next();
        System.out.println(" Ingresa tu edad ");
        String edad = sc.next();
        System.out.println(" Ingresa tu carrera ");
        String carrera = sc.next();
        notas = notasService.tusNotas();
        estudiante = new Estudiante (nombre,codigo,edad,carrera,notas);
        listaEstudiante.put(nombre,estudiante);
    }

    public double calcularPromedio(){

        double accu = 0;

        for(Estudiante estudiante : listaEstudiante.values()){
            accu += estudiante.getNotas().getNotaFinal();

        }
        return accu/listaEstudiante.size();
    }

}
