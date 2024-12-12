package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in); 

	double[] numbers = new double[10];
	
	System.out.println("Introduce 10 numeros:");
	 for (int i = 0; i < 10; i++) {
         System.out.print("Número " + (i + 1) + ": ");
         numbers[i] = sc.nextDouble();
     }
	
     System.out.println("Los números introducidos son:");
     for (int i = 0; i < 10; i++) {
         System.out.println("Número " + (i + 1) + ": " + numbers[i]);
     }

	sc.close();
	}

}
