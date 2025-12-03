package co.edu.sena.semanas.semana01;

/**
 * Clase que representa un Producto Electrónico en TechStore
 * Dominio: Tienda de Tecnología
 * Estudiante: Juan Esteban Soto Perez
 * Ficha: 3228973B
 */
public class ElectronicProduct {
    private String marca;
    private String modelo;
    private double precio;
    private int cantidadStock;
    private int mesesGarantia;

    // Constructor
    public ElectronicProduct(String marca, String modelo, double precio, int cantidadStock, int mesesGarantia) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.mesesGarantia = mesesGarantia;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + String.format("$%,.2f", precio));
        System.out.println("Stock disponible: " + cantidadStock + " unidades");
        System.out.println("Garantía: " + mesesGarantia + " meses");
    }

    public double calcularPrecioConDescuento(int porcentajeDescuento) {
        double descuento = precio * porcentajeDescuento / 100.0;
        return precio - descuento;
    }

    public boolean estaDisponible() {
        return cantidadStock > 0;
    }

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
}
