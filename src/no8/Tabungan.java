package no8;

public class Tabungan {
	String nama;
	int nomor;
	int saldo;

	public Tabungan(String nama, int nomor, int saldo) {
		this.nama = nama;
		this.nomor = nomor;
		this.saldo = saldo;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated constructor stub
		return "Tabungan nomor " +nomor+ " atas" + nama+ "dengan saldo sebesar " +saldo;
	}
}
