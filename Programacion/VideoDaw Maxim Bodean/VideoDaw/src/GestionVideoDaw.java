import java.time.LocalDate;
import java.util.Scanner;

public class GestionVideoDaw {
    private static VideoDaw videoClub;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int opcion;
        do{
            //ha hecho el menu aparte para el program ser mas regible
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    registrarVideoClub(scanner);
                    break;
                case 2:
                    registrarPelicula(scanner);
                    break;
                case 3:
                    registrarCliente(scanner);
                    break;
                case 4:
                    alquilarPelicula(scanner);
                    break;
                case 5:
                    devolverPelicula(scanner);
                    break;
                case 6:
                    darBajaCliente(scanner);
                    break;
                case 7:
                    darBajaPelicula(scanner);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);

        scanner.close();
    }



//metodo del menu
    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Crear y registrar VideoClub");
        System.out.println("2. Registrar película en VideoClub");
        System.out.println("3. Crear y registrar cliente en VideoClub");
        System.out.println("4. Alquilar película");
        System.out.println("5. Devolver película");
        System.out.println("6. Dar de baja cliente");
        System.out.println("7. Dar de baja película");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
    }

    //metodo para registrar video club
    private static void registrarVideoClub(Scanner scanner) {
        System.out.println("Ingrese el CIF(A12345678) del VideoClub: ");
        String cif = scanner.nextLine();
        System.out.println("Ingrese la direccion del VideoClub: ");
        String direccion = scanner.nextLine();
        videoClub = new VideoDaw(cif, direccion, LocalDate.now());
        System.out.println("VideoClub registrado correctamente.");
    }

    //metodo para registrar pelicula
    private static void registrarPelicula(Scanner scanner) {
        System.out.print("Ingrese el título de la película: ");
        String titulo = scanner.nextLine();
        System.out.print("Seleccione el género (1-Acción, 2-Drama, 3-Comedia, 4-Terror, 5-Romance, 6-Ciencia Ficción): ");
        int opcionGenero = scanner.nextInt();
        Genero genero = Genero.values()[opcionGenero - 1];
        String codigo = Pelicula.generarCodPelicula();
        boolean Alquilada = false;
        Pelicula pelicula = new Pelicula(codigo, titulo, genero, Alquilada);
        videoClub.registrarPelicula(pelicula);
    }

    //metodo para registrar un cliente
    private static void registrarCliente(Scanner scanner) {
        System.out.print("Ingrese el DNI del cliente: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());

        if (LocalDate.now().minusYears(18).isBefore(fechaNacimiento)) {
            System.out.println("El cliente debe ser mayor de edad.");
            return;
        }else{
            System.out.println("Cliente registrado");
        }

        Cliente cliente = new Cliente(dni, nombre, direccion, fechaNacimiento);
        videoClub.registrarCliente(cliente);
    }

    //metodo para alquilar pelicula
    private static void alquilarPelicula(Scanner scanner) {
        System.out.print("Ingrese el titulo de pelicula: ");
        String titulo = scanner.nextLine();
        Pelicula pelicula = videoClub.getPeliculasRegistradas().stream()
                .filter(p -> p.getTitulo().equals(titulo))
                .findFirst()
                .orElse(null);

        if (pelicula == null) {
            System.out.println("Película con este titulo no encontrada.");
            return;
        }

        System.out.print("Ingrese el DNI del cliente: ");
        String dni = scanner.nextLine();
        Cliente cliente = videoClub.getClientesRegistrados().stream()
                .filter(c -> c.getDni().equals(dni))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("Cliente con este DNI no encontrado.");
            return;
        }

       videoClub.alquilarPelicula(cliente, pelicula);
    }

    //metodo para devolver pelicula
    private static void devolverPelicula(Scanner scanner) {
        System.out.print("Ingrese el titulo de la película a devolver: ");
        String titulo = scanner.nextLine();
        Pelicula pelicula = videoClub.getPeliculasRegistradas().stream()
                .filter(p -> p.getTitulo().equals(titulo))
                .findFirst()
                .orElse(null);

        if (pelicula == null) {
            System.out.println("Película con ese titulo no encontrada.");
            return;
        }

        System.out.print("Ingrese el DNI del cliente: ");
        String dniCliente = scanner.nextLine();
        Cliente cliente = videoClub.getClientesRegistrados().stream()
                .filter(c -> c.getDni().equals(dniCliente))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        videoClub.devolverPelicula(pelicula, cliente);
    }

    //metodo paara dar bajo cliente
    private static void darBajaCliente(Scanner scanner) {
        System.out.print("Ingrese el DNI del cliente a dar de baja: ");
        String dni = scanner.nextLine();
        Cliente cliente = videoClub.getClientesRegistrados().stream()
                .filter(c -> c.getDni().equals(dni))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        cliente.setFechaBaja(LocalDate.now());
        videoClub.getClientesRegistrados().remove(cliente);
        System.out.println("Cliente dado de baja.");
    }

    //metodo para dar bajo pelicula
    private static void darBajaPelicula(Scanner scanner) {
        System.out.print("Ingrese el código de la película a dar de baja: ");
        String codPelicula = scanner.nextLine();
        Pelicula pelicula = videoClub.getPeliculasRegistradas().stream()
                .filter(p -> p.getCod().equals(codPelicula))
                .findFirst()
                .orElse(null);

        if (pelicula == null) {
            System.out.println("Película no encontrada.");
            return;
        }

        pelicula.setFechaBaja(LocalDate.now());
        videoClub.getPeliculasRegistradas().remove(pelicula);
        System.out.println("Película dada de baja con éxito.");
    }
}