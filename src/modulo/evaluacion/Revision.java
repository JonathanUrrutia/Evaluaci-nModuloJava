package modulo.evaluacion;

public class Revision {
	private Integer identRev;
	private Integer identVis;
	private String nombreRev;
	private String detalle;
	private Integer estado;

	public Revision() {
		super();
	}

	public Revision(Integer identRev, Integer identVis, String nombreRev, String detalle, Integer estado) {
		super();
		this.identRev = identRev;
		this.identVis = identVis;
		this.nombreRev = nombreRev;
		this.detalle = detalle;
		this.estado = estado;
	}

	public Integer getIdentRev() {
		return identRev;
	}

	public void setIdentRev(Integer identRev) {
		this.identRev = identRev;
	}

	public Integer getIdentVis() {
		return identVis;
	}

	public void setIdentVis(Integer identVis) {
		this.identVis = identVis;
	}

	public String getNombreRev() {
		return nombreRev;
	}

	public void setNombreRev(String nombreRev) {
		this.nombreRev = nombreRev;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [identRev=" + identRev + ", identVis=" + identVis + ", nombreRev=" + nombreRev + ", detalle="
				+ detalle + ", estado=" + estado + "]";
	}

	
}
