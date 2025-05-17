package Reto2_Clase5;

public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(125.0),
                new PagoTarjeta(400.0, 150.0),
                new PagoTransferencia(500.0, false) 
                // La transferencia debe fallar
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                //Poner el get
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}

public abstract class MetodoPago implements Autenticable {
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen() {
        //Poner el get otra vez
        System.out.println("Tipo de pago: " + this.getClass().getSimpleName() + ". Cantidad en pesos: $" + monto);
    }
}

