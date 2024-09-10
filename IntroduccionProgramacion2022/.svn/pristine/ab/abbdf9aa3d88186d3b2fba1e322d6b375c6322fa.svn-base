package org.ip.tema01.bethecompiler;

public class OctavoEjercicio {

	public static void main(String[] args) {
		int altura = 7;
		
		if ((altura % 2 == 1) && (altura >= 3)) {
			int espacios = altura / 2;
			int asteriscos = 1;
			
			for (int i = 0; (i < (altura + 1) / 2); i++) {
				for (int j = 0; j < espacios; j++){
					System.out.print("  ");
				}
				for (int j = 0; j < asteriscos; j++){
					System.out.print("* ");
				}
				System.out.println();
				espacios -= 1;
				asteriscos += 2;
			}
			
			espacios = 1;
			asteriscos = altura - 2;
			for (int i = 0; i < altura / 2; i++) {
				for (int j = 0; j < espacios; j++){
					System.out.print("  ");
				}
				for (int j = 0; j < asteriscos; j++){
					System.out.print("* ");
				}
				System.out.println();
				espacios += 1;
				asteriscos -= 2;
			}
		}
		else {
			System.out.println("El valor de la altura debe ser impar positivo");
		}
	}
}
