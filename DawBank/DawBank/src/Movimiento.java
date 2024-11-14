import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimiento {
    private static int contador = 1;

    private int id;
    private String fecha;
    private String tipo;
    private double cantidad;

    public Movimiento(String tipo, double cantidad) {
        this.id = contador++;
        this.fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public void mostrarInfoMovimiento() {
        System.out.println("ID: " + id);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cantidad: " + cantidad);
    }
}
