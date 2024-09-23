package Actividad1.programacion.daw;

import java.util.Scanner;

public class Ejercicio7 {
public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		 double millas;
	     double metros;
	     
	     System.out.println("Que distancia en millas queres convertir en metros?");
	     millas = scanner.nextDouble();
	     metros = (millas * 1.852);
	     
	     System.out.println(millas + " millas marinas equivalen a " + metros + " metros");
		
	 	scanner.close();
	}
}
