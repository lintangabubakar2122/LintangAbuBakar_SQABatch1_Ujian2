package no4;

import java.util.Scanner;



public class No4Main {
	public static void main(String[]args) {
		// Silakan isi bagian ini
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan sisa BBM dalam tangki (liter) = ");
		double sisa = in.nextDouble();
		System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		double jarakPerLiter = in.nextDouble();
		hitungSisaJarak(sisa, jarakPerLiter);
		System.out.println("Kendaraan anda dapat menempuh jarak "+ 
		hitungSisaJarak(sisa, jarakPerLiter) +
		" kilometer dengan sisa BBM yang ada di tangki");
		}
		static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
		}

}
