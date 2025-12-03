// Aqui lo puse como comentario para que no me aprezca comoo error  package co.edu.sena.semanas.semana03;

// Aqui lo puse como comentario para que no me aprezca comoo error import java.util.ArrayList;

public class Accesorio {
    private String tipo;
    private double precio;
    private String marca;

    public Accesorio(String tipo, double precio, String marca) {
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
    }
    // Getters
    public String getTipo() {
        return tipo;
    }
    public double getPrecio() {
        return precio;
    }
    public String getMarca() {
        return marca;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }


}