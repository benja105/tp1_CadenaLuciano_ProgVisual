package ar.edu.unju.fi.ejercicio2;

public class Main {
	
	/*
	 * 	Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
		Declare variables que permitan almacenar los siguientes datos en el lenguaje Java:
		 El nombre de un país.
		 La edad de una persona.
		 La altura de un edificio.
		 El precio de un producto de supermercado.
		 Número de teléfono.
		 El cálculo de coseno de 0.5
		Asigne valores a cada variable y muéstrelas por consola.
	*/
	
	public static void main(String[] args) {
		
		String pais = "Argentina";
		int edad = 18;
		float alturaEdificio = 1.70f;
		double precioProducto = 100.0;
		double calcCos = Math.cos(0.5);
		String numTel = "3887738903";
		
		System.out.println("Pais: " + pais + " Edad: " + edad + " Altura edificio: " + alturaEdificio + " Precio producto: " + precioProducto + " Calculo cos: " + calcCos + " Numero telefono: " + numTel);
		
	}
}
