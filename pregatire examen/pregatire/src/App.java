import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Nposiciones, option1, option2, option3, NuevoNumero, V, P, Nborrar;

        // Crear array con el número de posiciones ingresado por el usuario
        System.out.println("Introducir la cantidad total de números para almacenar:");
        Nposiciones = sc.nextInt();

        int[] array1 = new int[Nposiciones];

        // Menú Principal
        do {
            System.out.println("\n------ Menú Principal ------");
            System.out.println("1. Modificar Colección.");
            System.out.println("2. Estadísticas de la colección.");
            System.out.println("3. Ampliar el tamaño de la colección.");
            System.out.println("4. Salir.");
            System.out.print("Seleccione una opción: ");
            option1 = sc.nextInt();

            switch (option1) {
                case 1:
                    // Primer submenú: Modificar colección
                    do {
                        System.out.println("\n------ Modificar Colección ------");
                        System.out.println("1. Insertar Número.");
                        System.out.println("2. Borrar número de una posición específica.");
                        System.out.println("3. Modificar número de una posición específica.");
                        System.out.println("4. Volver al Menú Principal.");
                        System.out.print("Seleccione una opción: ");
                        option2 = sc.nextInt();

                        switch (option2) {
                            case 1:
                                // Insertar Número
                                System.out.print("Escribe el número que quieres insertar: ");
                                NuevoNumero = sc.nextInt();
                                for (int i = 0; i < array1.length; i++) {
                                    if (array1[i] == 0) { // Encontrar la primera posición vacía (0)
                                        array1[i] = NuevoNumero;
                                        System.out.println("Número insertado en la posición " + (i + 1));
                                        break;
                                    }
                                }
                                break;

                            case 2:
                                // Borrar número de una posición específica
                                System.out.print("Número de la posición que quieres borrar: ");
                                Nborrar = sc.nextInt();
                                if (Nborrar > 0 && Nborrar <= array1.length) {
                                    array1[Nborrar - 1] = 0;
                                    System.out.println("Número en la posición " + Nborrar + " borrado.");
                                } else {
                                    System.out.println("Posición no válida.");
                                }
                                break;

                            case 3:
                                // Modificar número en una posición específica
                                System.out.print("Escribe el valor que quieres insertar: ");
                                V = sc.nextInt();
                                System.out.print("Escribe la posición donde lo quieres insertar: ");
                                P = sc.nextInt();
                                if (P > 0 && P <= array1.length) {
                                    array1[P - 1] = V;
                                    System.out.println("Número en la posición " + P + " modificado.");
                                } else {
                                    System.out.println("Posición no válida.");
                                }
                                break;

                            case 4:
                                // Volver al menú principal
                                System.out.println("Volviendo al Menú Principal...");
                                break;

                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (option2 != 4);
                    break;

                case 2:
                    // Segundo submenú: Estadísticas de la colección
                    do {
                        System.out.println("\n------ Estadísticas de la Colección ------");
                        System.out.println("1. Media de todos los valores no nulos.");
                        System.out.println("2. Suma de todos los valores.");
                        System.out.println("3. Máximo de la colección.");
                        System.out.println("4. Mínimo de la colección.");
                        System.out.println("5. Volver al Menú Principal.");
                        System.out.print("Seleccione una opción: ");
                        option3 = sc.nextInt();

                        switch (option3) {
                            case 1:
                                // Media de todos los valores no nulos
                                int sum = 0, count = 0;
                                for (int num : array1) {
                                    if (num != 0) {
                                        sum += num;
                                        count++;
                                    }
                                }
                                if (count > 0) {
                                    double media = (double) sum / count;
                                    System.out.println("Media de los valores no nulos: " + media);
                                } else {
                                    System.out.println("No hay valores no nulos en la colección.");
                                }
                                break;

                            case 2:
                                // Suma de todos los valores
                                sum = 0;
                                for (int num : array1) {
                                    sum += num;
                                }
                                System.out.println("Suma de todos los valores: " + sum);
                                break;

                            case 3:
                                // Máximo de la colección
                                int max = Integer.MIN_VALUE;
                                for (int num : array1) {
                                    if (num > max) {
                                        max = num;
                                    }
                                }
                                System.out.println("Máximo de la colección: " + max);
                                break;

                            case 4:
                                // Mínimo de la colección
                                int min = Integer.MAX_VALUE;
                                for (int num : array1) {
                                    if (num < min && num != 0) { // Ignorar ceros
                                        min = num;
                                    }
                                }
                                System.out.println("Mínimo de la colección: " + min);
                                break;

                            case 5:
                                System.out.println("Volviendo al Menú Principal...");
                                break;

                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (option3 != 5);
                    break;

                case 3:
                    // Ampliar el tamaño de la colección
                    System.out.print("¿Cuántas unidades quieres añadir a la colección? ");
                    int Nandidos = sc.nextInt();
                    int[] nuevoArray = new int[array1.length + Nandidos];
                    System.arraycopy(array1, 0, nuevoArray, 0, array1.length);
                    array1 = nuevoArray;
                    System.out.println("Colección ampliada. Tamaño actual: " + array1.length);
                    break;

                case 4:
                    System.out.println("Cerrando el programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (option1 != 4);

        sc.close();
    }
}

