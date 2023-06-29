package cl.grupo5.models.dto;

public class Capacitation {
	
	private int idCapacitacion;
	private String nombreCapacitacion;
	private String rutSolicitante;
	private String fechaCapacitacion;
	private String horaCapacitacion;
	private String lugarCapacitacion;
	private int duracionCapacitacion;
	private int cantidadAsistentes;
	
	
	public Capacitation() {
		
	}


	public Capacitation(int idCapacitacion, String nombreCapacitacion, String rutSolicitante, String fechaCapacitacion,
			String horaCapacitacion, String lugarCapacitacion, int duracionCapacitacion, int cantidadAsistentes) {
		this.idCapacitacion = idCapacitacion;
		this.nombreCapacitacion = nombreCapacitacion;
		this.rutSolicitante = rutSolicitante;
		this.fechaCapacitacion = fechaCapacitacion;
		this.horaCapacitacion = horaCapacitacion;
		this.lugarCapacitacion = lugarCapacitacion;
		this.duracionCapacitacion = duracionCapacitacion;
		this.cantidadAsistentes = cantidadAsistentes;
	}


	public int getIdCapacitacion() {
		return idCapacitacion;
	}


	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}


	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}


	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}


	public String getRutSolicitante() {
		return rutSolicitante;
	}


	public void setRutSolicitante(String rutSolicitante) {
		this.rutSolicitante = rutSolicitante;
	}


	public String getFechaCapacitacion() {
		return fechaCapacitacion;
	}


	public void setFechaCapacitacion(String fechaCapacitacion) {
		this.fechaCapacitacion = fechaCapacitacion;
	}


	public String getHoraCapacitacion() {
		return horaCapacitacion;
	}


	public void setHoraCapacitacion(String horaCapacitacion) {
		this.horaCapacitacion = horaCapacitacion;
	}


	public String getLugarCapacitacion() {
		return lugarCapacitacion;
	}


	public void setLugarCapacitacion(String lugarCapacitacion) {
		this.lugarCapacitacion = lugarCapacitacion;
	}


	public int getDuracionCapacitacion() {
		return duracionCapacitacion;
	}


	public void setDuracionCapacitacion(int duracionCapacitacion) {
		this.duracionCapacitacion = duracionCapacitacion;
	}


	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}


	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}


	@Override
	public String toString() {
		return "Capacitation [idCapacitacion=" + idCapacitacion + ", nombreCapacitacion=" + nombreCapacitacion
				+ ", rutSolicitante=" + rutSolicitante + ", fechaCapacitacion=" + fechaCapacitacion
				+ ", horaCapacitacion=" + horaCapacitacion + ", lugarCapacitacion=" + lugarCapacitacion
				+ ", duracionCapacitacion=" + duracionCapacitacion + ", cantidadAsistentes=" + cantidadAsistentes + "]";
	}
	

}
