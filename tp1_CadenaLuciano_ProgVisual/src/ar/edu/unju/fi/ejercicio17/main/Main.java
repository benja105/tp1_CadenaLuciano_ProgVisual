package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    altaJugador(scanner, jugadores);
                    break;
                case 2:
                    mostrarDatosJugador(scanner, jugadores);
                    break;
                case 3:
                    mostrarJugadoresOrdenados(jugadores);
                    break;
                case 4:
                    modificarJugador(scanner, jugadores);
                    break;
                case 5:
                    eliminarJugador(scanner, jugadores);
                    break;
                case 6:
                    mostrarCantidadTotal(jugadores);
                    break;
                case 7:
                    mostrarCantidadPorNacionalidad(scanner, jugadores);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 8);

        scanner.close();
		
	}
	
	private static void altaJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = scanner.next();
            System.out.print("Ingrese la fecha de nacimiento del jugador (YYYY-MM-DD): ");
            String fechaNacimientoStr = scanner.next();
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
            System.out.print("Ingrese la nacionalidad del jugador: ");
            String nacionalidad = scanner.next();
            System.out.print("Ingrese la estatura del jugador: ");
            double estatura = scanner.nextDouble();
            System.out.print("Ingrese el peso del jugador: ");
            double peso = scanner.nextDouble();
            System.out.print("Ingrese la posición del jugador: ");
            String posicion = scanner.next();

            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);
            System.out.println("Jugador agregado correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: ¡Debe ingresar un valor válido!");
            scanner.next();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

	private static void mostrarDatosJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = scanner.next();

            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                    System.out.println(jugador);
                    System.out.println("Edad: " + jugador.calcularEdad() + " años");
                    return;
                }
            }
            System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
        try {
            if (jugadores.isEmpty()) {
                System.out.println("No hay jugadores para mostrar.");
                return;
            }

            jugadores.sort((j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));

            System.out.println("Jugadores ordenados por apellido:");
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void modificarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = scanner.next();

            for (Jugador jugador : jugadores) {
                if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                    System.out.print("Ingrese la nueva fecha de nacimiento del jugador: ");
                    String fechaNacimientoStr = scanner.next();
                    LocalDate nuevafechaNacimiento = LocalDate.parse(fechaNacimientoStr);
                    System.out.print("Ingrese la nueva nacionalidad del jugador: ");
                    String nuevaNacionalidad = scanner.next();
                    System.out.print("Ingrese la nueva estatura del jugador: ");
                    double nuevaEstatura = scanner.nextDouble();
                    System.out.print("Ingrese la nueva peso del jugador: ");
                    double nuevoPeso = scanner.nextDouble();
                    System.out.print("Ingrese la nueva posicion del jugador: ");
                    String nuevaPosicion = scanner.next();
                    jugador = new Jugador(nombre, apellido, nuevafechaNacimiento,
                            nuevaNacionalidad, nuevaEstatura, nuevoPeso, nuevaPosicion);
                    System.out.println("Datos del jugador modificados correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	
    private static void eliminarJugador(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            if (jugadores.isEmpty()) {
                System.out.println("No hay jugadores para eliminar.");
                return;
            }

            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = scanner.next();
            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = scanner.next();

            Iterator<Jugador> iter = jugadores.iterator();
            while (iter.hasNext()) {
                Jugador jugador = iter.next();
                if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
                    iter.remove();
                    System.out.println("Jugador eliminado correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarCantidadTotal(ArrayList<Jugador> jugadores) {
        try {
            System.out.println("Cantidad total de jugadores: " + jugadores.size());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarCantidadPorNacionalidad(Scanner scanner, ArrayList<Jugador> jugadores) {
        try {
            if (jugadores.isEmpty()) {
                System.out.println("No hay jugadores para mostrar.");
                return;
            }

            System.out.print("Ingrese la nacionalidad: ");
            String nacionalidad = scanner.next();
            int cantidad = 0;
            for (Jugador jugador : jugadores) {
                if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                    cantidad++;
                }
            }
            System.out.println("Cantidad de jugadores de nacionalidad " + nacionalidad + ": " + cantidad);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
