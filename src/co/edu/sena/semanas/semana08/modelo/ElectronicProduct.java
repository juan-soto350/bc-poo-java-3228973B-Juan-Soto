package co.edu.sena.semanas.semana08.modelo;

import java.util.ArrayList;
import co.edu.sena.semanas.semana08.excepcion.PrecioInvalidoException;

public abstract class ElectronicProduct {
    protected String marca;
    protected String modelo;
    protected double precio;
    protected String id;

    private static ArrayList<ElectronicProduct> productos = new ArrayList<>();

    public ElectronicProduct(String marca, String modelo, double precio) throws PrecioInvalidoException {
        if (precio < 0) {
            throw new PrecioInvalidoException("El precio no puede ser negativo");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Método abstracto para mostrar información (polimorfismo)
    public abstract void mostrarInfo();

    // Método abstracto para obtener precio (puede variar según el tipo de producto)
    public abstract double obtenerPrecio();

    // Método polimórfico para buscar producto con precio menor a 100
    public static ElectronicProduct buscarProductoPorPrecio() {
        for (ElectronicProduct p : productos) {
            if (p.obtenerPrecio() < 100) {
                return p;
            }
        }
        return null;
    }

    // Método polimórfico para buscar producto por marca
    public static ElectronicProduct buscarProductoPorMarca(String marca) {
        for (ElectronicProduct p : productos) {
            if (p.getMarca().equalsIgnoreCase(marca)) {
                return p;
            }
        }
        return null;
    }

    // Método polimórfico para buscar producto por modelo
    public static ElectronicProduct buscarProductoPorModelo(String modelo) {
        for (ElectronicProduct p : productos) {
            if (p.getModelo().equalsIgnoreCase(modelo)) {
                return p;
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }

    // Agregar producto al catálogo
    public static void agregarProducto(ElectronicProduct producto) {
        productos.add(producto);
    }

    // Obtener todos los productos
    public static ArrayList<ElectronicProduct> obtenerProductos() {
        return productos;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

}
