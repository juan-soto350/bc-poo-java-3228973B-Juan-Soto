package co.edu.sena.semanas.semana08.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import co.edu.sena.semanas.semana08.excepcion.ProductoDuplicadoException;
import co.edu.sena.semanas.semana08.modelo.*;

public class ElectronicService {

    // aqui se usa lista con generics de formca correcta
    private List<ElectronicProduct> productos = new ArrayList<>();

    // aqui se agrega un hashmap para busquedas mas rapidas por id y asi cumpliendo
    // el ejercicio 2
    private Map<String, ElectronicProduct> productoMap = new HashMap<>();

    // Metodo para agregar productos a la lista y al mapa
    public void agregarProducto(ElectronicProduct producto) throws ProductoDuplicadoException {
        for (ElectronicProduct p : productos) {
            if (p.getId().equals(producto.getId())) {
                throw new ProductoDuplicadoException("Producto con ID " + producto.getId() + " ya existe.");
            }
        }
        productos.add(producto);
        productoMap.put(producto.getId(), producto);
    }

    // aqui agrego el metodo para buscar por id usando el hashmap
    public ElectronicProduct buscarPorId(String id) throws ProductoDuplicadoException {
        ElectronicProduct producto = productoMap.get(id);
        if (producto == null) {
            throw new ProductoDuplicadoException("Producto con ID " + id + " no encontrado.");
        }
        return producto;
    }

    // aqui el metodo para eliminar un producto por id
    public void eliminarProducto(String id) throws ProductoDuplicadoException {
        ElectronicProduct producto = buscarPorId(id);
        productos.remove(producto);
        productoMap.remove(id);
    }

    // no puse mas ya que con el id es suficiente

    // aqui se calcula el total de precios de los productos
    public double totalProductos() {
        double total = 0;
        for (ElectronicProduct p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    // aqui se obtiene la lista de productos
    public List<ElectronicProduct> getProductos() {
        return productos;
    }

    // aqui se establece la lista de productos por tipo
    public List<ElectronicProduct> getProductosPorTipo(Class<? extends ElectronicProduct> tipo) {
        List<ElectronicProduct> resultado = new ArrayList<>();
        for (ElectronicProduct p : productos) {
            if (tipo.isInstance(p)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
