import java.util.Scanner;

public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce el número de filas (N): ");
        int filas = scanner.nextInt();
        System.out.print("Introduce el número de columnas (M): ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];


        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > 0) {
                    mayoresCero++;
                } else if (matriz[i][j] < 0) {
                    menoresCero++;
                } else {
                    igualesCero++;
                }
            }
        }


        System.out.println("Cantidad de valores mayores que cero: " + mayoresCero);
        System.out.println("Cantidad de valores menores que cero: " + menoresCero);
        System.out.println("Cantidad de valores iguales a cero: " + igualesCero);

        scanner.close();
    }
}
