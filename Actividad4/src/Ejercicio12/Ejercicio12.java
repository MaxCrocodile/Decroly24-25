package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        int V, P;
        int[] array1 = new int[10];

        do {
            System.out.println("1. Mostrar valores.");
            System.out.println("2. Introducir valor.");
            System.out.println("3. Salir.");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println(array1[i]);
                    }
                    break;

                case 2:
                    System.out.println("Escribe el valor V: ");
                    V = sc.nextInt();
                    System.out.println("Escribe la posición P (0-9): ");
                    P = sc.nextInt();
					
					array1[P+1] = V;

                    for (int i = 0; i < 10; i++) {
                        System.out.println(array1[i]);
                    }
                    break;

                case 3:
                    System.out.println("Cerrando el programa...");
                    break;

                default:
                    System.err.println("Opción no válida.");
                    break;
            }
        } while (option != 3);

        sc.close();
    }
}