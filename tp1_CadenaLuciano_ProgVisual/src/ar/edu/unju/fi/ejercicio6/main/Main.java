package ar.edu.unju.fi.ejercicio6.main;

import java.util.Scanner;
import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		System.out.println("Ingrese el DNI: ");
		persona1.setDni(scanner.nextLine());
		System.out.println("Ingrese el nombre: ");
		persona1.setNombre(scanner.nextLine());
		System.out.println("Ingrese el la fecha de nacimiento (yyyy-mm-dd): ");
		persona1.setfechaNacimiento(LocalDate.parse(scanner.nextLine()));
		
		System.out.println("Ingrese el DNI: ");
		String dni = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese el la fecha de nacimiento (yyyy-mm-dd): ");
		LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println("Ingrese la provincia: ");
		String provincia = scanner.nextLine();
		
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
		
		System.out.println("Ingrese el DNI: ");
		dni = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		nombre = scanner.nextLine();
		System.out.println("Ingrese el la fecha de nacimiento (yyyy-mm-dd): ");
		fechaNacimiento = LocalDate.parse(scanner.nextLine());
		
		Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
		
		System.out.println("\n Datos de la persona 1: ");
		persona1.mostrarDatos();
		System.out.println("\n Datos de la persona 2: ");
		persona2.mostrarDatos();
		System.out.println("\n Datos de la persona 3: ");
		persona3.mostrarDatos();
		
		scanner.close();
		
	}

}
