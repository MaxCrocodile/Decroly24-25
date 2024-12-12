package Actividad1.programacion.daw;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
    double precioArticulo;
    double precioVenta;
    
    System.out.println("Cual es precio del articulo? \n");
    precioArticulo = scanner.nextDouble();
    
    System.out.println("Cual es precio de venta del articulo? \n");
    precioVenta = scanner.nextDouble();
    
    double descuento = (precioVenta * 100)/precioArticulo ;
    
    
    System.out.println("El precio del artículo es " + precioArticulo + "€");
    System.out.println("El precio de venta es " + precioVenta + "€");
    System.out.println("El descuento realizado es " + descuento + "%");
	
    
    scanner.close();
	}
}
