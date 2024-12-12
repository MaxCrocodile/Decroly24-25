package Ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		  int[] array1 = new int[100];
	      int[] array2 = new int[100];

	        
	        for (int i = 0; i < 100; i++) {
	            array1[i] = i + 1; 
	        }

	        
	        for (int i = 0; i < 100; i++) {
	            array2[i] = array1[99 - i]; 
	        }

	       
	        System.out.println("Primer array (del 1 al 100):");
	        for (int i = 0; i < 100; i++) {
	            System.out.print(array1[i] + " ");
	        }
	        System.out.println(); 

	       
	        System.out.println("Segundo array (orden inverso):");
	        for (int i = 0; i < 100; i++) {
	            System.out.print(array2[i] + " ");
	        }
	    }
	}