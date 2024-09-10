package org.ip.sesion02;

public class CambioMonedas {

	public static void main(String[] args) {
		double cantidad = 21.38;
		int monedas;
		System.out.println("Para devolver " + cantidad + " euros en monedas, hay que dar:");
		
		monedas = (int) (cantidad/2);
		if (monedas > 0) {
			cantidad = Math.round((cantidad - monedas*2)*100.0)/100.0;
			System.out.println(monedas + " monedas de 2 euros");
		}
		
		monedas = (int) (cantidad);
		if (monedas > 0) {
			cantidad = Math.round((cantidad - monedas)*100.0)/100.0;
			System.out.println(monedas + " monedas de 1 euro");
		}
		
		monedas = (int) (cantidad/0.5);
		if (monedas > 0) {
			cantidad = Math.round((cantidad - monedas*0.5)*100.0)/100.0;
			System.out.println(monedas + " monedas de 50 centimos");
		}

		
		monedas = (int) (cantidad/0.2);
		if (monedas > 0) {
			cantidad = Math.round((cantidad - monedas*0.2)*100.0)/100.0;
			System.out.println(monedas + " monedas de 20 centimos");
		}
		
		monedas = (int) (cantidad/0.1);
		if (monedas > 0) {
			cantidad = Math.round((cantidad - monedas*0.1)*100.0)/100.0;
			System.out.println(monedas + " monedas de 10 centimos");
		}
		
		monedas = (int) (cantidad/0.05);
		if (monedas > 0) {
			cantidad = Math.round((cantidad - monedas*0.05)*100.0)/100.0;
			System.out.println(monedas + " monedas de 5 centimos");
		}
		
		monedas = (int) (cantidad/0.02);
		if (monedas > 0) {
			cantidad = Math.round((cantidad - monedas*0.02)*100.0)/100.0;
			System.out.println(monedas + " monedas de 2 centimos");
		}
		
		monedas = (int) (cantidad/0.01);
		if (monedas > 0) {
			cantidad = Math.round((cantidad - monedas*0.01)*100.0)/100.0;
			System.out.println(monedas + " monedas de 1 centimo");
		}
	}
}
