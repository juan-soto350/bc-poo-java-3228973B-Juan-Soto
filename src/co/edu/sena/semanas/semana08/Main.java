package co.edu.sena.semanas.semana08;

import co.edu.sena.semanas.semana08.modelo.Cliente;
import co.edu.sena.semanas.semana08.modelo.Reserva;
import co.edu.sena.semanas.semana08.servicio.GestorReservas;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorReservas gestor = new GestorReservas();
        Scanner scanner = new Scanner(System.in);

        int opcion = -1;
        do {
            System.out.println("\n=== SISTEMA DE GESTION ===");
            System.out.println("1. Agregar reserva");
            System.out.println("2. Buscar por codigo");
            System.out.println("3. Listar todas");
            System.out.println("4. Filtrar por precio");
            System.out.println("5. Ver estadisticas");
            System.out.println("6. Eliminar reserva");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Opcion invalida");
                continue;
            }
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarReserva(gestor, scanner);
                    break;
                case 2:
                    buscarReserva(gestor, scanner);
                    break;
                case 3:
                    listarTodas(gestor);
                    break;
                case 4:
                    filtrarPorPrecio(gestor, scanner);
                    break;
                case 5:
                    mostrarEstadisticas(gestor);
                    break;
                case 6:
                    eliminarReserva(gestor, scanner);
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    private static void agregarReserva(GestorReservas gestor, Scanner scanner) {
        System.out.print("Codigo: ");
        String codigo = scanner.nextLine();

        System.out.print("ID Cliente: ");
        String idCliente = scanner.nextLine();

        System.out.print("Nombre Cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Precio: ");
        double precio;
        try {
            precio = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Precio invalido");
            return;
        }

        System.out.print("Fecha (YYYY-MM-DD): ");
        LocalDate fecha;
        try {
            fecha = LocalDate.parse(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Fecha invalida");
            return;
        }

        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();

        Cliente cliente = new Cliente(idCliente, nombreCliente);
        Reserva r = new Reserva(codigo, cliente, precio, fecha, tipo);
        try {
            gestor.agregar(r);
            System.out.println("Reserva agregada");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void buscarReserva(GestorReservas gestor, Scanner scanner) {
        System.out.print("Codigo a buscar: ");
        String codigo = scanner.nextLine();
        Reserva r = gestor.buscarPorCodigo(codigo);
        if (r != null) {
            System.out.println("Encontrada: " + r);
        } else {
            System.out.println("No existe reserva con codigo: " + codigo);
        }
    }

    private static void listarTodas(GestorReservas gestor) {
        List<Reserva> todas = gestor.obtenerHistorial();
        if (todas.isEmpty()) {
            System.out.println("No hay reservas");
            return;
        }
        for (Reserva r : todas) {
            System.out.println(r);
        }
    }

    private static void filtrarPorPrecio(GestorReservas gestor, Scanner scanner) {
        System.out.print("Precio minimo: ");
        double min;
        try {
            min = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Valor minimo invalido");
            return;
        }
        System.out.print("Precio maximo: ");
        double max;
        try {
            max = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Valor maximo invalido");
            return;
        }
        List<Reserva> resultado = gestor.filtrarPorPrecio(min, max);
        if (resultado.isEmpty()) {
            System.out.println("Sin resultados");
            return;
        }
        for (Reserva r : resultado) {
            System.out.println(r);
        }
    }

    private static void mostrarEstadisticas(GestorReservas gestor) {
        System.out.println("\n=== ESTADISTICAS ===");
        System.out.println("Total reservas: " + gestor.cantidad());
        System.out.println("Total ventas: $" + String.format("%.2f", gestor.calcularTotalVentas()));
        System.out.println("Promedio: $" + String.format("%.2f", gestor.calcularPromedioPrecio()));
        Reserva maxima = gestor.obtenerReservaMasCara();
        if (maxima != null) {
            System.out.println("Mas cara: " + maxima);
        }
        System.out.println("\nConteo por tipo:");
        Map<String, Integer> conteo = gestor.contarPorTipo();
        for (Map.Entry<String, Integer> entry : conteo.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void eliminarReserva(GestorReservas gestor, Scanner scanner) {
        System.out.print("Codigo a eliminar: ");
        String codigo = scanner.nextLine();
        Reserva r = gestor.eliminar(codigo);
        if (r != null) {
            System.out.println("Eliminada: " + r);
        } else {
            System.out.println("No existe reserva con codigo: " + codigo);
        }
    }
}
