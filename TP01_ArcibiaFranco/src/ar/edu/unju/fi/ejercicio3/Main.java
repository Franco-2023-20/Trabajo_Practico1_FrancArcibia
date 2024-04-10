package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero :");
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if(num % 2 == 0) {
				System.out.println("El numero es par");
			}
			else {
				System.out.println("El numero es impar");
				}
			
			
		}
		else {
			System.out.println("Ingresar numero enteros");
		}
		
		
	}
}