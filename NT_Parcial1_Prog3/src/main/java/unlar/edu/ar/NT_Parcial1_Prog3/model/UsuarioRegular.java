package unlar.edu.ar.NT_Parcial1_Prog3.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class UsuarioRegular extends Usuario {

    public UsuarioRegular(String idUsuario, String nombreCompleto) {
        super(idUsuario, nombreCompleto);
    }

    @Override
    public double calcularTotalConDescuento(double costoBase) {
        return costoBase; // No aplica descuento para usuarios regulares
    }
    
}
