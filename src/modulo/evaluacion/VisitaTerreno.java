package modulo.evaluacion;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaTerreno {
	private Integer identVisita;
	private String rutCliente;
	private LocalDate diaAcc;
	private LocalTime horaAcc;
	private String lugar;
	private String comentario;

	public VisitaTerreno() {
		super();
		
	}

	public VisitaTerreno(Integer identVisita, String rutCliente, LocalDate diaAcc, LocalTime horaAcc, String lugar,
			String comentario) {
		super();
		this.identVisita = identVisita;
		this.rutCliente = rutCliente;
		this.diaAcc = diaAcc;
		this.horaAcc = horaAcc;
		this.lugar = lugar;
		this.comentario = comentario;
	}

	public Integer getIdentVisita() {
		return identVisita;
	}

	public void setIdentVisita(Integer identVisita) {
		this.identVisita = identVisita;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public LocalDate getDiaAcc() {
		return diaAcc;
	}

	public void setDiaAcc(LocalDate diaAcc) {
		this.diaAcc = diaAcc;
	}

	public LocalTime getHoraAcc() {
		return horaAcc;
	}

	public void setHoraAcc(LocalTime horaAcc) {
		this.horaAcc = horaAcc;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [identVisita=" + identVisita + ", rutCliente=" + rutCliente + ", diaAcc=" + diaAcc
				+ ", horaAcc=" + horaAcc + ", lugar=" + lugar + ", comentario=" + comentario + "]";
	}

}
