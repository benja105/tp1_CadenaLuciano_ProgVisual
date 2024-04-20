package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] nombres = new String[5];
		
		System.out.println("Ingrese 5 nombres de personas: ");
		for(int i=0; i<nombres.length; i++) {
			
			System.out.println("Ingrese el nombre de la persona para la posicion " + i + ": ");
			nombres[i] = scanner.nextLine();
			
		}
		
		System.out.println("\nNombres guardados en el arreglo: ");
		int j=0;
		while(j<nombres.length) {
			System.out.println((j+1) + "-" + nombres[j]);
			j++;
		}
		
		System.out.println("\nTamaño del arreglo: " + nombres.length);
		
		byte indice;
		
		do {
			
			System.out.println("Ingrese el indice del elemento a eliminar [1-5]: ");
			indice = scanner.nextByte();
			
		}while(indice<1 || indice>5);
		
		while(indice<nombres.length) {
			
			nombres[indice - 1] = nombres[indice];
			indice++;
			
		}
		
		nombres[4] = "";
		
		System.out.println("\nArreglo despues de eliminar el elemento: ");
		
		for(int k=0; k<nombres.length-1; k++) {
			
			System.out.println((k+1) + "-" + nombres[k]);
			
		}
		
		scanner.close();
		
	}
	
}
