package co.edu.sena.semanas.semana07;

import co.edu.sena.semanas.semana07.excepciones.*;
import co.edu.sena.semanas.semana07.modelo.*;
import co.edu.sena.semanas.semana07.servicio.*;

public class Main {
    public static void main(String[] args) {
        // Aquí puedes crear instancias de Laptop y Smartphone,
        // agregarlas al inventario y probar los métodos del servicio.
        ElectronicService servicio = new ElectronicService();

        // manejo de excepciones de precio invalido
        try {
            Laptop laptop1 = new Laptop("LAP123", "Dell", "XPS 13", 999.99, 16, 512);
            servicio.agregarProducto(laptop1);
            new Smartphone("SMP456", "Apple", "iPhone 13", -799.99, 6.1, 3279);
        } catch (PrecioInvalidoException e) {
            System.out.println("Error con el precio del el producto: " + e.getMessage());
        }

        // manejo de excepciones de producto no encontrado
        try {
            Laptop laptop2 = new Laptop("LAP789", "Apple", "MacBook Pro", 1299.99, 32, 1024);
            servicio.agregarProducto(laptop2);

            ElectronicProduct productoBuscado = servicio.buscarProductoPorId("LAP000");
            System.out.println("Producto encontrado: " + productoBuscado.getModelo());
        } catch (PrecioInvalidoException | ProductoNoEncontradoException e) {
            System.out.println("Error al buscar el producto: " + e.getMessage());
        }

        // manejo de excepciones al eliminar producto no existente
        try {
            servicio.eliminarProductoPorId("SMP999");
        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error al eliminar el producto: " + e.getMessage());
        }

        // mostrar todo
        System.out.println("Inventario actual:");
        for (ElectronicProduct producto : servicio.getInventario()) {
            System.out.println("- " + producto.getModelo() + " (ID: " + producto.getId() + ")");
        }

        System.out.println("Fin del programa.");

    }
}
