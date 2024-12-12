import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Astros a = new Astros(1.1, 1.1,1.1,1.1,1.1 );
        int opcion;
        do{
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
        scanner.close();
    }


    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Registrar Astro");
        System.out.println("2. Mostrar Astros");
        System.out.println("3. Salir");

        System.out.print("Seleccione una opción: ");
    }

    private static void registrarAstro(){

    }

}