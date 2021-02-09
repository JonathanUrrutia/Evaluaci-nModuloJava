package modulo.evaluacion;

import java.time.LocalDate;
import java.time.LocalTime;

public class Accidente {
	private Integer identAcc;
	private String rutCliente;
	private LocalDate diaAcc;
	private LocalTime horaAcc;
	private String lugar;
	private String origen;
	private String consecuencias;

	public Accidente() {
		super();
	}

	public Accidente(Integer identAcc, String rutCliente, LocalDate diaAcc, LocalTime horaAcc, String lugar,
			String origen, String consecuencias) {
		super();
		this.identAcc = identAcc;
		this.rutCliente = rutCliente;
		this.diaAcc = diaAcc;
		this.horaAcc = horaAcc;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public Integer getIdentAcc() {
		return identAcc;
	}

	public void setIdentAcc(Integer identAcc) {
		this.identAcc = identAcc;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [identAcc=" + identAcc + ", rutCliente=" + rutCliente + ", diaAcc=" + diaAcc + ", horaAcc="
				+ horaAcc + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
	}

}
