package Actividad1.programacion.daw;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args)  {
		
	    Scanner scanner = new Scanner(System.in);
	    
	    double num1,num2,num3;
	 
	    
	    System.out.println("Introduce el primer número");
	    num1 = scanner.nextDouble();
	    
	    System.out.println("Introduce el segundo número, distinto al primero");
	    num2 = scanner.nextDouble(); 
	    
	    System.out.println("Introduce el tercer número, distinto a los dos anteriores");
	    num3 = scanner.nextDouble();
	    
	    if(num1>num2)
	    {
	        if(num1>num3){
	            System.out.println(num1 + " es el mayor");
	        }else{
	            System.out.println(num3 + " es el mayor");
	        }
	    }else{
	        if(num2>num3){
	            System.out.println(num2 + " es el mayor");
	        }else{
	            System.out.println(num3 + " es el mayor");
	        }
	    }
	    scanner.close();
	}
	
}
