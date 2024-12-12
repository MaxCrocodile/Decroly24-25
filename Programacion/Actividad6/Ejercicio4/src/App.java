import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
 Scanner scanner = new Scanner(System.in);
        int alumnos = 4;
        int asignaturas = 5;
        double[][] notas = new double[alumnos][asignaturas];


        for (int i = 0; i < alumnos; i++) {
            System.out.println("Introduce las notas de Alumno " + (i + 1) + ":");
            for (int j = 0; j < asignaturas; j++) {
                System.out.print("Asignatura " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }


        for (int i = 0; i < alumnos; i++) {
            double min = notas[i][0];
            double max = notas[i][0];
            double sum = 0;

            for (int j = 0; j < asignaturas; j++) {
                double nota = notas[i][j];
                if (nota < min) min = nota;
                if (nota > max) max = nota;
                sum += nota;
            }

            double media = sum / asignaturas;
            System.out.println("\nResultados de Alumno " + (i + 1) + ":");
            System.out.println("Nota mínima: " + min);
            System.out.println("Nota máxima: " + max);
            System.out.println("Nota media: " + media);
        }

        scanner.close();
    }
}
