package Actividad1.programacion.daw;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cual es longitud del radio? \n");
		double r = scanner.nextDouble();
		
		double area = r*r*Math. PI;
		double volumen = (4/3)*Math. PI*(r*r*r);
		
		System.out.println("Area del circulo es:" +area+ "cm2");
		System.out.println("El volumen de esfera es:" +volumen+ "cm3");
		
		
		
		scanner.close();
	}
}
