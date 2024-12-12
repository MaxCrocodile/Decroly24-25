import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();

        String fraseModificada = frase.toLowerCase().replace(" ", "");




    scanner.close();
    }
}
