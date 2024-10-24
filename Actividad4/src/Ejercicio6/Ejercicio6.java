package Ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
	
		
		System.out.println("Escribe numero de positiones:");
		int M = sc.nextInt();
		
		System.out.println("Escribe el numero dentro los positiones:");
	    int N = sc.nextInt();
	    
	     int[] numeros = new int[M];
	     for(int i = 0; i < M; i++) {
	    	 numeros[i] = N;
	     }
	     
	     System.out.println("Resultado:");
	     for (int i = 0 ; i < M; i++) {
	    	 System.out.println(numeros[i]);
	     }
	     
	     
	     
	sc.close();	
	}
}





		