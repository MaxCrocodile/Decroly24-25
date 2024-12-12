package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
        double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + Math.random()*10;
        }

        System.out.println("Array de 100 números reales aleatorios entre 0.0 y 1.0:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un valor entero (N) entre 1 y 10: ");
        double N = scanner.nextDouble();

        // Verificar que N está dentro del rango permitido
        if (N < 1 || N > 10) {
            System.out.println("El valor debe estar entre 1 y 10.");
            return;
        }

        // Mostrar las posiciones en las que aparece N en el array
        System.out.print("El valor " + N + " aparece en las posiciones: ");
        boolean found = false; // Variable para verificar si se encontró N
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N) {
                System.out.print(i + " "); // Imprimir la posición
                found = true; // Marcar que se encontró N
            }
        }

        // Mensaje si N no se encuentra en el array
        if (!found) {
            System.out.println("No se encontró el valor " + N + " en el array.");
        }

        
    
        scanner.close();
	}
}