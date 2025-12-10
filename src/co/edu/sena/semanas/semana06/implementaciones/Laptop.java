package co.edu.sena.semanas.semana06.implementaciones;

import co.edu.sena.semanas.semana06.Abstractas.ElectronicProduct;
import co.edu.sena.semanas.semana06.interfaces.Connectable;

public class Laptop extends ElectronicProduct implements Connectable {
    private int ramGb;
    private int almacenamientoGb;
    private boolean gpuDedicada;
    private boolean conectado;

    public Laptop(String marca, String modelo, double precio, int ramGb, int almacenamientoGb, boolean gpuDedicada) {
        super(marca, modelo, precio);
        this.ramGb = ramGb;
        this.almacenamientoGb = almacenamientoGb;
        this.gpuDedicada = gpuDedicada;
        this.conectado = false;
    }

    @Override
    public double calcularPrecioFinal() {
        double impuestos = precio * 0.19; // IVA ejemplo
        double cargoGpu = gpuDedicada ? 150.0 : 0.0;
        return precio + impuestos + cargoGpu;
    }

    @Override
    public String obtenerDescripcion() {
        return String.format("Laptop %s %s - %dGB RAM, %dGB almacenamiento%s",
                marca, modelo, ramGb, almacenamientoGb, gpuDedicada ? ", GPU dedicada" : "");
    }

    @Override
    public void conectarWifi(String ssid) {
        System.out.println("Conectando laptop a WiFi: " + ssid);
        this.conectado = true;
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }
}
