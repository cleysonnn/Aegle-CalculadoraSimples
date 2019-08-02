
package CalculadoraSimples;

public class Calculadora {

	public double soma(double a, double b) {
		return a + b;
	}

	public double subtrair(double a, double b) {
		return a - b;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public double divisao(double a, double b) throws DivisaoPor0Exception {
		if (b == 0) {
			throw new DivisaoPor0Exception("divisao por 0");

		}

		return a / b;
	}

	public double raiz(double a) {
		return Math.sqrt(a);
	}

}
