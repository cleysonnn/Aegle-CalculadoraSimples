
package br.com.cleyson.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	/*
	 * Seus testes n�o est�o errados, todos passam, o problema � que eles n�o dizem o que faz exatamente. 
	 * N�o tenha medo de escrever. Pode escrever como Ayla escreve. Ex:
	 * O m�todo testSoma() poderia ser escrito, de acordo com o que ele faz, 
	 * da seguinte forma 'testDeveSomarDoisValoresInteirosPositivosERetornarOResultado()'
	 * Se houver necessidade, documente os testes, contudo, os testes j� devem dizer o que faz em seu nome
	 * 
	 * A baixo, modifiquei uns m�todos coloando exemplos de uma escrita mais clara.
	 * 
	 */
	
	
	private Calculadora cal;

	/*
	 * https://howtodoinjava.com/junit-5-tutorial/
	 * https:junit.org/junit5/docs/current/user-guide/
	 * 
	 */

	@BeforeEach
	void setup() {
		cal = new Calculadora();

	}
	
	/**
	 * deve garantir que a soma de 3 + 7 retorne 10
	 * */
	@Test
	void testDeveSomarDoisValoresInteirosPositivosERetornarOResultado() {
		assertEquals(10, cal.soma(3, 7));
	}
	
	/**
	 * deve garantir que a subtra��o de 7 - 6 seja igual a 1
	 * */
	@Test
	void testDeveSubtrairDoisValoresInteirosPositivos_retornaPositivo() {
		assertEquals(1, cal.subtrair(7, 6));
	}
	
	/**
	 * deve garantir que a multiplica��o de 3 * 9 seja igual a 27
	 * */
	@Test
	void testDeveMultiplicarDoisNumerosInteirosPositivos_E_RetornarOResultado() {
		assertEquals(27, cal.multiplicar(3, 9));
	}

	/*
	 * Esse teste foi o mais 'agressivo'. Ele est� testanto um caso inesperado, um fluxo que ocorre uma exeption,
	 * mas n�o explica no nome do m�todo
	 *  */
	@Test
	void testDeveLancharUmaExecaoNaoDivisivelPorZero0(){

		Exception exe = assertThrows(DivisaoPor0Exception.class, () -> cal.divisao(6, 0));
		assertEquals("divisao por 0", exe.getMessage());

	}

	@Test
	void testDeveTirarARaizDe11() {
		assertEquals(11, cal.raiz(121));

	}

}
