package co.edu.sena.semanas.semana05;

public class Laptop extends ElectronicProduct {
    private int ram;
    private int almacenamiento;

    public Laptop(String marca, String modelo, double precio, int ram, int almacenamiento) {
        super(marca, modelo, precio);
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== LAPTOP ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
    }

    @Override
    public double obtenerPrecio() {
        // Aumenta el precio en un 15% por ser una laptop
        return precio * 1.15;
    }

    public int getRam() {
        return ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }
}
