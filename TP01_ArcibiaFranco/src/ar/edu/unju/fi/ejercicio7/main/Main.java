package ar.edu.unju.fi.ejercicio7.main;


import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String respuesta = "s";
		Empleado persona = new Empleado();
		System.out.println("----INGRESAR LOS DATOS PARA UN NUEVO EMPLEADO----");
		System.out.println("ingrese el nombre");
		persona.setNombre(scanner.next());
		System.out.println("ingrese el Apellido");
		persona.setApellido(scanner.next());
		System.out.println("ingrese el Legajo");
	    persona.setLegajo(scanner.next());
	    System.out.println("ingrese el Salario");
	    persona.setSalario(scanner.nextDouble());
	    scanner.close();
	    publicarpersona(persona);
	    
	    Empleado aumento = new Empleado();
	    	//System.out.println("----Desea dar aumento por merito ? S/N----");
	    	//if (respuesta == ) {
	    	aumento.setSalario(persona.getSalario());
	    	System.out.println("Semodifico el salario");
	    //}
	   //// else 
	    
	    	//System.out.println("No se modifico el salario");
	    
	    publicaraumento(aumento);
	}
	
	public static void publicarpersona (Empleado empleado) {
		empleado.mostrardatos();	

	}
	public static void publicaraumento (Empleado empleado) {
		empleado.getaumento();

	}
}

