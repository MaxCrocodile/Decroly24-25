package Actividad2.programacion.daw;

import java.util.Scanner;

public class Ejercicio2 {
	

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int edad;
	
	System.out.println("Que edad tienes?");
	edad = sc.nextInt();
	
	if (edad >= 18) {
		System.out.println("Eres mayor de edad");
	}else if (edad <= 0) {
		System.out.println("Imposible tener menos de 0 anos");
	}else {
		System.out.println("Eres menor de edad");
	}

	sc.close();
	}
	
}
