package modulo.evaluacion;

public class Capacitacion {
	private Integer identificador;
	private Integer rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private Integer asistentes;

	public Capacitacion() {
		super();
	}

	public Capacitacion(Integer identificador, Integer rutCliente, String dia, String hora, String lugar,
			String duracion, Integer asistentes) {
		super();
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.asistentes = asistentes;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Integer getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(Integer asistentes) {
		this.asistentes = asistentes;
	}

	public String mostrarDetalle() {
		return "La capacitacion sera en " + getLugar() + " a las " + getHora() + " del dia " + getDia() + " y durara "
				+ getDuracion() + " minutos";
	}

	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rut=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", duracion=" + duracion + ", asistentes=" + asistentes + "]";
	}

}
