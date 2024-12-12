import java.time.LocalDate;
import java.util.Scanner;

public class Gestion {
    private static Empresa empresa; // Variable para almacenar la empresa

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registrar la empresa antes de mostrar el menú
        registrarEmpresa(scanner);

        // Mostrar menú solo si la empresa fue registrada
        if (empresa != null) {
            int opcion;
            do {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        registrarPersona(scanner);
                        break;
                    case 2:
                        registrarTrabajador(scanner);
                        break;
                    case 3:
                        mostrarInfoEmpresa(scanner);
                        break;
                    case 4:
                        mostrarNumTrabajadores(scanner);
                        break;
                    case 5:
                        mostrarInfoTrabajadores(scanner);
                        break;
                    case 6:
                        darBajaTrabajador(scanner);
                        break;
                    case 7:
                        darBajaPersona(scanner);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (opcion != 8);
        } else {
            System.out.println("No se puede registrar la empresa. Finalizando programa.");
        }

        scanner.close();
    }

    private static void registrarEmpresa(Scanner scanner) {
        boolean cifValido;
        String cif;

        System.out.println("Ingrese el nombre de la Empresa:");
        String nombre = scanner.nextLine();

        //CIF validator
        do {
            System.out.println("Ingrese el CIF de la empresa(A12345678):");
            cif = scanner.nextLine();
            cifValido = cif.matches("^[A]?[0-9]{8}$");
            if (!cifValido) {
                System.out.println("CIF no valido. Intente de nuevo.");
            }
        } while (!cifValido);



        System.out.println("Ingrese la dirección de la Empresa:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese la fecha de fundación de la Empresa (YYYY-MM-DD):");
        LocalDate fechaFundacion = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese el número máximo de trabajadores:");
        int maxTrabajadores = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        empresa = new Empresa(nombre, cif, direccion, fechaFundacion, maxTrabajadores);
        System.out.println("Empresa registrada correctamente: " + empresa.getNombre());
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Crear Persona");
        System.out.println("2. Registrar trabajador en empresa");
        System.out.println("3. Mostrar información general de la empresa");
        System.out.println("4. Mostrar el número de trabajadores actuales");
        System.out.println("5. Mostrar información de todos los trabajadores");
        System.out.println("6. Eliminar trabajador de la empresa");
        System.out.println("7. Eliminar persona del programa");
        System.out.println("8. Salir de la aplicación");
        System.out.print("Seleccione una opción: ");
    }

    private static void registrarPersona(Scanner scanner) {
        System.out.println("Función en implemento.");
    }

    private static void registrarTrabajador(Scanner scanner) {

        boolean dniValido;
        String DNI;
        // Verifica si hay puestos de trabajo en la empresa
        if (empresa.getNumTrabajadores() >= empresa.getMaxTrabajadores()) {
            System.out.println("No hay mas puestos de trabajo en este empresa.");
            return;
        }
        System.out.println("Ingrese el nombre del trabajador:");
        String nombre = scanner.nextLine();

        //DNI Validator
        do {
            System.out.println("Ingrese el DNI del trabajador:");
            DNI = scanner.nextLine();
            dniValido = DNI.matches("^[XYZ]?[0-9]{7}[A-Z]$"); // Patrón para validar DNI simple
            if (!dniValido) {
                System.out.println("DNI no valido. Intente de nuevo.");
            }
        } while (!dniValido);

        System.out.println("Ingrese la dirección del trabajador:");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del trabajador (YYYY-MM-DD):");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        String numeroSS = Trabajador.generarSS();

        Trabajador trabajador = new Trabajador(nombre, DNI, direccion, numeroSS, fechaNacimiento);
        empresa.registrarTrabajador(trabajador);
    }


    private static void mostrarNumTrabajadores(Scanner scanner) {
        System.out.println("Ahora en empresa trabaja: " + empresa.getNumTrabajadores() + " personas.");
    }

    private static void mostrarInfoEmpresa(Scanner scanner) {
            empresa.mostrarInfoEmpresa();

    }

    private static void mostrarInfoTrabajadores(Scanner scanner) {
            empresa.mostrarInformacionTrabajadores();
    }

    private static void darBajaTrabajador(Scanner scanner) {
        System.out.println("Ingrese el DNI del trabajador a dar de baja:");
        String DNI = scanner.nextLine();
        Trabajador trabajador = empresa.getTrabajadores().stream()
                .filter(c -> c.getDNI().equals(DNI))
                .findFirst()
                .orElse(null);

        if (trabajador == null) {
            System.out.println("Trabajador no encontrado.");
            return;
        }
        empresa.getTrabajadores().remove(trabajador);
        System.out.println("Trabajador eliminado.");
    }

    private static void darBajaPersona(Scanner scanner) {
        System.out.println("Función en implemento.");
    }
}
