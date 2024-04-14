package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
	
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int calcularEdad() {
        Calendar now = GregorianCalendar.getInstance();
        int edad = now.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (fechaNacimiento.get(Calendar.MONTH) > now.get(Calendar.MONTH) ||
            (fechaNacimiento.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&
             fechaNacimiento.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }
    
    public String determinarSignoZodiaco() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            return "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else {
            return "Capricornio";
        }
    }
    
    
    public String determinarEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        
        switch (mes) {
            case 12:
            case 1:
            case 2:
                return "Invierno";
            case 3:
            case 4:
            case 5:
                return "Primavera";
            case 6:
            case 7:
            case 8:
                return "Verano";
            case 9:
            case 10:
            case 11:
                return "Otoño";
            default:
                return "Estación no determinada";
        }
    }
    
}

