package no7;

import java.util.Arrays;

public class No7Main {
	public static void main (String[] args) {
		Tabungan simpedes = new Tabungan("Tessy Wahyuni Riwayati Hartati", 89, 100000);
		simpedes.cekSaldo();
		simpedes.setor(8000);
		simpedes.cekSaldo();
		simpedes.tarik(230000);
		simpedes.tarik(60000);
		simpedes.cekSaldo();
		System.out.println();
		Tabungan tabanas = new Tabungan ("Hindun",90, 0);
		tabanas.cekSaldo();
		tabanas.tarik(10000);
		tabanas.tarik(1000);
		tabanas.setor(20000);
		tabanas.tarik(20000);
		}

}
