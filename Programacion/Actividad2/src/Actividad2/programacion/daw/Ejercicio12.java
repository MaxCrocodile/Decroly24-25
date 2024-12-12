package Actividad2.programacion.daw;

import java.util.Scanner;

public class Ejercicio12 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numero;
        int negativo = 0;
        int positivo = 0;
        System.out.println("Introduce numeros no nulos(0 para finalizar)");
        
        numero = sc.nextInt();

        do { 
        	numero = sc.nextInt();
            if (numero > 0){
                positivo++;
            }else if(numero < 0){
                negativo++;
            }
        } while (numero != 0);

        System.out.println("se ha leydo "+ negativo+ " numeros negativos");
        System.out.println("se ha leydo "+ positivo+ " numeros positivos");

        sc.close();
       }
}