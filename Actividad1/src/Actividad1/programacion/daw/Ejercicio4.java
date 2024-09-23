package Actividad1.programacion.daw;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe primer numero: \n");
		int a = scanner.nextInt();
		
		System.out.println("Escribe segundo numero: \n");
		int b = scanner.nextInt();
		
		int suma = a+b;
		int resta = a-b;
		int producto = a*b;
		int division = a/b;
		
		System.out.println("suma=" +suma);
		System.out.println("resta=" +resta);
		System.out.println("producto=" +producto);
		System.out.println("division=" +division);
		
		
		
		scanner.close();
	}
}