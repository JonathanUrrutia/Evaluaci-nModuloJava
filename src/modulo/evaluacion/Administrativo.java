package modulo.evaluacion;

public class Administrativo extends Usuario {
	private String area;
	private String experiencia;

	public Administrativo() {
		super();

	}

	public Administrativo(String nombre, String fechNac, Integer run, String area, String experiencia) {
		super(nombre, fechNac, run);
		this.area = area;
		this.experiencia = experiencia;

	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return super.toString() + "Administrativo [area=" + area + ", experiencia=" + experiencia + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área administrativa:" + area + "\nExperiencia previa:" + experiencia);
	}
}
