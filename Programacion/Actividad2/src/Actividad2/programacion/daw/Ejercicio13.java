package Actividad2.programacion.daw;

public class Ejercicio13 {

	public static void main(String[] args) {
		int suma = 0;
        int producto = 1;  

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;          
            producto = producto * i;      
        }

        System.out.println("La suma de los 10 primeros números naturales es: " + suma);
        System.out.println("El producto de los 10 primeros números naturales es: " + producto);
    }
}
