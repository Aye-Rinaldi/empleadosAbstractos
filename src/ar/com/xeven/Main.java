package ar.com.xeven;

public class Main {

    public static void main(String[] args) {

        //GENERO GERENTES Y EMPLEADOS
        Gerente gerente = new Gerente("Isabel");

        gerente.agregarEmpleado(new Empleado("Margarita"));
        gerente.agregarEmpleado(new Empleado("Carlos"));
        gerente.agregarEmpleado(new Empleado("Anna"));

        //GENERO TAREAS
        gerente.agregarTareaPendiente(new Tarea(1));
        gerente.agregarTareaPendiente(new Tarea(2));
        gerente.agregarTareaPendiente(new Tarea(3));
        gerente.agregarTareaPendiente(new Tarea(4));
        gerente.agregarTareaPendiente(new Tarea(5));
        gerente.agregarTareaPendiente(new Tarea(6));
        gerente.agregarTareaPendiente(new Tarea(7));

        //ASIGNO TAREAS AL AZAR
        while (gerente.getTareasPendientes().size() > 0){
            Double i = Math.floor(Math.random()*3); //agarra 3 empleados i al azar a los cuales asignarles las tareas
            gerente.asignar(gerente.getProximaTareaPendiente(),gerente.getEmpleados().get(i.intValue()));
        }


        //PARA CADA EMPLEADO PROCESO LAS TAREAS
        for (Empleado e: gerente.getEmpleados()){
            while (e.getTareasPendientes().size()>0){
                e.ejecutar(e.getProximaTareaPendiente());
            }
        }

        //AGREGO TAREAS PARA QUE QUEDEN PENDIENTES PARA TESTEO
        gerente.agregarTareaPendiente(new Tarea(8));
        gerente.agregarTareaPendiente(new Tarea(9));
        gerente.agregarTareaPendiente(new Tarea(10));
        gerente.asignar(gerente.getProximaTareaPendiente(), gerente.getEmpleados().get(0));

        //HAGO LISTADO DE TAREAS REALIZADAS Y SUELDOS
        System.out.println("Tareas asignadas del Gerente: "+gerente.getNombre());
        gerente.mostrarTareas(gerente.getTareasAsignadas());
        System.out.println("Tareas Pendientes: "+gerente.getTareasPendientes().size());
        System.out.println("Sueldo a cobrar: "+gerente.calcularSalario());
        System.out.println("----------------------------------------------");

        for (Empleado e: gerente.getEmpleados()){
            System.out.println("Tareas pendientes del empleado: "+e.getNombre());
            gerente.mostrarTareas(e.getTareasPendientes());
            System.out.println("Tareas ejecutadas ejecutadas del empleado: "+e.getTareasEjecutadas().size());
            System.out.println("Sueldo a cobrar: "+e.calcularSalario());
            System.out.println("--------------------------------------");
        }

    }
}
