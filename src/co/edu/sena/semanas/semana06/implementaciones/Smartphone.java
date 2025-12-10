package co.edu.sena.semanas.semana06.implementaciones;

import co.edu.sena.semanas.semana06.Abstractas.ElectronicProduct;
import co.edu.sena.semanas.semana06.interfaces.Recargable;
import co.edu.sena.semanas.semana06.interfaces.Connectable;

public class Smartphone extends ElectronicProduct implements Recargable, Connectable {
    private int nivelBateria; // 0 - 100
    private boolean tiene5G;
    private boolean conectado;

    public Smartphone(String marca, String modelo, double precio, boolean tiene5G, int bateriaInicial) {
        super(marca, modelo, precio);
        this.tiene5G = tiene5G;
        this.nivelBateria = Math.max(0, Math.min(100, bateriaInicial));
        this.conectado = false;
    }

    @Override
    public double calcularPrecioFinal() {
        double impuestos = precio * 0.19;
        double cargo5G = tiene5G ? 75.0 : 0.0;
        return precio + impuestos + cargo5G;
    }

    @Override
    public String obtenerDescripcion() {
        return String.format("Smartphone %s %s - %s, batería %d%%",
                marca, modelo, tiene5G ? "5G" : "4G", nivelBateria);
    }

    // Rechargeable
    @Override
    public void cargar(int porcentaje) {
        if (porcentaje <= 0) return;
        nivelBateria = Math.min(100, nivelBateria + porcentaje);
        System.out.println("Cargando teléfono: +" + porcentaje + "% -> " + nivelBateria + "%");
    }

    @Override
    public boolean bateriaBaja() {
        return nivelBateria < 20;
    }

    @Override
    public int nivelBateria() {
        return nivelBateria;
    }

    // Connectable
    @Override
    public void conectarWifi(String ssid) {
        System.out.println("Conectando smartphone a WiFi: " + ssid);
        this.conectado = true;
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }
}
