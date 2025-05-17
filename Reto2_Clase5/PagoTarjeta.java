package Reto2_Clase5;

public class PagoTarjeta extends MetodoPago {
    private double saldo;

    public PagoTarjeta(double monto, double saldo) {
        super(monto);
        this.saldoDisponible = saldo;
    }

    @Override
    public boolean autenticar() {
        return saldo >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando tarjeta por $" + monto);
    }
}

