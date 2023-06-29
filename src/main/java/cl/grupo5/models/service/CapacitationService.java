package cl.grupo5.models.service;

import java.util.ArrayList;
import java.util.List;

import cl.grupo5.models.dto.Capacitation;

public class CapacitationService {
    private List<Capacitation> capacitaciones;

    public CapacitationService() {
        capacitaciones = new ArrayList<>();
    }

    public List<Capacitation> obtenerTodasLasCapacitaciones() {
        return capacitaciones;
    }

    public void agregarCapacitacion(Capacitation capacitacion) {
        capacitaciones.add(capacitacion);
    }
}
