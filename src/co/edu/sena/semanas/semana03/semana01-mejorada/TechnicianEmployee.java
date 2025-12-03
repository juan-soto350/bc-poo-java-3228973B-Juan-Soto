// Aqui lo puse como comentario para que no me aprezca comoo error  package co.edu.sena.semanas.semana03;

public class TechnicianEmployee {
    private String nombre;
    private String cargo;
    private String especialidadTecnica;
    private double salario;
    private int reparacionesRealizadas;

    // GETTERS y SETTERS
    public TechnicianEmployee(String nombre, String cargo, String especialidadTecnica, double salario, int reparacionesRealizadas) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.especialidadTecnica = especialidadTecnica;
        this.salario = salario;
        this.reparacionesRealizadas = reparacionesRealizadas;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public String getEspecialidadTecnica() {
        return especialidadTecnica;
    }
    public double getSalario() {
        return salario;
    }
    public int getReparacionesRealizadas() {
        return reparacionesRealizadas;
    }
    
    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setEspecialidadTecnica(String especialidadTecnica) {
        this.especialidadTecnica = especialidadTecnica;
    }
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("El salario no puede ser negativo.");
        }

    }
    public void setReparacionesRealizadas(int reparacionesRealizadas) {
        this.reparacionesRealizadas = reparacionesRealizadas;
    }


}