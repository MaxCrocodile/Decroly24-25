import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CuentaBancaria {
    private static final double SALDO_MINIMO = -50.0;
    private static final double LIMITE_NOTIFICACION_HACIENDA = 3000.0;
    private static final int LIMITE_MOVIMIENTOS = 100;
    private static final String CODIGO_PAIS = "ES";

    private String iban;
    private String nie;
    private String titular;
    private double saldo;
    private List<Movimiento> movimientos;

    public CuentaBancaria(String nie, String titular) throws Exception {
        if (!validarNIE(nie) || titular.isEmpty()) {
            throw new Exception("NIE o titular no válidos");
        }
        this.nie = nie;
        this.titular = titular;
        this.saldo = 0.0;
        this.movimientos = new ArrayList<>();
        this.iban = generarIBAN();
    }

    private boolean validarNIE(String nie) {
        return nie.matches("[XYZ]\\d{7}[A-Z]");
    }

    private String generarIBAN() {
        Random random = new Random();
        StringBuilder ibanBuilder = new StringBuilder(CODIGO_PAIS);
        
        // Generamos los 22 dígitos del IBAN (el NIE puede hacer parte de ellos para asegurar unicidad)
        for (int i = 0; i < 18; i++) {
            ibanBuilder.append(random.nextInt(10));
        }
        ibanBuilder.append(nie.substring(1, 8)); // Agregamos los últimos 7 dígitos del NIE para hacer el IBAN único

        return ibanBuilder.toString();
    }

    public String getIban() {
        return iban;
    }

    public String getNie() {
        return nie;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            registrarMovimiento("Ingreso", cantidad);
            if (cantidad > LIMITE_NOTIFICACION_HACIENDA) {
                System.out.println("AVISO: Notificar a hacienda");
            }
        } else {
            System.out.println("Cantidad no válida para ingreso.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo - cantidad >= SALDO_MINIMO) {
            saldo -= cantidad;
            registrarMovimiento("Retirada", cantidad);
            if (saldo < 0) {
                System.out.println("AVISO: Saldo negativo");
            }
            if (cantidad > LIMITE_NOTIFICACION_HACIENDA) {
                System.out.println("AVISO: Notificar a hacienda");
            }
        } else {
            System.out.println("Cantidad no válida para retirada o saldo insuficiente.");
        }
    }

    private void registrarMovimiento(String tipo, double cantidad) {
        if (movimientos.size() < LIMITE_MOVIMIENTOS) {
            movimientos.add(new Movimiento(tipo, cantidad));
        } else {
            System.out.println("No se pueden registrar más movimientos.");
        }
    }

    public void mostrarDatos() {
        System.out.println("IBAN: " + iban);
        System.out.println("NIE: " + nie);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
