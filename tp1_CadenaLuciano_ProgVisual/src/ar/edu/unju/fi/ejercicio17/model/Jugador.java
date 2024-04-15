package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private String posicion;
	
	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, double estatura,
			double peso, String posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public double getEstatura() {
		return estatura;
	}

	public double getPeso() {
		return peso;
	}

	public String getPosicion() {
		return posicion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + "]";
	}
	
	public int calcularEdad() {
		
		LocalDate ahora = LocalDate.now();
		int edad = ahora.getYear() - fechaNacimiento.getYear();
		
		if(fechaNacimiento.getMonthValue() > ahora.getMonthValue() || (fechaNacimiento.getMonthValue() == ahora.getMonthValue()
                && fechaNacimiento.getDayOfMonth() > ahora.getDayOfMonth())) {
			
			edad--;
			
		}
		
		return edad;
		
	}
	
}
