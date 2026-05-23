package unlar.edu.ar.NT_Parcial1_Prog3.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Estacion {

    private String nombre;
    private List<Vehiculo> listaVehiculos = new ArrayList<>();
    
}
