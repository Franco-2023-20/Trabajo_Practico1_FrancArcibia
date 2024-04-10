package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese numero entre el 0 y 9 :");
		if(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if(num<0 || num >9) {
				System.out.println("Solo calcula con numeros del 0 al 9 .");
			}
			else {
				int resultado = num;
				for(int i=0 ; 11>i; i++) {
					resultado=i*num;
				System.out.println(+num +" x " +i +" = " +resultado);
	
				}
				}
			scanner.close();
		}
		else {
			System.out.println("Se ingreso datos incorrectos");
		}
	}
}