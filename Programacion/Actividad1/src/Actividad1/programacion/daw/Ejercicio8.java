package Actividad1.programacion.daw;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		double num1;
        double num2;
        
        System.out.println("Escribe el primer número");
        num1 = scanner.nextDouble();
        
        System.out.println("Escribe el segundo número");
        num2 = scanner.nextDouble();
        
        if(num1 > num2)
        {
            System.out.println(num2 + " ; " + num1);
        }else if(num2 > num1){
                System.out.println(num1 + " ; " + num2);
        	}else{
                System.out.println("Son iguales");
        	}
        
        scanner.close();
	}
}
