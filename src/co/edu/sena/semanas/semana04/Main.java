package co.edu.sena.semanas.semana04;

public class Main {
    public static void main(String[] args) {

    ElectronicProduct[] ElectronicProducts = new ElectronicProduct[2];

        ElectronicProducts[0] = new Laptop("HP", "Pavilion 15", 2800000, 16, 512);
        ElectronicProducts[1] = new Smartphone("Samsung", "Galaxy S24", 4500000, 6.7, 5000);

        for (ElectronicProduct product : ElectronicProducts) {
            product.mostrarInfo();
            System.out.println("Precio con impuesto: " + product.mostrarPrecio());
            System.out.println("---------------------------");
        }
    }
}
