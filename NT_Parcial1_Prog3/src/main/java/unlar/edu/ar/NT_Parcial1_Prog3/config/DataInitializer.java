package unlar.edu.ar.NT_Parcial1_Prog3.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import unlar.edu.ar.NT_Parcial1_Prog3.model.*;
import unlar.edu.ar.NT_Parcial1_Prog3.repository.EcoRideRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private EcoRideRepository repository;

    @Override
    public void run(String... args) throws Exception {
        
        Usuario usuario1 = new UsuarioRegular("U001", "Alan Ariel");
        Usuario usuario2 = new UsuarioPremium("U002", "Matias Isaias", 0.15);

        repository.agregarUsuario(usuario1);
        repository.agregarUsuario(usuario2);

        Vehiculo monoApto = new Monopatin("MONO123", 80, 500, true);
        Vehiculo monoBajo = new Monopatin("MONO-ROTO", 10, 500.0, false);
        Vehiculo biciApta = new BicicletaElectrica("BICI456", 95,700.0, 1500);

        Estacion estacionCentro = new Estacion();
        estacionCentro.setNombre("Estación Centro");
        estacionCentro.getListaVehiculos().add(monoApto);
        estacionCentro.getListaVehiculos().add(monoBajo);
        estacionCentro.getListaVehiculos().add(biciApta);

        repository.agregarEstacion(estacionCentro);

        System.out.println("Datos de prueba inicializados en el repositorio de EcoRide.");

    }
}
