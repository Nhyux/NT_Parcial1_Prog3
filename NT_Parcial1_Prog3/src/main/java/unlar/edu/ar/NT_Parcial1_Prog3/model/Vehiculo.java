package unlar.edu.ar.NT_Parcial1_Prog3.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public abstract class Vehiculo {
    private String patente;
    private int porcentajeBateria;
    private  double tarifaBase;
}
