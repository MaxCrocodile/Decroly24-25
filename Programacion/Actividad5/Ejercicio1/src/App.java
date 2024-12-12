import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una cadena de texto:");
        String texto = scanner.nextLine();
        
        String[] palabras = texto.split("\\s+");
        
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        scanner.close();


    }
}
