package Actividad1.programacion.daw;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args)  {
		
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Escribe primer numero: \n");
		double num1 = scanner.nextDouble();
		
		System.out.println("Escribe segundo numero: \n");
		double num2 = scanner.nextDouble();
		
		double suma = num1+num2;
		double resta = num1-num2;
		double producto = num1*num2;
		double division = num1/num2;
		
		System.out.println("suma=" +suma);
		System.out.println("resta=" +resta);
		System.out.println("producto=" +producto);
	    
		  if(num2 == 0)
	        {
			  System.out.println("Division con 0 es imposible");
			  
	        }else if(num1 == 0){
	                System.out.println("Division con 0 es imposible");	            
	        }else{
	            division = num1 / num2;
	            System.out.println(num1 + " / " + num2 + " = " + division);
	        }
		
	    scanner.close();
	}
	
}