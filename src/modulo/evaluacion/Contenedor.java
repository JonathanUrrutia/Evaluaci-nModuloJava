package modulo.evaluacion;

import java.util.Iterator;
import java.util.List;

public class Contenedor {
	private List<Asesoria> listaAses;
	private List<Capacitacion> listaCap;

	public Contenedor() {

	}

	public Contenedor(List<Asesoria> listaAses, List<Capacitacion> listaCap) {
		this.listaAses = listaAses;
		this.listaCap = listaCap;
	}

	public List<Asesoria> getListaAses() {
		return listaAses;
	}

	public void setListaAses(List<Asesoria> listaAses) {
		this.listaAses = listaAses;
	}

	public List<Capacitacion> getListaCap() {
		return listaCap;
	}

	public void setListaCap(List<Capacitacion> listaCap) {
		this.listaCap = listaCap;
	}

	public void almacenarCliente(Cliente cliente) {
		listaAses.add(cliente);
	}

	public void almacenarProfesional(Profesional profe) {
		listaAses.add(profe);
	}

	public void almacenarAdministrativo(Administrativo admin) {
		listaAses.add(admin);

	}

	public void almacenarCapacitacion(Capacitacion cap) {
		listaCap.add(cap);

	}

	public void eliminarUsuario(String rutUsua) {
		Iterator<Asesoria> it = listaAses.iterator();
		while (it.hasNext()) {
			String target = it.next().toString();
			if (target.contains(rutUsua)) {
				it.remove();
				System.out.println("Usuario eliminado.");
			}

		}
		System.out.println("Usuario no encontrado.");
	}

	public void listarUsuarios() {
		for (Asesoria asesAux : listaAses) {
			asesAux.analizarUsuario();

		}
	}

	public void listarUsuarioTipo(String tipoUsu) {
		for (Asesoria asesAux : listaAses) {
			if (tipoUsu.toLowerCase().equals("cliente")) {
				if (asesAux instanceof Cliente) {
					asesAux.analizarUsuario();
				}
			} else if (tipoUsu.toLowerCase().equals("profesional")) {
				if (asesAux instanceof Profesional) {
					asesAux.analizarUsuario();
				}
			} else if (tipoUsu.toLowerCase().equals("administrativo")) {
				if (asesAux instanceof Administrativo) {
					asesAux.analizarUsuario();
				}
			}

		}

	}

	public void listarCapacitaciones(List<Asesoria> lista) {
		for (Capacitacion capAux : listaCap) {
			System.out.println(capAux.mostrarDetalle());
			for (Asesoria asesAux : lista) {
				if (asesAux instanceof Cliente) {
					if (asesAux.toString().contains(String.valueOf(capAux.getRutCliente()))) {
						asesAux.analizarUsuario();
					}
				}

			}

		}

	}
}
