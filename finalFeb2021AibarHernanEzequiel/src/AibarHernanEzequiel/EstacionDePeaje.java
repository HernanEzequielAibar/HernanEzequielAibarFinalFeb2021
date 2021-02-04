package AibarHernanEzequiel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EstacionDePeaje {

	private List<Cabina> cabinas;
	
	/*
	 * Al momento de la creacion de la estacion de peajes se deben crear todas las cabianas
	 * donde en la posicion 0 hay una cabina de Telepase y el resto de las cabinas son comunes 
	 */
	public EstacionDePeaje() {
		this.cabinas = new ArrayList<Cabina>();
	}

	//Metodo que agrega todas las cabinas (No Obligatorio)
	public void agregarCabinas(Cabina cabina) {
		this.cabinas.add(cabina);
	}

	/*
	 * obtiene todas un listado de cabinas ordenas por importe recaudado en forma descendete
	 */
	public Set<Cabina> otenerCabinasOrdenadaImporteDescendente(Collection<? extends Cabina> orden) {

		Set<Cabina> lista_cabinasOrdenandas = new HashSet<Cabina>(orden);
		return lista_cabinasOrdenandas;
		
	}

}
