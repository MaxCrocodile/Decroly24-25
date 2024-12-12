import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuentaBancaria cuenta = null;

        try {
            System.out.print("Introduce el NIE: ");
            String nie = scanner.nextLine();
            System.out.print("Introduce el nombre del titular: ");
            String titular = scanner.nextLine();

            cuenta = new CuentaBancaria(nie, titular);
        } catch (Exception e) {
            System.out.println("Error al crear la cuenta: " + e.getMessage());
            System.exit(1);
        }

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> cuenta.mostrarDatos();
                case 2 -> System.out.println("IBAN: " + cuenta.getIban());
                case 3 -> System.out.println("Titular: " + cuenta.getTitular());
                case 4 -> System.out.println("Saldo: " + cuenta.getSaldo());
                case 5 -> {
                    System.out.print("Cantidad a ingresar: ");
                    double cantidad = scanner.nextDouble();
                    cuenta.ingresar(cantidad);
                }
                case 6 -> {
                    System.out.print("Cantidad a retirar: ");
                    double cantidad = scanner.nextDouble();
                    cuenta.retirar(cantidad);
                }
                case 7 -> {
                    for (Movimiento movimiento : cuenta.getMovimientos()) {
                        movimiento.mostrarInfoMovimiento();
                        System.out.println("----");
                    }
                }
                case 8 -> System.out.println("Gracias por usar DawBank.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 8);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("1. Datos de la cuenta");
        System.out.println("2. IBAN");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
