package unlar.edu.ar.NT_Parcial1_Prog3.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlquilerRequestDTO {
    
    String idUsuario;
    String patente;
    String metodoPago;
    
}
