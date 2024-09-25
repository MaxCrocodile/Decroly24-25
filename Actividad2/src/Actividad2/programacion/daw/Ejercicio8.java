package Actividad2.programacion.daw;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		int i,fact=1;
		
		System.out.println("escribe el numero");
		number = sc.nextInt();
		
		for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial de "+number+" es: "+fact);       
		
		
		
		
		
		
		
		
		sc.close();
	}

}
