package no10;

public class No10Main {
	
	
	
	public static void main(String[] args) {
		Sekolah sekolah = new Sekolah();
		SMA sma = new SMA();
		
		sma.nama("SMA Juara Coding");
		sma.alamat("Tebet");
		sma.jenjang("Sekolah Menengah Atas");
		
		sekolah.nama(); System.out.println(sma.getNama());
		sekolah.alamat(); System.out.println(sma.getAlamat());
		sekolah.jenjang(); System.out.println(sma.getJenjang());
		
		System.out.println();
		
		SMK smk = new SMK();
		smk.nama("SMK Coding Juara");
		smk.alamat("Beteb");
		smk.jenjang("Sekolah Menengah Kejuruan");
		
		sekolah.nama(); System.out.println(smk.getNama());
		sekolah.alamat(); System.out.println(smk.getAlamat());
		sekolah.jenjang(); System.out.println(smk.getJenjang());
		
	}

}
