package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Persona{
    //atributos
    private List<Empleado> empleados;
    private List<Tarea> tareasAsignadas;

    //constructor
    public Gerente(String nombre){
        super(nombre);
        tareasAsignadas = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    //getters y setters
    //empleados
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    //tareasAsignadas
    public List<Tarea> getTareasAsignadas() {
        return tareasAsignadas;
    }

    public void setTareasAsignadas(List<Tarea> tareasAsignadas) {
        this.tareasAsignadas = tareasAsignadas;
    }

    //METODOS
    //EL GERENTE CALCULA SU SALARIO
    @Override
    public Integer calcularSalario() {
        return tareasAsignadas.size()*75;
    }

    //AGREGAR UN EMPLEADO A LA LISTA DE EMPLEADOS
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    //AGREGAR UNA TAREA ASIGNADA A UN EMPLEADO A LA LISTA DE TAREAS ASIGNADAS
    public void agregarTareaAsignada(Tarea tarea){
        tareasAsignadas.add(tarea);
    }

    //ASIGNAR LA TAREA QUE SE PUSO EN LA LISTA DE TAREAS ASIGNADAS, A UN EMPLEADO
    public void asignar(Tarea tarea,Empleado empleado){
        tareasAsignadas.add(tarea);
        //agregarTareaAsignada(tarea); es lo mismo
        //luego de asignada, se la saca de la lista de tareas asignadas, es decir:
        eliminarTareaPendiente(tarea);
        //en este momento el empleado se agrega esa tarea asignada a su lista de tareas pendientes
        empleado.agregarTareaPendiente(tarea);

    }

}
