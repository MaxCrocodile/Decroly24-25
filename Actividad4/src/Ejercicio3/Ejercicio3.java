package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		double[] numeros = new double[10];
		
		System.out.println("Introduce 10 numeros:");
		for (int i = 0 ; i < 10; i++) {
			System.out.println("Numero" + i+1 + ":");
			numeros[i] = sc.nextDouble();
		}
		
		
		
		
		sc.close();
	}
}
