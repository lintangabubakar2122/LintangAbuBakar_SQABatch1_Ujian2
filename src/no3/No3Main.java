package no3;

import java.util.Scanner;

public class No3Main {
	public static void main(String[]args) {
		// Silakan isi bagian ini
		
		Scanner in = new Scanner (System.in);
		System.out.println("Masukan Jarak (Kilometer) = ");
		double jarak = in.nextDouble();
		System.out.println("Masukkan Waktu (Jam) = ");
		double waktu = in.nextDouble();
		hitungKecepatan(jarak, waktu);
		System.out.println("Kecepatan rata-rata anda adalah "+ 
		hitungKecepatan(jarak, waktu) +
		"KM / jam");
		}
		
		static double hitungKecepatan(double jarak, double waktu) {
		//Silakan isi bagian ini dan ganti “anu” dengan kode yang tepat
			double sisaJarak = jarak / waktu;
			return sisaJarak;
		}

}
