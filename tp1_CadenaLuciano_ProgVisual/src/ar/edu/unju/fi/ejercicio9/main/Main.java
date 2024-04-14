package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			
			System.out.println("Ingrese los datos del producto " + (i+1) + ":");
			
			Producto producto = new Producto();
			
			System.out.println("Nombre: ");
			producto.setNombre(scanner.nextLine());
			System.out.println("Codigo: ");
			producto.setCodigo(scanner.nextLine());
			System.out.println("Precio: ");
			producto.setPrecio(Double.parseDouble(scanner.nextLine()));
			System.out.println("Descuento (%): ");
			producto.setDescuento(Integer.parseInt(scanner.nextLine()));
			
			System.out.println("\nDatos del producto " + (i+1) + ":");
			System.out.println("Nombre: " + producto.getNombre());
			System.out.println("Codigo: " + producto.getCodigo());
			System.out.println("Precio: $" + producto.getPrecio());
			System.out.println("Descuento: " + producto.getDescuento() + "%");
			System.out.println("Precio con descuento: $" + producto.calcularDescuento());
			System.out.println("\n");
			
		}
		
		scanner.close();
		
	}

}
