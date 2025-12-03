package co.edu.sena.semanas.semana01;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== TECHSTORE - SISTEMA DE GESTIÓN ===");
        System.out.println("Tienda de Tecnología - Unicentro Bogotá\n");

        // ===== PRODUCTOS ELECTRÓNICOS =====
        System.out.println("--- CATÁLOGO DE PRODUCTOS ---\n");

        ElectronicProduct producto1 = new ElectronicProduct("Apple", "MacBook Pro M3", 9500000, 5, 12);
        ElectronicProduct producto2 = new ElectronicProduct("Samsung", "Galaxy S24 Ultra", 5200000, 12, 24);
        ElectronicProduct producto3 = new ElectronicProduct("HP", "Pavilion 15", 2800000, 8, 12);
        ElectronicProduct producto4 = new ElectronicProduct("Lenovo", "ThinkPad X1", 6500000, 3, 24);
        ElectronicProduct producto5 = new ElectronicProduct("Dell", "XPS 13", 4900000, 6, 12);

        System.out.println("Producto 1:");
        producto1.mostrarInformacion();
        System.out.println();

        System.out.println("Producto 2:");
        producto2.mostrarInformacion();
        System.out.println();

        System.out.println("Producto 3:");
        producto3.mostrarInformacion();
        System.out.println();

        System.out.println("Producto 4:");
        producto4.mostrarInformacion();
        System.out.println();

        System.out.println("Producto 5:");
        producto5.mostrarInformacion();
        System.out.println();

        // ===== DEMOSTRACIÓN DE MÉTODOS =====
        System.out.println("--- CÁLCULO DE DESCUENTOS ---\n");

        System.out.println("Producto: " + producto1.getMarca() + " " + producto1.getModelo());
        System.out.println("Precio original: " + String.format("$%,.2f", producto1.getPrecio()));
        double precioConDescuento = producto1.calcularPrecioConDescuento(20);
        System.out.println("Precio con 20% descuento: " + String.format("$%,.2f", precioConDescuento));
        System.out.println("¿Está disponible?: " + (producto1.estaDisponible() ? "Sí" : "No"));
        System.out.println();

        System.out.println("Producto: " + producto2.getMarca() + " " + producto2.getModelo());
        System.out.println("Precio original: " + String.format("$%,.2f", producto2.getPrecio()));
        double precioConDescuento2 = producto2.calcularPrecioConDescuento(15);
        System.out.println("Precio con 15% descuento: " + String.format("$%,.2f", precioConDescuento2));
        System.out.println();


        // ===== EMPLEADOS TÉCNICOS =====
        System.out.println("--- REGISTRO DE EMPLEADOS TÉCNICOS ---\n");

        TechnicianEmployee tecnico1 = new TechnicianEmployee("Jorge Martínez", "Técnico Senior", "Reparación de computadores", 3800000, 0);
        TechnicianEmployee tecnico2 = new TechnicianEmployee("Ana López", "Técnico Junior", "Reparación de smartphones", 2500000, 0);

        System.out.println("Técnico 1:");
        tecnico1.mostrarInformacion();
        System.out.println("¿Es técnico senior?: " + (tecnico1.esTecnicoSenior() ? "Sí" : "No"));
        System.out.println();

        System.out.println("Técnico 2:");
        tecnico2.mostrarInformacion();
        System.out.println("¿Es técnico senior?: " + (tecnico2.esTecnicoSenior() ? "Sí" : "No"));
        System.out.println();

        // ===== REGISTRO DE REPARACIONES =====
        System.out.println("--- REGISTRO DE REPARACIONES ---\n");

        System.out.println("Técnico: " + tecnico1.getNombre());
        tecnico1.registrarReparacion();
        tecnico1.registrarReparacion();
        tecnico1.registrarReparacion();
        System.out.println("Reparaciones realizadas: " + tecnico1.getReparacionesRealizadas());
        System.out.println();

        System.out.println("Técnico: " + tecnico2.getNombre());
        tecnico2.registrarReparacion();
        System.out.println("Reparaciones realizadas: " + tecnico2.getReparacionesRealizadas());
        System.out.println();

        System.out.println("=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
