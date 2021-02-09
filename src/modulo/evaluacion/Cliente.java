package modulo.evaluacion;

public class Cliente extends Usuario {
	private Integer rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private Integer salud;
	private String direccion;
	private String comuna;
	private Integer edad;

	public Cliente() {
		super();

	}

	public Cliente(String nombre, String fechNac, Integer run, Integer rut, String nombres, String apellidos,
			String telefono, String afp, Integer salud, String direccion, String comuna, Integer edad) {
		super(nombre, fechNac, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.salud = salud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public Integer getSalud() {
		return salud;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String obtenerNombre() {
		return nombres + " " + apellidos;
	}

	public String obtenerSistemaSalud() {
		String sistSalud;
		if (salud == 1) {
			sistSalud = "Fonasa";
		} else {
			sistSalud = "Isapre";
		}
		return sistSalud;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", salud=" + salud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad="
				+ edad + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Dirección del cliente: " + getDireccion() + "\nComuna del cliente : " + getComuna());
	}

}
