package unlar.edu.ar.NT_Parcial1_Prog3.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class Usuario {

    private String idUsuario;
    private String nombreCompleto;

    public abstract double calcularTotalConDescuento(double costoBase);
     
}
