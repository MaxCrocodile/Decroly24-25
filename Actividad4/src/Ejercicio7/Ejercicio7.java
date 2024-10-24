package Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Introduce la valor del P:");
		int P = sc.nextInt();
		
		System.out.println("Introducel la valor del Q:");
		int Q = sc.nextInt();
		
		if (P > Q) {
            System.out.println("El valor de P debe ser menor o igual que el valor de Q.");
            return; }
            
		 int lenght = Q - P + 1;
		 int[] array = new int [lenght];
		 
		 for (int i = 0 ; i < lenght; i++) {
			  array[i] = P + i;
		 }
		 	

    
    	System.out.print("Array resultante: ");
    		for (int i = 0; i < lenght; i++) {
        System.out.print(array[i] + " ");
    		}
		 
	
	
		sc.close();
	}
}
