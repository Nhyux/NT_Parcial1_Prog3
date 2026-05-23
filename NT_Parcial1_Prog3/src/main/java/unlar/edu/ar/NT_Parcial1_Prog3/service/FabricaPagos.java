package unlar.edu.ar.NT_Parcial1_Prog3.service;

import org.springframework.stereotype.Component;

@Component
public class FabricaPagos {
    public ProcesadorPago obtenerProcesador(String tipoPago) {
        if (tipoPago == null) {
            throw new IllegalArgumentException("El tipo de pago no puede ser nulo");
        }
        if (tipoPago.equalsIgnoreCase("Tarjeta")){
            return new ProcesadorTarjeta();
        } else if (tipoPago.equalsIgnoreCase("Billetera")) {
            return new ProcesadorBilletera();
        } else {
            throw new IllegalArgumentException("Tipo de pago no reconocido: " + tipoPago);
        }
    }

}
