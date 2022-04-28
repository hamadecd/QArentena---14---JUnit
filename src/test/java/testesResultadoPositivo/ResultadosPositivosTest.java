package testesResultadoPositivo;

import org.junit.jupiter.api.AfterAll;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import softwareAlvo.Calculadora;



@TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class)
class ResultadosPositivosTest {
	
	static Calculadora c;
	
	@BeforeAll
	public static void preCondicaoGeral() {
		c = new Calculadora();
		System.out.println("00 - Pre condicao geral");
	}
	
	/*
	 * Com essa anotacao o teste vai acontecer toda vez antes de uma anotacao @Test
	 * @BeforeEach void preCondicaoTeste() {
	 * System.out.println("Pre condicao TESTE"); }
	 * 
	 * Com essa anotacao o teste vai acontecer toda vez depois de uma anotacao @Test
	 * @AfterEach void posCondicaoTeste() {
	 * System.out.println("Pos condicao TESTE"); }
	 */
	
	@Test
	@DisplayName("Soma de positivo e negativo -> positivo")
	@Order(1)
	//@Disabled("Aguarda a correção do teste #123")
	public void testSomaPositivoENegativo_ResultadoPositivo() {
		System.out.println("01 - Soma positivo negativo -> positivo");
		//assertEquals(3,c.soma(5, -2));
		assertThat(c.soma(2, -1), is(1));
	}

	@Test
	@DisplayName("Soma positivos -> Resultado positivo")
	@Order(2)
	public void testSomaPositivos_ResultadoPositivo() {
		System.out.println("02 - Soma positivos -> positivo");
		assertThat("soma positivos - resultado positivo", c.soma(2, 5), is(7) );
	}
	
	int v1;
	int v2;
	int r;
	
	@ParameterizedTest
	@CsvFileSource(resources= "/dados.csv", numLinesToSkip = 1, delimiter = ';')
	public void testSomaNegativoPositivo_ResultadoPositivo(String valor1, String valor2, String resultado) {
		v1 = Integer.parseInt(valor1);
		v2 = Integer.parseInt(valor2);
		r = Integer.parseInt(resultado);
		System.out.println("CSV -> " + v1 + " " + v2 + " " + r);
		assertThat(c.soma(v1, v2), is(r));
	}
	
	@AfterAll
	public static void posCondicaoGeral() {
		System.out.println("10 - Pos condicao geral");
	}
	
	

}
