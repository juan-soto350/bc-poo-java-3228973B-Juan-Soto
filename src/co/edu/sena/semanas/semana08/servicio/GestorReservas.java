package co.edu.sena.semanas.semana08.servicio;

import co.edu.sena.semanas.semana08.modelo.Reserva;
import co.edu.sena.semanas.semana08.modelo.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorReservas {
    
    private Map<String, Reserva> reservasPorCodigo = new HashMap<>();
    private List<Reserva> historial = new ArrayList<>();
    private Map<String, List<Reserva>> reservasPorCliente = new HashMap<>();

    public void agregar(Reserva r) {
        if (reservasPorCodigo.containsKey(r.getCodigo())) {
            throw new IllegalArgumentException("Ya existe reserva con código: " + r.getCodigo());
        }
        reservasPorCodigo.put(r.getCodigo(), r);
        historial.add(r);

        String idCliente = r.getCliente().getId();
        reservasPorCliente.computeIfAbsent(idCliente, k -> new ArrayList<>()).add(r);
    }

    public Reserva buscarPorCodigo(String codigo) {
        return reservasPorCodigo.get(codigo);
    }

    public boolean existe(String codigo) {
        return reservasPorCodigo.containsKey(codigo);
    }

    public Reserva eliminar(String codigo) {
        Reserva r = reservasPorCodigo.remove(codigo);
        if (r != null) {
            historial.remove(r);
            List<Reserva> delCliente = reservasPorCliente.get(r.getCliente().getId());
            if (delCliente != null) {
                delCliente.remove(r);
                if (delCliente.isEmpty()) {
                    reservasPorCliente.remove(r.getCliente().getId());
                }
            }
        }
        return r;
    }

    public int cantidad() {
        return historial.size();
    }

    public List<Reserva> obtenerReservasDeCliente(String idCliente) {
        return reservasPorCliente.getOrDefault(idCliente, new ArrayList<>());
    }

    public List<Reserva> filtrarPorPrecio(double min, double max) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : historial) {
            if (r.getPrecio() >= min && r.getPrecio() <= max) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    public List<Reserva> filtrarPorMes(int mes, int anio) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva r : historial) {
            if (r.getFecha().getMonthValue() == mes && r.getFecha().getYear() == anio) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    public double calcularTotalVentas() {
        double total = 0;
        for (Reserva r : historial) {
            total += r.getPrecio();
        }
        return total;
    }

    public double calcularPromedioPrecio() {
        if (historial.isEmpty()) return 0;
        return calcularTotalVentas() / historial.size();
    }

    public Reserva obtenerReservaMasCara() {
        if (historial.isEmpty()) return null;
        Reserva maxima = historial.get(0);
        for (Reserva r : historial) {
            if (r.getPrecio() > maxima.getPrecio()) {
                maxima = r;
            }
        }
        return maxima;
    }

    public Map<String, Integer> contarPorTipo() {
        Map<String, Integer> conteo = new HashMap<>();
        for (Reserva r : historial) {
            String tipo = r.getTipo();
            conteo.put(tipo, conteo.getOrDefault(tipo, 0) + 1);
        }
        return conteo;
    }

    public List<Reserva> obtenerHistorial() {
        return new ArrayList<>(historial);
    }
}
