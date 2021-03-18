package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona{
    //atributos
    private  List<Tarea> tareasEjecutadas;

    //constructor
    public Empleado(String nombre){
        super(nombre);
        tareasEjecutadas = new ArrayList<>();
    }

    //getters y setters
    public void setTareasEjecutadas(List<Tarea> tareasEjecutadas){
        this.tareasEjecutadas = tareasEjecutadas;
    }

    public List<Tarea> getTareasEjecutadas(){
        return  tareasEjecutadas;
    }


    //METODOS
    //EL EMPLEADO CALCULA SU SALARIO
    @Override
    public Integer calcularSalario() {
        return tareasEjecutadas.size()*150;
    }

    //AGREGAR UNA TAREA A LA LISTA DE TAREAS EJECUTADAS
    public void agregarTareaEjecutada(Tarea tarea){
        tareasEjecutadas.add(tarea);
    }

    //EJECUTAR LA TAREA Y LUEGO ELIMINARLA
    public void ejecutar(Tarea tarea){
        tareasEjecutadas.add(tarea);
        eliminarTareaPendiente(tarea);
    }
}
