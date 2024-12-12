import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escuela escuela = new Escuela("Escuela General");

        boolean salir = false;

        while (!salir) {
            System.out.println("\n===== Menú Principal =====");
            System.out.println("1. Registrar Clase");
            System.out.println("2. Registrar Persona (Alumno/Profesor)");
            System.out.println("3. Mostrar Información de Personas");
            System.out.println("4. Eliminar Clase");
            System.out.println("5. Eliminar Persona");
            System.out.println("6. Mostrar Información de Clases");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la clase: ");
                    String nombreClase = scanner.nextLine();
                    Clases clase = new Clases(nombreClase);
                    escuela.agregarClase(clase);
                    System.out.println("Clase agregada con éxito.");
                    break;

                case 2:
                    try {
                        System.out.print("Ingrese nombre de la persona: ");
                        String nombrePersona = scanner.nextLine();
                        System.out.print("Ingrese fecha de nacimiento (yyyy-mm-dd): ");
                        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
                        System.out.print("¿Es alumno? (true/false): ");
                        boolean esAlumno = scanner.nextBoolean();
                        scanner.nextLine();

                        double salario = 0.0;
                        if (!esAlumno) { // Solo pedimos salario si no es alumno
                            System.out.print("Ingrese el salario: ");
                            salario = scanner.nextDouble();
                            scanner.nextLine();
                        }

                        Persona persona = new Persona(nombrePersona, fechaNacimiento, esAlumno, "Z12345678R", salario);

                        if (!escuela.getClases().isEmpty()) {
                            escuela.getClases().get(0).agregarPersona(persona);
                            System.out.println("Persona agregada a la primera clase.");
                        } else {
                            System.out.println("No hay clases disponibles para agregar a la persona.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Personas en la primera clase:");
                    if (!escuela.getClases().isEmpty()) {
                        for (Persona p : escuela.getClases().get(0).getPersonas()) {
                            System.out.println("\n" + p);
                            System.out.println("----------------------");
                        }
                    } else {
                        System.out.println("No hay clases disponibles.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el ID de la clase para eliminar: ");
                    int idClaseEliminar = scanner.nextInt();
                    scanner.nextLine();
                    escuela.eliminarClase(idClaseEliminar);
                    System.out.println("Clase eliminada con éxito.");
                    break;

                case 5:
                    System.out.print("Ingrese el ID de la persona para eliminar: ");
                    int idPersonaEliminar = scanner.nextInt();
                    scanner.nextLine();
                    for (Clases claseIter : escuela.getClases()) {
                        claseIter.eliminarPersona(idPersonaEliminar);
                    }
                    System.out.println("Persona eliminada con éxito.");
                    break;

                case 6:
                    System.out.println("Clases en la escuela:");
                    if (!escuela.getClases().isEmpty()) {
                        for (Clases c : escuela.getClases()) {
                            System.out.println("\n" + c);
                            System.out.println("----------------------");
                        }
                    } else {
                        System.out.println("No hay clases registradas.");
                    }
                    break;

                case 7:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
