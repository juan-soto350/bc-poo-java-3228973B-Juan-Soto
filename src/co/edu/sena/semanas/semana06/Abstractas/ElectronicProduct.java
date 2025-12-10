package co.edu.sena.semanas.semana06.Abstractas;

public abstract class ElectronicProduct {
    protected String marca;
    protected String modelo;
    protected double precio;

    public ElectronicProduct(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Método abstracto: cada producto calcula su precio final de forma distinta
    public abstract double calcularPrecioFinal();

    // Método abstracto: descripción específica del producto
    public abstract String obtenerDescripcion();

    // Método concreto reutilizable
    public void mostrarInformacion() {
        System.out.println("--- Producto Electrónico ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println(String.format("Precio base: $%.2f", precio));
    }
}
