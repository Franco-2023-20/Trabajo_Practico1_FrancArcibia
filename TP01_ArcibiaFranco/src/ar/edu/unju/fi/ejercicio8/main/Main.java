package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;


import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("INgrese numero entero para el valor n");
	   CalculadoraEspecial entero = new CalculadoraEspecial(scanner.nextInt());
	publicar(entero);
	}
	

	public static void publicar (CalculadoraEspecial CalculadoraEspecial) {
		CalculadoraEspecial.dcalcularSumatorial();
       CalculadoraEspecial.calcularProductorial();
}
}