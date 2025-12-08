package co.edu.sena.semanas.semana05;

public class Smartphone extends ElectronicProduct {
    private double pantalla;
    private int bateria;

    public Smartphone(String marca, String modelo, double precio, double pantalla, int bateria) {
        super(marca, modelo, precio);
        this.pantalla = pantalla;
        this.bateria = bateria;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== SMARTPHONE ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
        System.out.println("Pantalla: " + pantalla + " pulgadas");
        System.out.println("Batería: " + bateria + " mAh");
    }

    @Override
    public double obtenerPrecio() {
        // Aumenta el precio en un 10% por ser un smartphone
        return precio * 1.10;
    }

    public double getPantalla() {
        return pantalla;
    }

    public int getBateria() {
        return bateria;
    }
}
