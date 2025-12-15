package co.edu.sena.semanas.semana08.modelo;

import java.time.LocalDate;

public class Reserva {
    private String codigo;
    private Cliente cliente;
    private double precio;
    private LocalDate fecha;
    private String tipo;

    public Reserva(String codigo, Cliente cliente, double precio, LocalDate fecha, String tipo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.precio = precio;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return codigo + " - " + tipo + " - $" + String.format("%.2f", precio) + " - " + cliente + " - " + fecha;
    }
}
