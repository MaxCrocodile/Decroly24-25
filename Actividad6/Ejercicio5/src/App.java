import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
 Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de empleados: ");
        int numPersonas = scanner.nextInt();


        double[][] empleados = new double[numPersonas][2];


        double sumaSueldosHombres = 0, sumaSueldosMujeres = 0;
        int contadorHombres = 0, contadorMujeres = 0;


        for (int i = 0; i < numPersonas; i++) {
            System.out.print("Introduce el género de la persona " + (i + 1) + " (0 para hombre, 1 para mujer): ");
            int genero = scanner.nextInt();
            System.out.print("Introduce el sueldo de la persona " + (i + 1) + ": ");
            double sueldo = scanner.nextDouble();

            empleados[i][0] = genero;
            empleados[i][1] = sueldo;

            if (genero == 0) {
                sumaSueldosHombres += sueldo;
                contadorHombres++;
            } else if (genero == 1) {
                sumaSueldosMujeres += sueldo;
                contadorMujeres++;
            }
        }

        double mediaHombres = contadorHombres > 0 ? sumaSueldosHombres / contadorHombres : 0;
        double mediaMujeres = contadorMujeres > 0 ? sumaSueldosMujeres / contadorMujeres : 0;

        System.out.println("\nSueldo medio de los hombres: " + mediaHombres);
        System.out.println("Sueldo medio de las mujeres: " + mediaMujeres);

        scanner.close();
    }
}
