package cl.grupo5.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cl.grupo5.models.dto.Capacitation;
import cl.grupo5.models.service.*;

@WebServlet("/CapacitationListController")
public class CapacitationListController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CapacitationService capacitacionService;
    
    @Override
    public void init() throws ServletException {
        super.init();
        capacitacionService = new CapacitationService();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener la lista de capacitaciones desde la capa de servicio
        List<Capacitation> capacitaciones = capacitacionService.obtenerTodasLasCapacitaciones();

        // Guardar la lista de capacitaciones en el atributo del request para que pueda ser accedida desde la vista
        request.setAttribute("capacitaciones", capacitaciones);

        // Redirigir a la vista "CapacitationList.jsp" para mostrar la lista de capacitaciones
        request.getRequestDispatcher("/views/CapacitationList.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros enviados desde el formulario
        int idCapacitacion = Integer.parseInt(request.getParameter("id-capacitacion"));
        String nombreCapacitacion = request.getParameter("nombre-capacitacion");
        String rutSolicitante = request.getParameter("rut-capacitacion");
        String fechaCapacitacion = request.getParameter("fecha-capacitacion");
        String horaCapacitacion = request.getParameter("hora-capacitacion");
        String lugarCapacitacion = request.getParameter("lugar-capacitacion");
        int duracionCapacitacion = Integer.parseInt(request.getParameter("duracion-capacitacion"));
        int cantidadAsistentes = Integer.parseInt(request.getParameter("asistentes-capacitacion"));

        // Crear una nueva capacitación con los datos recibidos
        Capacitation nuevaCapacitacion = new Capacitation(idCapacitacion, nombreCapacitacion, rutSolicitante,
                fechaCapacitacion, horaCapacitacion, lugarCapacitacion, duracionCapacitacion, cantidadAsistentes);

        // Agregar la nueva capacitación a la capa de servicio
        capacitacionService.agregarCapacitacion(nuevaCapacitacion);

        // Redirigir a la vista "CapacitationList.jsp" para mostrar la lista actualizada de capacitaciones
        doGet(request, response);
    }
}
