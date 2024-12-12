package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] numeros = new double[20];
		double positivos = 0,negativos = 0;
		
		System.out.println("Introduce 20 numeros:");
		for (int i = 0 ; i < 20; i++) {
			System.out.println("Numero " + (i+1) + ":");
			numeros[i] = sc.nextDouble();
		}
		
		for (int i = 1; i < numeros.length; i++)
			if (numeros[i] < 0) {
				negativos+=numeros[i];
				
			}else if (numeros[i] > 0) {
				positivos+=numeros[i];
			}
        
        System.out.println("Suma de positivos es:"+ positivos);
        System.out.println("Suma de negativos es:"+ negativos);
        
		sc.close();
	}
}
