package AibarHernanEzequiel;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class EstacionPeajeTest {
	
	
	@Test
	public void queQueObtieneListaDeCabinasOrdenaPorImporteDescendente () {
		
		Set<Cabina>lista_cabinas = new HashSet<Cabina>();
		EstacionDePeaje nuevo = new EstacionDePeaje();
		Cabina nueva = new Cabina(1);
		Cabina nueva2 = new Cabina(2);
		Cabina nueva3 = new Cabina(3);
		nueva.pagar(new AutoBus("1001", new Tag(1)));
		nueva2.pagar(new Coche("1002"));
		nueva3.pagar(new Moto("1003"));
		lista_cabinas.add(nueva3);
		lista_cabinas.add(nueva2);
		lista_cabinas.add(nueva);
		
		System.out.println(nuevo.otenerCabinasOrdenadaImporteDescendente(lista_cabinas));
	}
	
	
	
	
	
}
