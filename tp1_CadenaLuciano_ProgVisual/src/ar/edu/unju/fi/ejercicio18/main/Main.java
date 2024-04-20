package ar.edu.unju.fi.ejercicio18.main;

import ar.edu.unju.fi.ejercicio18.model.Pais;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();
        
        paises.add(new Pais(1, "Argentina"));
        paises.add(new Pais(2, "Brasil"));
        paises.add(new Pais(3, "Chile"));

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destino turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    altaDestinoTuristico(scanner, destinos, paises);
                    break;
                case 2:
                    mostrarDestinosTuristicos(destinos);
                    break;
                case 3:
                    modificarPaisDestinoTuristico(scanner, destinos, paises);
                    break;
                case 4:
                    destinos.clear();
                    System.out.println("ArrayList de destinos turísticos limpiado.");
                    break;
                case 5:
                    eliminarDestinoTuristico(scanner, destinos);
                    break;
                case 6:
                    mostrarDestinosOrdenados(destinos);
                    break;
                case 7:
                    mostrarTodosLosPaises(paises);
                    break;
                case 8:
                    mostrarDestinosPorPais(scanner, destinos);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 9);

        scanner.close();
    }

    private static void altaDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
        try {
            System.out.print("Ingrese el código del destino turístico: ");
            int codigo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese el nombre del destino turístico: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el precio del destino turístico: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de días del destino turístico: ");
            int cantidadDias = scanner.nextInt();

            System.out.println("Países disponibles:");
            for (Pais pais : paises) {
                System.out.println(pais.getCodigo() + " - " + pais.getNombre());
            }
            System.out.print("Ingrese el código del país del destino turístico: ");
            int codigoPais = scanner.nextInt();

            Pais paisSeleccionado = null;
            for (Pais pais : paises) {
                if (pais.getCodigo() == codigoPais) {
                    paisSeleccionado = pais;
                    break;
                }
            }

            if (paisSeleccionado != null) {
                destinos.add(new DestinoTuristico(codigo, nombre, precio, paisSeleccionado, cantidadDias));
                System.out.println("Destino turístico agregado correctamente.");
            } else {
                System.out.println("Código de país no válido.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarDestinosTuristicos(ArrayList<DestinoTuristico> destinos) {
        try {
            if (destinos.isEmpty()) {
                System.out.println("No hay destinos turísticos para mostrar.");
            } else {
                System.out.println("Destinos turísticos:");
                for (DestinoTuristico destino : destinos) {
                    System.out.println(destino);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void modificarPaisDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
        try {
            System.out.print("Ingrese el código del destino turístico: ");
            int codigoDestino = scanner.nextInt();
            scanner.nextLine();

            DestinoTuristico destinoSeleccionado = null;
            for (DestinoTuristico destino : destinos) {
                if (destino.getCodigo() == codigoDestino) {
                    destinoSeleccionado = destino;
                    break;
                }
            }

            if (destinoSeleccionado != null) {
                System.out.println("Países disponibles:");
                for (Pais pais : paises) {
                    System.out.println(pais.getCodigo() + " - " + pais.getNombre());
                }
                System.out.print("Ingrese el nuevo código de país: ");
                int nuevoCodigoPais = scanner.nextInt();

                Pais nuevoPais = null;
                for (Pais pais : paises) {
                    if (pais.getCodigo() == nuevoCodigoPais) {
                        nuevoPais = pais;
                        break;
                    }
                }

                if (nuevoPais != null) {
                    destinoSeleccionado.setPais(nuevoPais);
                    System.out.println("País del destino turístico modificado correctamente.");
                } else {
                    System.out.println("Código de país no válido.");
                }
            } else {
                System.out.println("Código de destino turístico no válido.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void eliminarDestinoTuristico(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
        try {
            if (destinos.isEmpty()) {
                System.out.println("No hay destinos turísticos para eliminar.");
                return;
            }

            System.out.print("Ingrese el código del destino turístico a eliminar: ");
            int codigoEliminar = scanner.nextInt();

            Iterator<DestinoTuristico> iter = destinos.iterator();
            while (iter.hasNext()) {
                DestinoTuristico destino = iter.next();
                if (destino.getCodigo() == codigoEliminar) {
                    iter.remove();
                    System.out.println("Destino turístico eliminado correctamente.");
                    return;
                }
            }
            System.out.println("No se encontró ningún destino turístico con ese código.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
        try {
            if (destinos.isEmpty()) {
                System.out.println("No hay destinos turísticos para mostrar.");
                return;
            }

            ArrayList<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinos);
            Collections.sort(destinosOrdenados, (d1, d2) -> d1.getNombre().compareToIgnoreCase(d2.getNombre()));

            System.out.println("Destinos turísticos ordenados por nombre:");
            for (DestinoTuristico destino : destinosOrdenados) {
                System.out.println(destino);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarTodosLosPaises(ArrayList<Pais> paises) {
        try {
            if (paises.isEmpty()) {
                System.out.println("No hay países para mostrar.");
                return;
            }

            System.out.println("Todos los países:");
            for (Pais pais : paises) {
                System.out.println(pais);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void mostrarDestinosPorPais(Scanner scanner, ArrayList<DestinoTuristico> destinos) {
        try {
            if (destinos.isEmpty()) {
                System.out.println("No hay destinos turísticos para mostrar.");
                return;
            }

            System.out.print("Ingrese el código de país para mostrar los destinos turísticos: ");
            int codigoPais = scanner.nextInt();

            System.out.println("Destinos turísticos del país:");
            for (DestinoTuristico destino : destinos) {
                if (destino.getPais().getCodigo() == codigoPais) {
                    System.out.println(destino);
                }else {
                	System.out.println("Este país no tiene destinos turisticos para mostrar.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
		
	}
	
}
