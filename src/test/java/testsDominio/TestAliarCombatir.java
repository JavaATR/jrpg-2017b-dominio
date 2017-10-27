package testsDominio;

import org.junit.Assert;
import org.junit.Test;

import dominio.Alianza;
import dominio.Asesino;
import dominio.Guerrero;
import dominio.Humano;
import dominio.MyRandomStub;

public class TestAliarCombatir {
	public static final double argumentoX = 0.49;
	public static final int argumentoY = 3;
	public static final int salud = 105;

	@Test
	public void testCrearAlianza() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Guerrero(), 1);

		Assert.assertNull(h.getClan());
		Assert.assertNull(h2.getClan());
		h.aliar(h2);
		Assert.assertNotNull(h.getClan());
		Assert.assertNotNull(h2.getClan());
	}

	@Test
	public void testDanar() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Asesino(), 1);
		h.setRandom(new MyRandomStub(argumentoX, argumentoY));
		h2.setRandom(new MyRandomStub(argumentoX, argumentoY));
		Assert.assertTrue(h2.getSalud() == salud);
		if (h.atacar(h2) != 0) {
			Assert.assertTrue(h2.getSalud() < salud);
		}
		else {
			Assert.assertTrue(h2.getSalud() == salud);
		}
	}

	@Test
	public void testAliar() {
		Humano h = new Humano("Nicolas", new Guerrero(), 1);
		Humano h2 = new Humano("Lautaro", new Guerrero(), 1);
		Alianza a1 = new Alianza("Los CacheFC");
		h.setRandom(new MyRandomStub(argumentoX, argumentoY));
		h2.setRandom(new MyRandomStub(argumentoX, argumentoY));
		Assert.assertNull(h2.getClan());
		Assert.assertNull(h.getClan());
		h.setClan(a1);
		Assert.assertNotNull(h.getClan());
		h.aliar(h2);
		Assert.assertTrue(h.getClan() == h2.getClan());
	}

}
