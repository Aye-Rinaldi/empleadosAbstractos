package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
    //atributos
    private String nombre;
    private String dni;
    private String domicilio;
    private List<Tarea> tareasPendientes;

    //constructor
    public Persona(String nombre){
        this.nombre = nombre;
        tareasPendientes = new ArrayList<>();
    }

    //getters y setters
    //nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //dni
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    //domicilio
    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    //tareas pendientes
    public List<Tarea> getTareasPendientes() {
        return tareasPendientes;
    }

    public void setTareasPendientes(List<Tarea> tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }


    //TRAER LA PROXIMA TAREA
    public Tarea getProximaTareaPendiente(){
        return (tareasPendientes.size()>0) ? tareasPendientes.get(0) : null;
    }

    //AGREGAR UNA TAREA A LA LISTA DE TAREAS PENDIENTES
    public void agregarTareaPendiente(Tarea tarea){
        tareasPendientes.add(tarea);
    }

    //ELIMINAR TAREA PENDIENTE
    protected void eliminarTareaPendiente(Tarea tarea){
        tareasPendientes.remove(tarea);
    }

    //MOSTRAR LA LISTA DE TAREAS (ASIGNADAS Y PENDIENTES)
    public void mostrarTareas(List<Tarea> tareas){
        for (Tarea t:tareas){
            System.out.println("/"+"Tarea Nro: "+t.getId());
        }
        System.out.println("/");
    }

    //CALCULAR SALARIO
    public abstract Integer calcularSalario();
}
