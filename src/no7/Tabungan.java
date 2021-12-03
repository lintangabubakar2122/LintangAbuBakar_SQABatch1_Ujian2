package no7;

public class Tabungan {
	String nama;
	int nomor;
	int saldo;

	public Tabungan(String nama, int nomor, int saldo) {
		// TODO Auto-generated constructor stub
		this.nama = nama;
		this.nomor = nomor;
		this.saldo = saldo;
	}

	public void cekSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Saldo anda saat ini adalah "+saldo);
	}

	public void setor(int setor) {
		// TODO Auto-generated method stub
		System.out.println("Setoran sebesar "+setor+" berhasil dilakukan, saldo anda sekarang"+ (saldo+setor));
		saldo += setor;
	}

	public void tarik(int tarik) {
		// TODO Auto-generated method stub
		if (saldo < tarik) {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		} else {
			saldo -= tarik;
			System.out.println("Penarikan sebesar "+tarik+" berhasil dilakukan, saldo anda sekarang "+saldo);
		}
		
	}


}
