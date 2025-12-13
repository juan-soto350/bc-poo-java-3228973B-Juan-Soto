package co.edu.sena.semanas.semana07.servicio;

import co.edu.sena.semanas.semana07.excepciones.*;
import co.edu.sena.semanas.semana07.modelo.*;
import java.util.ArrayList;

public class ElectronicService {
    private ArrayList<ElectronicProduct> inventario;

    public ElectronicService() {
        this.inventario = new ArrayList<>();
    }

    public void agregarProducto(ElectronicProduct producto) {
        inventario.add(producto);
    }

    public ElectronicProduct buscarProductoPorId(String id) throws ProductoNoEncontradoException {
        for (ElectronicProduct producto : inventario) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        throw new ProductoNoEncontradoException("Producto con ID " + id + " no encontrado.");
    }

    public void eliminarProductoPorId(String id) throws ProductoNoEncontradoException {
        ElectronicProduct producto = buscarProductoPorId(id);
        inventario.remove(producto);
    }

    public ArrayList<ElectronicProduct> getInventario() {
        return inventario;
    }
}