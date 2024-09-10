package org.ip.tema03.ejerciciosresueltos;

public class TestVehiculos {

	public static void main(String[] args) {

		Vehiculo [] arrayVehiculos = new Vehiculo[5];

		arrayVehiculos[0] = new Coche("Ford", "Focus", "1346FKC", 5);
		arrayVehiculos[1] = new Camion("Volvo", "FL337", "7371GHX");
		arrayVehiculos[2] = new Coche("Mazda", "CX7", "9075HVT", 5);
		arrayVehiculos[3] = new Camion("Iveco", "190E31", "1378FXZ");
		arrayVehiculos[4] = new Coche("Renault", "Clio", "4443FBC", 3);

		for (int i = 0; i < arrayVehiculos.length; i++) {
			if (arrayVehiculos[i] instanceof Camion) {
				((Camion)arrayVehiculos[i]).ponerRemolque(new Remolque(20000));
			}
		}

		for (int i = 0; i < arrayVehiculos.length; i++) {
			try {
				arrayVehiculos[i].acelerar(110);
			}
			catch (DemasiadoRapidoException e) {
				System.out.println("Algun vehiculo ha excedido su limite de velocidad");
			}
		}

		for (int i = 0; i < arrayVehiculos.length; i++) {
			try {
				arrayVehiculos[i].frenar(30);
			}
			catch (DemasiadoRapidoException e) {
				System.out.println("Algun vehiculo se va a parar repentinamente");
			}
		}

		for (int i = 0; i < arrayVehiculos.length; i++) {
			System.out.println(arrayVehiculos[i].toString());
		}
	}
}
