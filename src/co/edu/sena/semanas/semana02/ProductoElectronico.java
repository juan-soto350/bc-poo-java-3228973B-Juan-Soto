package co.edu.sena.semanas.semana02;

import java.util.ArrayList;

public class ProductoElectronico {
    private String nombre;
    private double precio;
    private Proveedor proveedor; 
    private ArrayList<Accesorio> accesorios; 

    public ProductoElectronico(String nombre, double precio, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.accesorios = new ArrayList<>();
    }

    public void agregarAccesorio(Accesorio acc) {
        accesorios.add(acc);
    }

    public String resumen() {
        return nombre + " - $" + precio + " | Proveedor: " + proveedor.getNombre();
    }
}

class InventarioTechStore {
    private ArrayList<ProductoElectronico> productos;

    public InventarioTechStore() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoElectronico p) {
        productos.add(p);
    }

    public void mostrarInventario() {
        for (ProductoElectronico p : productos) {
            System.out.println(p.resumen());
        }
    }

    public int cantidadProductos() {
        return productos.size();
    }
}
