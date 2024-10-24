import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
Scanner scanner = new Scanner(System.in);
        
        // Pedir nombre y apellidos al usuario
        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce tu primer apellido:");
        String apellido1 = scanner.nextLine();
        
        System.out.println("Introduce tu segundo apellido:");
        String apellido2 = scanner.nextLine();
        
        // Generar el código de usuario concatenando las tres primeras letras de cada cadena
        String codigoUsuario = nombre.substring(0, 3).toUpperCase() +
                               apellido1.substring(0, 3).toUpperCase() +
                               apellido2.substring(0, 3).toUpperCase();
        
        // Mostrar el código de usuario
        System.out.println("El código de usuario es: " + codigoUsuario);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}
