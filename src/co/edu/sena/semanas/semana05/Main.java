package co.edu.sena.semanas.semana05;

public class Main {
    public static void main(String[] args) {
        // Crear productos polimórficos
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 800, 16, 512);
        Laptop laptop2 = new Laptop("HP", "Pavilion", 60, 8, 256);
        Smartphone phone1 = new Smartphone("Apple", "iPhone 14", 50, 6.1, 3279);
        Smartphone phone2 = new Smartphone("Samsung", "Galaxy S23", 900, 6.2, 4000);

        // Agregar productos al catálogo (polimorfismo en acción)
        ElectronicProduct.agregarProducto(laptop1);
        ElectronicProduct.agregarProducto(laptop2);
        ElectronicProduct.agregarProducto(phone1);
        ElectronicProduct.agregarProducto(phone2);

        System.out.println("=== CATÁLOGO DE PRODUCTOS ===\n");
        
        // Mostrar información de todos los productos (polimorfismo)
        for (ElectronicProduct producto : ElectronicProduct.obtenerProductos()) {
            producto.mostrarInfo();
            System.out.println("Precio final: $" + producto.obtenerPrecio());
            System.out.println();
        }

        System.out.println("=== BÚSQUEDA DE PRODUCTOS ===\n");

        // Buscar producto por precio menor a 100
        ElectronicProduct productoBarato = ElectronicProduct.buscarProductoPorPrecio();
        if (productoBarato != null) {
            System.out.println("Producto con precio < 100:");
            productoBarato.mostrarInfo();
            System.out.println("Precio final: $" + productoBarato.obtenerPrecio());
            System.out.println();
        }

        // Buscar producto por marca
        ElectronicProduct productoMarca = ElectronicProduct.buscarProductoPorMarca("Apple");
        if (productoMarca != null) {
            System.out.println("Producto encontrado por marca 'Apple':");
            productoMarca.mostrarInfo();
            System.out.println();
        }

        // Buscar producto por modelo
        ElectronicProduct productoModelo = ElectronicProduct.buscarProductoPorModelo("Galaxy S23");
        if (productoModelo != null) {
            System.out.println("Producto encontrado por modelo 'Galaxy S23':");
            productoModelo.mostrarInfo();
            System.out.println();
        }
    }
}
