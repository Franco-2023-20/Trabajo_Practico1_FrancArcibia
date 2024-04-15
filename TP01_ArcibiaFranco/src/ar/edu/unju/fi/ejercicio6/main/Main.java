package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Calendar;

import ar.edu.unju.fi.ejercicio6.model.Persona;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona(11111,"Franco",LocalDate.of(2002,06,01),"Jujuy"); 
	
		publicarpersona(persona1);
		Persona persona2 = new Persona();
		persona2.setDni(22222);
		persona2.setNombre("Caro");
	    persona2.setFecha(LocalDate.of(2006,06,01));
	    persona2.setProvincia("Salta");
	    publicarpersona(persona2);
		
	}
	public static void publicarpersona (Persona persona) {
		System.out.println(persona.getDatos());	

	}
	
	
}
	

	
