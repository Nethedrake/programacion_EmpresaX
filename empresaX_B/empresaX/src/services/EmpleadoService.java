package services;

import models.Direccion;
import models.Empleado;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpleadoService {
    private Scanner sc;
    private Empleado empleado;
    private HashMap<String, Empleado> listaEmpleado;
    private DireccionService direccionService;
    private Direccion direccion;

    public EmpleadoService() {
        sc = new Scanner(System.in);
        listaEmpleado = new HashMap<>();
        direccionService = new DireccionService();
    }

    public void menu() {
        char opcion;
        do {
            System.out.println("*** MENU ***");
            System.out.println("1 - CREAR EMPLEADO");
            System.out.println("2 - MODIFICAR EMPLEADO");
            System.out.println("3 - BUSCAR EMPLEADO");
            System.out.println("4 - LISTAR EMPLEADOS");
            System.out.println("s - Ingrese s para salir");
            System.out.print("Ingrese una opcion del menu: ");
            opcion = sc.next().charAt(0);

            switch (opcion) {
                case '1' -> crearEmpleado();
                case '2' -> modificarEmpleado();
                case '3' -> buscarEmpleado();
                case '4' -> listarEmpleados();
                case 's' -> System.out.println("Gracias por usar este menu");
                default -> System.out.println("Opcion no valida. Intente nuevamente.");
            }
        } while (opcion != 's');
    }

    private void listarEmpleados() {
        System.out.println("LISTA DE EMPLEADOS");
        for (Empleado empleado : listaEmpleado.values()) {
            System.out.println(empleado.getNombreEmpleado() + " | " + empleado.getSueldo() + " | " + empleado.getDireccion());
        }
    }

    private Empleado buscarEmpleado() {
        System.out.println("BUSCAR EMPLEADO");
        System.out.print("Ingrese el codigo del empleado: ");
        String codigo = sc.next();
        empleado = listaEmpleado.get(codigo);
        if (empleado != null) {
            System.out.println(empleado);
        } else {
            System.out.println("No se encontró el empleado.");
        }
        return empleado;
    }

    private void modificarEmpleado() {
        System.out.println("MODIFICAR EMPLEADO");
        empleado = buscarEmpleado();
        if (empleado != null) {
            try {
                System.out.print("Ingrese el nuevo nombre: ");
                empleado.setNombreEmpleado(sc.next());

                System.out.print("Ingrese las horas trabajadas: ");
                int horas = sc.nextInt();
                empleado.setHorasTrabajadas(horas);

                System.out.print("Ingrese el valor de la hora: ");
                double valor = sc.nextDouble();
                empleado.setValorHora(valor);

                empleado.setSueldo(calcularSalario(horas, valor));
                empleado.setDireccion(direccion);
                listaEmpleado.put(empleado.getCodigo(), empleado);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                sc.nextLine();
            }
        } else {
            System.out.println("No se encontró el empleado.");
        }
    }

    private void crearEmpleado() {
        System.out.println("CREAR EMPLEADO");

        try {
            System.out.println("---- Empleado nuevo ----");
            System.out.print("Ingrese el codigo: ");
            String codigo = sc.next();

            System.out.print("Ingrese el nombre: ");
            String nombre = sc.next();

            System.out.print("Ingrese numero de horas trabajadas: ");
            int horas = sc.nextInt();

            System.out.print("Ingrese el valor de la hora: ");
            double valor = sc.nextDouble();

            direccion = direccionService.crearDireccion();

            empleado = new Empleado(codigo, nombre, horas, valor, calcularSalario(horas, valor), direccion);
            listaEmpleado.put(codigo, empleado);
            System.out.println("Empleado creado exitosamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número válido.");
            sc.nextLine();
        }
    }

    private double calcularSalario(int horas, double valor) {
        return horas * valor;
    }
}








