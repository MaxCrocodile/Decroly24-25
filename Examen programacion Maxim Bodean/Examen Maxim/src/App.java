import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Nposiciones, option1, option2, option3, NuevoNumero, V, P, Nborrar, Total, countNonZero;
        double sum;

        System.out.println("Introducir la cantidad total de los números para almacenar:");
        Nposiciones = sc.nextInt();

        int[] array1 = new int[Nposiciones];

        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Modificar Colección.");
            System.out.println("2. Estadísticas de la colección.");
            System.out.println("3. Ampliar el tamaño de la colección.");
            System.out.println("4. Salir.");
            option1 = sc.nextInt();

            switch (option1) {
                case 1:
                    do {
                        System.out.println("\nModificar Colección:");
                        System.out.println("1. Insertar Número.");
                        System.out.println("2. Borrar número de una posición específica.");
                        System.out.println("3. Modificar número de una posición específica.");
                        System.out.println("4. Volver al menú principal.");
                        option2 = sc.nextInt();

                        switch (option2) {
                            case 1:
                                System.out.println("Escribe el número que quieres insertar:");
                                NuevoNumero = sc.nextInt();
                                boolean inserted = false;
                                for (int i = 0; i < array1.length; i++) {
                                    if (array1[i] == 0) {
                                        array1[i] = NuevoNumero;
                                        inserted = true;
                                        break;
                                    }
                                }
                                if (!inserted) {
                                    System.out.println("La colección está llena.");
                                }
                                break;

                            case 2:
                                System.out.println("Número de qué posición quieres borrar?");
                                Nborrar = sc.nextInt();
                                if (Nborrar > 0 && Nborrar <= array1.length) {
                                    array1[Nborrar - 1] = 0;
                                } else {
                                    System.out.println("Posición no válida.");
                                }
                                break;

                            case 3:
                                System.out.println("Escribe el valor que quieres insertar:");
                                V = sc.nextInt();
                                System.out.println("Escribe la posición donde lo quieres insertar:");
                                P = sc.nextInt();
                                if (P > 0 && P <= array1.length) {
                                    array1[P - 1] = V;
                                } else {
                                    System.out.println("Posición no válida.");
                                }
                                break;

                            case 4:
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (option2 != 4);
                    break;

                case 2:
                    do {
                        System.out.println("\nEstadísticas de la colección:");
                        System.out.println("1. Media de todos los valores no nulos.");
                        System.out.println("2. Suma de todos los valores.");
                        System.out.println("3. Máximo de la colección.");
                        System.out.println("4. Mínimo de la colección.");
                        System.out.println("5. Volver al menú principal.");
                        option3 = sc.nextInt();

                        switch (option3) {
                            case 1:
                                sum = 0;
                                countNonZero = 0;
                                for (int value : array1) {
                                    if (value != 0) {
                                        sum += value;
                                        countNonZero++;
                                    }
                                }
                                if (countNonZero > 0) {
                                    System.out.println("Media: " + (sum / countNonZero));
                                } else {
                                    System.out.println("No hay valores no nulos.");
                                }
                                break;

                            case 2:
                                sum = Arrays.stream(array1).sum();
                                System.out.println("Suma de todos los valores: " + sum);
                                break;

                            case 3:
                                int max = Arrays.stream(array1).max().orElse(0);
                                System.out.println("Máximo de la colección: " + max);
                                break;

                            case 4:
                                int min = Arrays.stream(array1).filter(x -> x != 0).min().orElse(0);
                                System.out.println("Mínimo de la colección: " + min);
                                break;

                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (option3 != 5);
                    break;

                case 3:
                    System.out.println("¿Por cuántas unidades quieres ampliar la colección?");
                    int Nandidos = sc.nextInt();
                    int[] newArray = new int[array1.length + Nandidos];
                    System.arraycopy(array1, 0, newArray, 0, array1.length);
                    array1 = newArray;
                    System.out.println("La colección ha sido ampliada. Nueva capacidad: " + array1.length);
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
