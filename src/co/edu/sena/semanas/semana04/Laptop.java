package co.edu.sena.semanas.semana04;

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
        super.mostrarInfo();
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
    }

    @Override
    public double mostrarPrecio() {
        return precio * 1.15; // Aumenta el precio en un 15% ya que es una laptop
    }
}
