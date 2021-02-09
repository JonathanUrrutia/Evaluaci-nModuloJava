package modulo.evaluacion;

public class Profesional extends Usuario {
	private String titulo;
	private String fechIngre;

	public Profesional() {
		super();

	}

	public Profesional(String nombre, String fechNac, Integer run, String titulo, String fechIngre) {
		super(nombre, fechNac, run);
		this.titulo = titulo;
		this.fechIngre = fechIngre;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechIngre() {
		return fechIngre;
	}

	public void setFechIngre(String fechIngre) {
		this.fechIngre = fechIngre;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechIngre=" + fechIngre + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título profesional: " + getTitulo() + "\nFecha de ingreso: " + getFechIngre());
	}
}
