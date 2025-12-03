package co.edu.sena.semanas.semana01;

public class TechnicianEmployee {
    private String nombre;
    private String cargo;
    private String especialidadTecnica;
    private double salario;
    private int reparacionesRealizadas;

    // Constructor
    public TechnicianEmployee(String nombre, String cargo, String especialidadTecnica, double salario, int reparacionesRealizadas) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.especialidadTecnica = especialidadTecnica;
        this.salario = salario;
        this.reparacionesRealizadas = reparacionesRealizadas;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Especialidad técnica: " + especialidadTecnica);
        System.out.println("Salario: " + String.format("$%,.2f", salario));
        System.out.println("Reparaciones realizadas: " + reparacionesRealizadas);
    }

    public void registrarReparacion() {
        reparacionesRealizadas++;
    }

    public boolean esTecnicoSenior() {
        return salario >= 3_500_000;
    }

    // Getters
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
}
