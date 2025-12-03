package co.edu.sena.semanas.semana02;

import java.util.ArrayList;

public class Accesorio {
    private String tipo;
    private double precio;
    private String marca;

    public Accesorio(String tipo, double precio, String marca) {
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
    }

    public String descripcion() {
        return tipo + " - " + marca + " ($" + precio + ")";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private ArrayList<Accesorio> accesorios = new ArrayList<>();

    public void agregarAccesorio(Accesorio accesorio) {
        accesorios.add(accesorio);
    }
    
    public ArrayList<Accesorio> getAccesorios() {
        return accesorios;
    }
 
}