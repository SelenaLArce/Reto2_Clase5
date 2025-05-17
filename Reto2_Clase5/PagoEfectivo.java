package Reto2_Clase5;

public class PagoEfectivo extends MetodoPago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    //Override es una subclase, confirmar después
    public boolean autenticar() {
        return true; 
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando efectivo por $" + monto);
    }
}

