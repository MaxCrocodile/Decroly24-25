package Actividad1.programacion.daw;
import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Que dimension tiene 1 latura del cuadrado? \n");
		int lat = scanner.nextInt();
		
		int area = lat*lat;
		
		System.out.println("Area del cuadrado es: " + area);
		
		
		scanner.close();
	}

} 
