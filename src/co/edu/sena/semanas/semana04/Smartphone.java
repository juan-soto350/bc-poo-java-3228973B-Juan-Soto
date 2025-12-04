package co.edu.sena.semanas.semana04;

public class Smartphone extends ElectronicProduct {
    private double tamañoDePantalla;
    private int Batería;

    public Smartphone(String marca, String modelo, double precio, double tamañoDePantalla, int Batería) {
        super(marca, modelo, precio);
        this.tamañoDePantalla = tamañoDePantalla;
        this.Batería = Batería;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Pantalla: " + tamañoDePantalla + " pulgadas");
        System.out.println("Batería: " + Batería + " mAh");
    }

    @Override
    public double mostrarPrecio() {
        return precio * 1.10; // Aumenta el precio en un 10% ya que es un smartphone
    }
}
