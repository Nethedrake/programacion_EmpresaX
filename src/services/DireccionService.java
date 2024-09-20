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
    System.out.println("---- Ingresa tu direccion ----");
    System.out.println("Ingrese tu calle");
    String calle = sc.nextLine();
    System.out.println("Ingrese tu numero de casa");
    String numeroCasa = sc.nextLine();
    System.out.println("Ingrese tu barrio");
    String barrio =  sc.nextLine();
    System.out.println("Ingresa tu ciudad");
    String ciudad = sc.nextLine();
    System.out.println("Ingresa tu codigo postal");
    String codigoPostal = sc.nextLine();
    direccion = new Direccion(calle, numeroCasa,barrio,ciudad,codigoPostal);
    return direccion;
}

}
