package Actividad2.programacion.daw;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i = i + 1) {
			  System.out.println(i);
			}
		
		
		sc.close();
	}
}
