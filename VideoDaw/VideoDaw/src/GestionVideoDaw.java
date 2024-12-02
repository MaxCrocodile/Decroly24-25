import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    Scanner scanner = new Scanner(System.in);

    int opcion;
        do {
        mostrarMenu();
        opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1 ->
            case 2 ->
            case 3 ->
            case 4 ->
            case 5 ->
            case 6 ->
            case 7 ->
            case 8 -> System.out.println("Gracias por usar VideoDaw.");
            default -> System.out.println("Opción no válida.");
        }
    } while (opcion != 8);

        scanner.close();
}





    private static void mostrarMenu() {
        System.out.println("1. Crear y registrar VideoClub en la franquicia. ");
        System.out.println("2. Registrar película en videoclub. ");
        System.out.println("3. Crear y registrar cliente en videoclub. ");
        System.out.println("4. Alquilar película. ");
        System.out.println("5. Devolver película. ");
        System.out.println("6. Dar de baja cliente. ");
        System.out.println("7. Dar de baja película. ");
        System.out.println("8. Salir. ");
        System.out.print("Seleccione una opción: ");
    }
}