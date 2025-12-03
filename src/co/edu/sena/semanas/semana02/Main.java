package co.edu.sena.semanas.semana02;
public class Main {
    public static void main(String[] args) {

        Proveedor samsung = new Proveedor("Samsung", "contacto@samsung.com", "Corea del Sur");
        Proveedor apple = new Proveedor("Apple Inc.", "soporte@apple.com", "Estados Unidos");

        Accesorio cargador = new Accesorio("Cargador Rápido", 95000, "Samsung");
        Accesorio audifonos = new Accesorio("Audífonos Bluetooth", 120000, "Apple");

        ProductoElectronico galaxy = new ProductoElectronico("Galaxy S24", 5200000, samsung);
        ProductoElectronico iphone = new ProductoElectronico("iPhone 15", 6200000, apple);

        galaxy.agregarAccesorio(cargador);
        iphone.agregarAccesorio(audifonos);

        InventarioTechStore inventario = new InventarioTechStore();
        inventario.agregarProducto(galaxy);
        inventario.agregarProducto(iphone);

        inventario.mostrarInventario();
        System.out.println("Total productos: " + inventario.cantidadProductos());
    }
}


