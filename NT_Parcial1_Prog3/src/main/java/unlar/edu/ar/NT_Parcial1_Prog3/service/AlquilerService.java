package unlar.edu.ar.NT_Parcial1_Prog3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unlar.edu.ar.NT_Parcial1_Prog3.model.Usuario;
import unlar.edu.ar.NT_Parcial1_Prog3.model.Estacion;
import unlar.edu.ar.NT_Parcial1_Prog3.model.Vehiculo;
import unlar.edu.ar.NT_Parcial1_Prog3.repository.EcoRideRepository;

    
@Service
public class AlquilerService {

    @Autowired
    private EcoRideRepository repository;

    @Autowired
    private FabricaPagos fabricaPagos;

    public Vehiculo procesarDesbloqueo(String idUsuario, String patente, String metodoPago) {
        Vehiculo vehiculoEncontrado = null;
        Estacion estacionDelVehiculo = null;

        for (Estacion estacion : repository.getEstaciones()) {
            for (Vehiculo vehiculo : estacion.getListaVehiculos()) {
                if (vehiculo.getPatente().equals(patente)) {
                    vehiculoEncontrado = vehiculo;
                    estacionDelVehiculo = estacion;
                    break;
                }
            } 
            if (vehiculoEncontrado != null) {
                break;
            }
    }

    if (vehiculoEncontrado == null) {
        throw new RuntimeException("Vehículo con patente " + patente + " no encontrado.");
    }
    
    if (vehiculoEncontrado.getPorcentajeBateria() < 15) {
        throw new RuntimeException("El vehículo con patente " + patente + " no tiene suficiente batería para alquilar.");
    }

    Usuario usuarioComprador = null;
    for (Usuario usuario : repository.getUsuarios()) {
        if (usuario.getIdUsuario().equals(idUsuario)) {
            usuarioComprador = usuario;
            break;
        }
    }
    if (usuarioComprador == null) {
        throw new RuntimeException("Usuario con ID " + idUsuario + " no encontrado en el sistema de  EcoRide.");
    }

    double costoBase = vehiculoEncontrado.getTarifaBase();
    double costoFinal = usuarioComprador.calcularTotalConDescuento(costoBase);

    ProcesadorPago procesador = fabricaPagos.obtenerProcesador(metodoPago);
    procesador.procesarCobro(costoFinal);

    estacionDelVehiculo.getListaVehiculos().remove(vehiculoEncontrado);
    return vehiculoEncontrado;
  }
}
