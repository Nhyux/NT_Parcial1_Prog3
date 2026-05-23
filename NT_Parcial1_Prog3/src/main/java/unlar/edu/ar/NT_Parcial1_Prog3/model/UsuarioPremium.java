package unlar.edu.ar.NT_Parcial1_Prog3.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor

public class UsuarioPremium extends Usuario {

    private  double porcentajeDescuento = 0.15;

    public UsuarioPremium(String idUsuario, String nombreCompleto, double porcentajeDescuento) {
        super(idUsuario, nombreCompleto);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularTotalConDescuento(double costoBase) {
        return costoBase * (1.0 - porcentajeDescuento);
    }

}
