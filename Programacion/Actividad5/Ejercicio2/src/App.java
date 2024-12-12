import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce la primera cadena de texto:");
        String cadena1 = scanner.nextLine();
        
        System.out.println("Introduce la segunda cadena de texto:");
        String cadena2 = scanner.nextLine();
        
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }
        
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales (ignorando mayúsculas y minúsculas).");
        } else {
            System.out.println("Las cadenas no son iguales (ignorando mayúsculas y minúsculas).");
        }
        
        scanner.close();
    }
}
