package unlar.edu.ar.NT_Parcial1_Prog3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unlar.edu.ar.NT_Parcial1_Prog3.dto.AlquilerRequestDTO;
import unlar.edu.ar.NT_Parcial1_Prog3.model.Vehiculo;
import unlar.edu.ar.NT_Parcial1_Prog3.service.AlquilerService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/alquileres")
public class AlquilerController {

    @Autowired
    private AlquilerService alquilerService;

    @GetMapping("/desbloquear")
    public ResponseEntity<?> desbloquearVehiculo(@RequestBody AlquilerRequestDTO request) {
        try {
            // Invoca al servicio para que corra toda la secuencia lógica
            Vehiculo vehiculoDesbloqueado = alquilerService.procesarDesbloqueo(
                request.getIdUsuario(), 
                request.getPatente(), 
                request.getMetodoPago());   


            // Si todo sale bien, retorna respuesta exitosa detallando el rodado
            return ResponseEntity.ok(vehiculoDesbloqueado);

        } catch (RuntimeException e) {
            // Cumplimos la regla B: Interceptamos errores de negocio y devolvemos mensaje claro
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", e.getMessage());
            
            // Retornamos un estado 400 (Bad Request) con la alarma correspondiente
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }
}
