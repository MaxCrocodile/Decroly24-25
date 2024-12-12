package Actividad;

import java.util.Scanner;

public class buclefr {

	public static void main(String[] args) {
	Scanner sc = new scanner(System.in);
	
	double suma = 0;
	double i;
	
	i = sc.nextDouble();
	
	for(double i = 1; i <= 1000; i++);
	{
		suma = suma + (1/Math.pow(i, 2));
	}
		
	System.out.println("La suma es: " + suma);
	
	sc.close();
	}

}
