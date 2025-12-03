// Aqui lo puse como comentario para que no me aprezca comoo error  package co.edu.sena.semanas.semana03;

public class ElectronicProduct {
    private String marca;
    private String modelo;
    private double precio;
    private int cantidadStock;
    private int mesesGarantia;

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }
    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
    }
    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock >= 0) {
            this.cantidadStock = cantidadStock;
        } else {
            throw new IllegalArgumentException("La cantidad en stock no puede ser negativa.");
        }
    }
    public void setMesesGarantia(int mesesGarantia) {
        if (mesesGarantia >= 0) {
            this.mesesGarantia = mesesGarantia;
        } else {
            throw new IllegalArgumentException("Los meses de garantía no pueden ser negativos.");
        }
    }
    
}