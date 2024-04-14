package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {
	
	/*
	 * 	Dentro del paquete creado para el ejercicio crear la clase Main que contenga el método main().
		Declare las variables necesarias para solicitar al usuario que ingrese por consola un número 
		entero que esté comprendido entre [1,9], mostrar por consola la tabla de multiplicar 
		correspondiente al número ingresado. (usar la estructura de control iterativa for)
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        do {
        	
            System.out.print("Ingrese un número entre 1 y 9: ");
            numero = scanner.nextInt();
            
        } while (numero < 1 || numero > 9);
        
        System.out.println("Tabla de multiplicar del " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
        	
            System.out.println(numero + " x " + i + " = " + (numero * i));
            
        }
        
        scanner.close();
		
	}
}
