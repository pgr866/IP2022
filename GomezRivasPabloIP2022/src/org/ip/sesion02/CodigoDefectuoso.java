package org.ip.sesion02;

public class CodigoDefectuoso {

	public static void main(String[] args) {

		int codigo = 25000;
		if((codigo >= 14681 && codigo <= 15681) || (codigo >= 70001 && codigo <= 79999) || (codigo >= 99999 && codigo <= 110110))
			System.out.println("El código " + codigo + " corresponde a un artículo DEFECTUOSO");
		else
			System.out.println("El código " + codigo + " corresponde a un artículo NO DEFECTUOSO");
	}
}
