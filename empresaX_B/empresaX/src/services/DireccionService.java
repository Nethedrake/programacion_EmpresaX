package services;

import models.Direccion;

import java.util.Scanner;

public class DireccionService {
    private Scanner sc;
    private Direccion direccion;

    public DireccionService() {
        sc = new Scanner(System.in);
    }
    public Direccion crearDireccion(){
        System.out.println("Ingrese la calle");
        String calle = sc.nextLine();
        System.out.println("Ingrese el numero de la casa");
        String numeroCasa = sc.nextLine();
        System.out.println("Ingrese el barrio");
        String barrio = sc.nextLine();
        System.out.println("Ingrese la ciudad");
        String ciudad = sc.nextLine();
        System.out.println("Ingrese el codigo postal");
        String codigoPostal = sc.nextLine();
        direccion = new Direccion(calle,numeroCasa,barrio,ciudad,codigoPostal);
        return direccion;
    }

}
