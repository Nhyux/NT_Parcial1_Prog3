package unlar.edu.ar.NT_Parcial1_Prog3.repository;

import org.springframework.stereotype.Repository;
import unlar.edu.ar.NT_Parcial1_Prog3.model.Estacion;
import unlar.edu.ar.NT_Parcial1_Prog3.model.Usuario;

import java.util.List;
import java.util.ArrayList;

@Repository
public class EcoRideRepository {
    private final List<Estacion> estaciones = new ArrayList<>();
    private final List<Usuario> usuarios = new ArrayList<>();

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }   

    public void agregarEstacion(Estacion estacion) {
        estaciones.add(estacion);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
