package ar.edu.unju.fi.ejercicio12.main;

import ar.edu.unju.fi.ejercicio12.model.Persona;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (formato dd/MM/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1;
        int anio = Integer.parseInt(partesFecha[2]);
        Calendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);
        
        Persona persona = new Persona(nombre, fechaNacimiento);
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + fechaNacimientoStr);
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.determinarSignoZodiaco());
        System.out.println("Estación: " + persona.determinarEstacion());

        scanner.close();
		
	}
	
}
