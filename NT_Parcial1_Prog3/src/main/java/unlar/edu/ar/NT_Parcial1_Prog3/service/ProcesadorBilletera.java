package unlar.edu.ar.NT_Parcial1_Prog3.service;

public class ProcesadorBilletera implements ProcesadorPago {

    @Override
    public void procesarCobro(double monto) {
        System.out.println("Cobro exitoso mediante API de Billetera Virtual. Monto procesado: $" + monto);
        // Lógica específica para procesar el pago con billetera digital
    }
    
}
