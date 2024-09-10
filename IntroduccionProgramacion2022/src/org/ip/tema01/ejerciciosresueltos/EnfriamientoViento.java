package org.ip.tema01.ejerciciosresueltos;

/*************************************************************************
 *  Dada la temperatura t (en Fahrenheit) y la velocidad del viento v 
 *  (en millas por hora), calcular el enfrianiento del viento usando la formula
 *  del National Weather Service
 *
 *     w = 35.74 + 0.6215*t + (0.4275*t - 35.75)  *  v ^ 0.16
 *
 *  Referencia:  http://www.nws.noaa.gov/om/windchill/index.shtml
 *
 *************************************************************************/

public class EnfriamientoViento {

	public static void main(String[] args) {
        double t = 40;
        double v = 30;
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println();
        System.out.println("Temperatura = " + t + " (grados Fahrenheit)");
        System.out.println("Velocidad del viento  = " + v + " (millas por hora)");
        System.out.println();
        System.out.printf("Enfriamiento del viento = %6.2f (grados Fahrenheit)", w);
    }
}
