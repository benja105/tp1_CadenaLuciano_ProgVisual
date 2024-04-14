package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int tamaño;
		
		do {
			
			System.out.println("Ingrese un numero entero en el rango [3, 10]: ");
			tamaño = scanner.nextInt();
			
		}while(tamaño<3 || tamaño>10);
		
		int[] numeros = new int[tamaño];
		
		for(int i=0; i<numeros.length; i++) {
			
			System.out.println("Ingrese un numero entero para la posicion " + i + ": ");
			numeros[i] = scanner.nextInt();
			
		}
		
		int suma=0;
		
		System.out.println("\nLos valores ingresados son: ");
		for(int i=0; i<numeros.length; i++) {
			
			System.out.println("Posicion " + i + ": " + numeros[i]);
			suma += numeros[i];
			
		}
		
		System.out.println("La suma de todos los valores es: " + suma);
		
		scanner.close();
		
	}
	
}
