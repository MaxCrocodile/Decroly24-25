package Ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		System.out.println("Cunatos personas hay?");
		size = sc.nextInt();
		double[] altura = new double[size];
		
        for (int i = 0; i < size; i++) {
            System.out.print("Introduce la altura de la persona " + (i + 1) + ": ");
            altura[i] = sc.nextDouble();
        }
		
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += altura[i]; 
        }
		
        double media = sum/size;
		
        int encima = 0, debajo = 0;
        
        for (int i = 0; i < size; i++)
        	if(altura[i] < media) {
        		debajo++;
        	}
        
        for (int i = 0; i < size; i++)
        	if(altura[i] > media) {
        		encima++;
        	}
        
        
        double min = altura[0]; 
        for (int i = 1; i < size; i++) {
            if (altura[i] < min) {
                min = altura[i]; 
            }
        }
        
        double max = altura[0]; 
        for (int i = 1; i < size; i++) {
            if (altura[i] > max) {
                max = altura[i]; 
            }
        }
        
        
        
        
        
        
        System.out.println("Altura media es: " + media +"m");
        System.out.println("Son " + debajo + " debajo de altura media");
        System.out.println("Son " + encima + " encima de altura media");
        System.out.println("Altura minima es: "+ min);
        System.out.println("Altura maxima es: "+ max);
        
        
        
        
	sc.close();
	}

}
