package br.com.allan.teste;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import br.com.allan.metodos.Calculos;
import static junit.framework.Assert.*;

public class CalculosTest {
	Calculos c;
	@Before
	public void setUp() throws Exception {
		c = new Calculos();
	}

	@Test
	public void testSoma() {
		assertEquals(4, c.soma(2, 2));
	}

	@Test
	public void testSubtracao() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacao() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivisao() {
		assertEquals(2,c.divisao(4, 2));
	}

	@Test
	public void testCalculo() {
		assertEquals(2,c.calculo("2+2/2*1"));
	}

	@Test
	public void testTextoBinario() {
		fail("Not yet implemented");
	}

}
