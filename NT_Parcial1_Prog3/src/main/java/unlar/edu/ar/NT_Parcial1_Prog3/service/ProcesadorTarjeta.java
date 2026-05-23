package unlar.edu.ar.NT_Parcial1_Prog3.service;

public class ProcesadorTarjeta implements ProcesadorPago {
    @Override
    public void procesarCobro(double monto) {
        System.out.println("Transacción aprobada por pasarela externa de Tarjeta. Monto debitado: $" + monto);
        // Lógica específica para procesar el pago con tarjeta
    }
}
