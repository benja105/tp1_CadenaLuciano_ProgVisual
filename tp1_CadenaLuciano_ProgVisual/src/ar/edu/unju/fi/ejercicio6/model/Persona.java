package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	public Persona() {
		
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}

	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getfechaNacimiento() {
		return fechaNacimiento;
	}

	public void setfechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public int calcularEdad() {
		
		LocalDate hoy = LocalDate.now();
		Period periodo = Period.between(this.fechaNacimiento, hoy);
		return periodo.getYears();
		
	}
	
	public boolean verificarEdad() {
		
		return calcularEdad() >= 18;
		
	}
	
	public void mostrarDatos() {
		
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		System.out.println("Provincia: " + provincia);
		System.out.println("Edad: " + calcularEdad());
		if(verificarEdad()) {
			
			System.out.println("La persona es mayor de edad");
			
		}else {
			
			System.out.println("La persona es menor de edad");
			
		}
		
	}
	
}
