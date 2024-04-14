package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de n: ");
		int n = scanner.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		
		double sumatoria = calculadora.calcularSumatoria();
		System.out.println("La sumatoria de los numeros de 1 a " + n + " es: " + sumatoria);
		
		long productoria = calculadora.calcularProductoria();
		System.out.println("La productoria de los numeros de 1 a " + n + " es: " + productoria);
		
		scanner.close();
		
	}

}
