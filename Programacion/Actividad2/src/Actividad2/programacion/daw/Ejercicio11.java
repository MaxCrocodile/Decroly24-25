package Actividad2.programacion.daw;
import java.util.Scanner;  

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        boolean hayNegativo = false;  

        System.out.println("Introduce 10 números no nulos:");

        // Bucle para leer 10 números
        for (int i = 0; i < 10; i++) {  
            int numero;
            
            // Asegurarse de que el número no sea 0
            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = scanner.nextInt();
                
                if (numero == 0) {
                    System.out.println("El número no debe ser 0, por favor, introduce otro número.");
                }
            } while (numero == 0);

            // Verificar si el número es negativo
            if (numero < 0) {
                hayNegativo = true;
            }
        }

        // Resultado final
        if (hayNegativo) {
            System.out.println("Se ha leído al menos un número negativo.");
        } else {
            System.out.println("No se ha leído ningún número negativo.");
        }

        scanner.close();  // Cerrar el scanner
    }
}
