package co.edu.sena.semanas.semana04;

public class ElectronicProduct {
    protected String marca;
    protected String modelo;
    protected double precio;

    public ElectronicProduct(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio= precio;
    }

    public void mostrarInfo() {
        System.out.println("Información del Producto Electrónico:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
    }

    public double mostrarPrecio() {
        return precio;
    }

}
