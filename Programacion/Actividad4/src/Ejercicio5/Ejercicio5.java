package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[20];
		double suma = 0;
		
		System.out.println("Introduce 20 numeros:");
		for (int i = 0 ; i < 20; i++) {
			System.out.println("Numero " + (i+1) + ":");
			numeros[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < numeros.length; i++)
			suma+=numeros[i];
		
		System.out.println("Media de los numeros es:" + (suma/numeros.length));
		
		
	sc.close();
	}
}
