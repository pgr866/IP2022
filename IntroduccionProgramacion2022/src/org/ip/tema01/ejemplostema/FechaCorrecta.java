package org.ip.tema01.ejemplostema;

/*
 * Dados un dia, mes y anio de una fecha, indicar si la fecha es correcta
 * No se consideran los anios bisiestos.
 */
public class FechaCorrecta {

	public static void main(String[] args) {
		int dia, mes, anio;
		boolean fechaCorrecta; 
		
		dia = 29;
		mes = 3;
		anio = 1970;

		if (anio <= 0) { 
			fechaCorrecta = false;
		}
		else {   
			if ((mes == 2) && ((1 <= dia) && (dia <= 28))) {
				fechaCorrecta = true;
			}
			else { 
				if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11))
						&& ((1 <= dia) && (dia <= 30))) {
					fechaCorrecta = true;
				}
				else { 
					if (((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7)
							|| (mes == 8) || (mes == 10) || (mes == 12))
							&& ((1 <= dia) && (dia <= 31))) {
						fechaCorrecta = true;
					}
					else { 
						fechaCorrecta = false;
					}
				}
			}
		}
	
		if (fechaCorrecta) {
			System.out.println("Fecha correcta: " + dia + "/" + mes + "/" + anio);
		}
		else {
			System.out.println("Fecha incorrecta");
		}
	}
}
