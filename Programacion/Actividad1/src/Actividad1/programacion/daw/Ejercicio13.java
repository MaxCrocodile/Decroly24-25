package Actividad1.programacion.daw;

import java.util.Scanner;

public class Ejercicio13 {
public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);

		double num;
		
        System.out.println("Escribe un número");
        
        num = scanner.nextDouble();
        
        if(num>=0)
        {
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }
        
        scanner.close();
	}
}