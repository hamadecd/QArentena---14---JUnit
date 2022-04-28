package testesResultadosIgualZero;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import softwareAlvo.Calculadora;

class ResultadosIgualZero {

	static Calculadora c;

	@BeforeAll
	public static void preCondicaoGeral() {
		c = new Calculadora();
		System.out.println("00 - Pre condicao geral");
	}

	@Test
	@DisplayName("Valida positivo + negativo igual a zero")
	@Order(1)
	public void testSomaPositivoNegativo_ResultadoIgualZero() {
		System.out.println("01 - Soma positivo negativo -> zero");
		assertThat("soma positivo e negativo igual a zero", c.soma(3, -3), is(0));
	}
	
	@Test
	@DisplayName("Valida negativo + positivo igual a zero")
	@Order(2)
	public void testSomaNegativoPositivo_ResultadoIgualZero() {
		System.out.println("02 - Soma negativo positivo -> zero");
		assertThat("soma negativo e positivo igual a zero", c.soma(-3, 3), is(0));
	}

	@Test
	@DisplayName("Valida positivo - negativo igual a zero")
	@Order(3)
	public void testSubstracaoPositivoNegativo_ResultadoIgualZero() {
		System.out.println("03 - Subtracao positivo negativo -> zero");
		assertThat("subtracao positivo e negativo igual a zero", c.subtracao(3, -3), is(0));
	}
	
	@Test
	@DisplayName("Valida negativo - positivo igual a zero")
	@Order(4)
	public void testSubstracaoNegativoPositivo_ResultadoIgualZero() {
		System.out.println("04 - Subtracao negativo positivo -> zero");
		assertThat("subtracao negativo e positivo igual a zero", c.subtracao(-3, 3), is(0));
	}

}
