package ar.edu.unju.fi.ejercicio1;

public class Main {
	
	/*
	 * 	Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
		Declare 5 variables de tipo entero para almacenar valores numéricos.
		Asigne valores numéricos a cada una de las variables.
		Calcule el promedio y guarde el resultado en otra variable. Muestre por consola el resultado
		obtenido.
		Ejemplo:
		8, 5, 1, 20, 9
		El promedio es: 8.6
	 */
	
	public static void main(String[] args) {
		
		int n1 = 8, n2 = 5, n3 = 1, n4 = 20, n5 = 9;
		
		double promedio = (n1+n2+n3+n4+n5) / 5.0;
		
		System.out.println("El promedio es: " + promedio);
		
	}
}
