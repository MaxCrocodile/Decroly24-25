package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		double suma = 0;
		double[] numeros = new double[10];
		
		System.out.println("Introduce 10 numeros:");
		 for (int i = 0; i < 10; i++) {
	         System.out.print("Número " + (i + 1) + ": ");
	         numeros[i] = sc.nextDouble();
	     }
		 
		 for (int i = 0; i < 10; i++) {
	            suma += numeros[i];
		 }
		 
		 System.out.println("Suma de tu numeros es:"+ suma);
		 
		 sc.close();

	}

}
