package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[8];
		
		for(int i=0; i<numeros.length; i++) {
			
			System.out.println("Ingrese el numero para la posicion " + i + ": ");
			numeros[i] = scanner.nextInt();
			
		}
		
		System.out.println("Los valores ingresados son: ");
		for(int i=0; i<numeros.length; i++) {
			
			System.out.println("Posicion " + i + ": " + numeros[i]);
			
		}
		
		scanner.close();
		
	}
	
}
