package testesResultadosNegativos;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import softwareAlvo.Calculadora;

class ResultadosNegativosTest {
	
	static Calculadora c;
	
	@BeforeAll
	public static void preCondicaoGeral() {
		c = new Calculadora();
		System.out.println("00 - Pre condicao geral");
	}

	@Test
	@DisplayName("Valida positivo - negativo menor que zero")
	@Order(1)
	public void testSubstracaoPositivoNegativo_ResultadoMenorZero() {
		System.out.println("01 - Subtracao positivo negativo -> menor que zero");
		// esse teste vai falhar porque sinal negativo com negativo vira positivo la no metodo
		assertThat("subtracao positivo e negativo menor que zero", c.subtracao(3, -4), lessThan(0));
	}

	@Test
	@DisplayName("Valida negativo - positivo menor que zero")
	@Order(2)
	public void testSubstracaoNegativoPositivo_ResultadoMenorZero() {
		System.out.println("02 - Subtracao negativo positivo -> menor que zero");
		assertThat("subtracao negativo e positivo menor que zero", c.subtracao(-5, 4), lessThan(0));
	}

	@Test
	@DisplayName("Valida positivo + negativo menor que zero")
	@Order(3)
	public void testSomaPositivoNegativo_ResultadoMenorZero() {
		System.out.println("03 - Soma positivo negativo -> menor que zero");
		assertThat("soma positivo e negativo menor que zero", c.soma(3, -9), lessThan(0));
	}

	@Test
	@DisplayName("Valida negativo + positivo menor que zero")
	@Order(4)
	public void testSomaNegativoPositivo_ResultadoMenorZero() {
		System.out.println("04 - Soma negativo positivo -> menor que zero");
		assertThat("soma negativo + positivo menor que zero", c.soma(-8, 4), lessThan(0));
	}
	
}
