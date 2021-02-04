package AibarHernanEzequiel;

import org.junit.Test;

public class EstacionPeajeTest {
	
	
	@Test
	public void queQueObtieneListaDeCabinasOrdenaPorImporteDescendente () {
		
		EstacionDePeaje nuevo = new EstacionDePeaje();
		Cabina nueva = new Cabina(1);
		nueva.pagar(new AutoBus("1001", new Tag(1)));
		nueva.pagar(new Coche("1002"));
		nueva.pagar(new Moto("1003"));
		
		nuevo.agregarCabinas(new Cabina (1));
		nuevo.agregarCabinas(new Cabina (2));
		nuevo.agregarCabinas(new Cabina (3));
	}
	
	
	
	
	
}
