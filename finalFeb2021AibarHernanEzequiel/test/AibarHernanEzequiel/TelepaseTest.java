package AibarHernanEzequiel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TelepaseTest {
	
	
	@Test
	public void queVerificaQueSeEncuentreElTagConIdUno () throws TagNoEncontradoException {
		//Para este test se debeinvocar al metodo public Boolean verifcarExiste(Tag tag)
		//el mismo no se puede modificar
		Tag nuevo = new Tag (2);
		Telepase tele = new Telepase(1);
		assertTrue(tele.cargarTag(nuevo));
		assertTrue(tele.verifcarExiste(nuevo));
		assertEquals(2, tele.getCantidadTag());
	}
	

	@Test (expected = SaldoInsuficienteError.class)
	public void queAlPasarAutobusconSaldoInsuficienteLanceUnaExcepcion () throws TagNoEncontradoException, VehiculoNoPermitidoExceptions, SaldoInsuficienteError {
		try {
		Tag tag = new Tag(2);
		AutoBus nuevo = new AutoBus("1001",tag);
		Telepase tele = new Telepase(1);
		tele.cargarTag(tag);
		tele.pagarAutomatico(nuevo);
		}catch(SaldoInsuficienteError e) {
			e.printStackTrace();
			throw new SaldoInsuficienteError();
		}
	}
	
	@Test (expected = TagNoEncontradoException.class)
	public void queAlPasarUnAutobusconUnTagInvalidoLanceUnaExcepcion () throws TagNoEncontradoException, VehiculoNoPermitidoExceptions, SaldoInsuficienteError {
		try {
		Tag tag = new Tag(2);
		AutoBus nuevo = new AutoBus("1001",tag);
		Telepase tele = new Telepase(1);
		tele.cargarTag(tag);
		nuevo.recargarTag(300.0);
		tele.pagarAutomatico(nuevo);
		}catch(TagNoEncontradoException e) {
			e.printStackTrace();
			throw new TagNoEncontradoException();
		}
	}
	
	

}
