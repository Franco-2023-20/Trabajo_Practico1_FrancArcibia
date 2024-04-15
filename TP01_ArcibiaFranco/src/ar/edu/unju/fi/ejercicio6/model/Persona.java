package ar.edu.unju.fi.ejercicio6.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Persona {

private int dni;
private String nombre;
private LocalDate Fecha;
private String provincia;
public Persona() {

}
public Persona(int dni, String nombre, LocalDate fecha, String provincia) {
	this.dni = dni;
	this.nombre = nombre;
	this.Fecha = fecha;
	this.provincia = provincia;
}
public long getedad() {
	LocalDate fechactual = LocalDate.now();
	Period dias = Period.between(this.getFecha(), fechactual);
	return dias.getYears();
			}

public String getmensaje () {
	if (this.getedad()>17) {
		String mensaje = "Es mayor de edad";
return mensaje;
	}	
else { 
		String mensaje = "Es menor de edad";
		return mensaje;
}
	
}
public String getDatos() {
return this.dni+" - "+this.nombre+" - "+this.Fecha+" - "+this.provincia+" - "+this.getedad()+ " - "+this.getmensaje();
}

public int getDni() {
	return dni;
}

public void setDni(int dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public LocalDate getFecha() {
	return Fecha;
}

public void setFecha(LocalDate fecha) {
	Fecha = fecha;
}

public String getProvincia() {
	return provincia;
}

public void setProvincia(String provincia) {
	this.provincia = provincia;
}
	

}

