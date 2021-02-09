package modulo.evaluacion;

public class Usuario implements Asesoria {
	private String nombre;
	private String fechNac;
	private Integer run;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String fechNac, Integer run) {
		super();
		this.nombre = nombre;
		this.fechNac = fechNac;
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechNac() {
		return fechNac;
	}

	public void setFechNac(String fechNac) {
		this.fechNac = fechNac;
	}

	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {
		this.run = run;
	}

	public String mostrarEdad() {
		Integer edad = 2021 - Integer.parseInt(fechNac.substring(6, 10));
		return "El usuario tiene " + edad + " años";
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechNac=" + fechNac + ", run=" + run + "]";
	}

	@Override
	public void analizarUsuario() {
		System.out.println("El nombre del usuario es " + getNombre() + "\nEl run del usuario es " + getRun());

	}

}
