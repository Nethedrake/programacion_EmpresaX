import services.EmpleadoService;

public class Aplicacion {

    public static void main(String[] args) {
        EmpleadoService empleadoService = new EmpleadoService();
        empleadoService.menu();


        /*Scanner sc = new Scanner(System.in);
        models.Empleado empleado = new models.Empleado();
        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.next();
        empleado.setNombreEmpleado(nombre);
        System.out.println("Ingrese las horas trabajadas");
        int horas  = sc.nextInt();
        empleado.setHorasTrabajadas(horas);
        System.out.println("Ingrese el valor de la hora");
        double valor = sc.nextDouble();
        empleado.setValorHora(valor);
        empleado.calcularSueldo();
        System.out.println("Cheque generado a "+empleado.getNombreEmpleado()+
                " por el valor de: "+empleado.getSueldo());*/
    }

}









