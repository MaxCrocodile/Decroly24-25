import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();
        

        frase = frase.toLowerCase();
        

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            
            switch (letra) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }
        

        System.out.println("Nº de A's: " + contadorA);
        System.out.println("Nº de E's: " + contadorE);
        System.out.println("Nº de I's: " + contadorI);
        System.out.println("Nº de O's: " + contadorO);
        System.out.println("Nº de U's: " + contadorU);
        

        scanner.close();
    }
}
