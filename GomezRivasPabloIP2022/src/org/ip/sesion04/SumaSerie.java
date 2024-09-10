package org.ip.sesion04;

import java.util.Locale;

public class SumaSerie {
	
	public static double sumaSerie(int i) {
		if (i==1) {
			return 0.5;
		} else {
			return (double) i/(i+1)+SumaSerie.sumaSerie(i-1);
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println(" i	  SUMA");
		
		int n = 10;
		
		for (int i = 1;i<=n;i++) {
			System.out.printf(Locale.ENGLISH,"%2d\t%7.6f\n", i, SumaSerie.sumaSerie(i));
		}
	}
}
