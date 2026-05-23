package unlar.edu.ar.NT_Parcial1_Prog3.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor

public class Monopatin extends Vehiculo {

    private boolean amortiguacionReforzada;

    public Monopatin(String patente, int porcentajeBateria, double tarifaBase, boolean amortiguacionReforzada) {
        super(patente, porcentajeBateria, tarifaBase);
        this.amortiguacionReforzada = amortiguacionReforzada;
    }
    
}
