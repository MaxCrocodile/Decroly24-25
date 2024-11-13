public class CuentaBancaria {

    private static int contador = 0;

    private int iban;
    private int saldo;
    private int movimentos;
    private String titular;

    public CuentaBancaria(int iban, int saldo, int movimentos, String titular) {
        this.iban = iban;
        this.saldo = saldo;
        this.movimentos = movimentos;
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getIban() {
        return this.iban;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int getMovimentos() {
        return this.movimentos;
    }
}
