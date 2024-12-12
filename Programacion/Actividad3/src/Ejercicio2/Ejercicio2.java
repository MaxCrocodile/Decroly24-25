package Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        while (opcion != 5) {
        	System.out.println("\nMenu");
        	System.out.println("1. Sumar");
        	System.out.println("2. Restar");
        	System.out.println("3. Multiplicar");
        	System.out.println("4. Dividir");
        	System.out.println("5. Salir");
        	System.out.println("Chose 1 option:");
        	opcion = sc.nextInt();
        
        
       double num1,num2;
       
       switch (opcion) {
       case 1: // Sumar
           System.out.print("Introduce el primer número: ");
           num1 = sc.nextDouble();
           System.out.print("Introduce el segundo número: ");
           num2 = sc.nextDouble();
           System.out.println("Resultado: " + (num1 + num2));
           break;
           
       case 2: //Restar
    	   System.out.print("Introduce el primer número: ");
           num1 = sc.nextDouble();
           System.out.print("Introduce el segundo número: ");
           num2 = sc.nextDouble();
           System.out.println("Resultado: " + (num1 - num2));
           break;
           
       case 3: //Multiplicar
    	   System.out.print("Introduce el primer número: ");
           num1 = sc.nextDouble();
           System.out.print("Introduce el segundo número: ");
           num2 = sc.nextDouble();
           System.out.println("Resultado: " + (num1 * num2));
           break;
           
       case 4: //Dividir
    	   System.out.print("Introduce el primer número: ");
           num1 = sc.nextDouble();
           System.out.print("Introduce el segundo número: ");
           num2 = sc.nextDouble();
           if (num2 == 0) {
               System.out.println("Error: No se puede dividir por 0.");
           } else {
               System.out.println("Resultado: " + (num1 / num2));
           }
           break;
           
       case 5: // Salir
           System.out.println("Saliendo del programa...");
           break;
       default: // Opción no válida
           System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 5.");
       }
      }
        sc.close();
    }
}


