package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		double[] numeros = new double[10];
		
		System.out.println("Introduce 10 numeros:");
		for (int i = 0 ; i < 10; i++) {
			System.out.println("Numero " + i+1 + ":");
			numeros[i] = sc.nextDouble();
		}
		double max = numeros[0];
        double min = numeros[0];
        
       
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            	}
        	}
        
        System.out.println("El número máximo es: " + max);
        System.out.println("El número mínimo es: " + min);
		
		sc.close();
	}
}
