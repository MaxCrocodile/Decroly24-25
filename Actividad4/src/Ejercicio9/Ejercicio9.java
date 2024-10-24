package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		double[] array = new double[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        System.out.println("Array de 100 números reales aleatorios entre 0.0 y 1.0:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce un valor real (R): ");
        double R = scanner.nextDouble();


        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= R) {
                contador++;
            }
        }
        
        System.out.println("Hay " + contador + " valores en el array que son iguales o superiores a " + R);
    
        scanner.close();
	}
}
