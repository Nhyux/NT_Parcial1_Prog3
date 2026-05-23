package unlar.edu.ar.NT_Parcial1_Prog3.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor

public class BicicletaElectrica extends Vehiculo {

    private int capacidadCanasto;

    public BicicletaElectrica(String patente, int porcentajeBateria, double tarifaBase, int capacidadCanasto) {
        super(patente, porcentajeBateria, tarifaBase);
        this.capacidadCanasto= capacidadCanasto;
    }
    
}
