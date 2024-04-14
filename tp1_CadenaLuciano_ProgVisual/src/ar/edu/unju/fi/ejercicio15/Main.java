package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int tamaño;
		
		do {
			
			System.out.println("Ingrese un numero entero en el rango [5, 10]: ");
			tamaño = scanner.nextInt();
			scanner.nextLine();
			
		}while(tamaño<5 || tamaño>10);
		
		String[] nombres = new String[tamaño];
		
		for(int i=0; i<nombres.length; i++) {
			
			System.out.println("Ingrese el nombre de la persona para la posicion " + i + ": ");
			nombres[i] = scanner.nextLine();
			
		}
		
		System.out.println("\n Los nombres ingresados son (comenzando por la primera posicion (0)): ");
		for(int i=0; i<nombres.length; i++) {
			
			System.out.println("Posicion " + i + ": " + nombres[i]);
			
		}
		
		System.out.println("\nContenido del arreglo (comenzando por la ultima posicion)");
		for(int i=nombres.length-1; i>=0; i--) {
			
			System.out.println("Posicion " + i + ": " + nombres[i]);
			
		}
		
		scanner.close();
		
	}
	
}
