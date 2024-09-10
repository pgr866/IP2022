package org.ip.tema05;

import java.math.BigInteger;

public class FactorialGrande {

	public static BigInteger factorial(int n) {
		BigInteger resultado = BigInteger.ONE;	// equivalente a new BigInteger("1")
		for (int i = 1; i <= n; i++)
			resultado = resultado.multiply(new BigInteger(i + ""));
		return resultado;
	}

	public static void main(String[] args) {
		System.out.println("50! = " + factorial(50));
	}
}
