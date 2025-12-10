package co.edu.sena.semanas.semana06;

import co.edu.sena.semanas.semana06.Abstractas.ElectronicProduct;
import co.edu.sena.semanas.semana06.implementaciones.Laptop;
import co.edu.sena.semanas.semana06.implementaciones.Smartphone;
import co.edu.sena.semanas.semana06.interfaces.Recargable;
import co.edu.sena.semanas.semana06.interfaces.Connectable;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN Semana06: Abstracción e Interfaces ===\n");

        ElectronicProduct[] productos = new ElectronicProduct[2];
        productos[0] = new Laptop("Dell", "Inspiron-15", 1200.0, 16, 512, true);
        productos[1] = new Smartphone("Samsung", "A54", 800.0, true, 35);

        System.out.println("--- Polimorfismo con clase abstracta ---");
        for (ElectronicProduct p : productos) {
            p.mostrarInformacion();
            System.out.println("Descripción: " + p.obtenerDescripcion());
            System.out.println(String.format("Precio final: $%.2f", p.calcularPrecioFinal()));
            System.out.println();
        }

        System.out.println("--- Interfaces y múltiples implementaciones ---");
        Smartphone telefono = (Smartphone) productos[1];

        // Como Rechargeable (Recargable)
        Recargable rec = telefono;
        System.out.println("Nivel de batería actual: " + rec.nivelBateria() + "%");
        if (rec.bateriaBaja()) {
            System.out.println("Batería baja, cargando...");
            rec.cargar(50);
        } else {
            System.out.println("Batería suficiente");
        }

        // Como Connectable (Conectable)
        Connectable conn = telefono;
        conn.conectarWifi("Red_Campus_SENA");
        System.out.println("¿Teléfono conectado?: " + conn.estaConectado());

        // Laptop también es Conectable
        Connectable laptopConn = (Connectable) productos[0];
        laptopConn.conectarWifi("Red_Campus_SENA");
        System.out.println("¿Laptop conectada?: " + laptopConn.estaConectado());

        System.out.println("\n=== FIN DE LA DEMOSTRACIÓN ===");
    }
}
