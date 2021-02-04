package AibarHernanEzequiel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestCabina {

	@Test
	public void queVerificaQueCuenteCorrectamenteLaCantidadDeVehiculosQuePaSanPorUnacabina() {
		Cabina nueva = new Cabina(1);
		nueva.pagar(new AutoBus("1001",new Tag(2)));
		nueva.pagar(new Coche("1002"));
		nueva.pagar(new Moto("1003"));
		Integer cantidad = 3;
		assertEquals(cantidad,nueva.getContadorDeVehiculo());
	}


	@Test
	public void queVerificaQueSeRecaudeCorrectaMenteElPagoDeUnVehiculo() {
		Cabina nueva = new Cabina(1);
		nueva.pagar(new AutoBus("1001",new Tag(2)));
		Double valor_esperado = 200.0;
		assertEquals(valor_esperado, nueva.getRecaudacion());
	}

	
}
