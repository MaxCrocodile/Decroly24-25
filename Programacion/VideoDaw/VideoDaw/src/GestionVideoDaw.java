import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pelicula manager = new Pelicula(0, "", null, false);
        String resultado = "";

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("test");
                    break;
                case 2: manager.registrarPelicula();
                    break;
                case 3:
                    System.out.println("test");
                    break;
                case 4:
                    manager.mostrarInfoPelicula();
                    break;
                case 5:
                    System.out.println("test");
                    break;
                case 6:
                    System.out.println("test");
                    break;
                case 7:
                    System.out.println("test");
                    break;
                case 8:
                    System.out.println("Gracias por usar VideoDaw.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 8);  // Loop until user selects option 8 (exit)

        scanner.close();
    }

    // Method to show the menu
    private static void mostrarMenu() {
        System.out.println("1. Crear y registrar VideoClub en la franquicia.");
        System.out.println("2. Registrar película en videoclub.");
        System.out.println("3. Crear y registrar cliente en videoclub.");
        System.out.println("4. Alquilar película.");
        System.out.println("5. Devolver película.");
        System.out.println("6. Dar de baja cliente.");
        System.out.println("7. Dar de baja película.");
        System.out.println("8. Salir.");
        System.out.print("Seleccione una opción: ");
    }
}






