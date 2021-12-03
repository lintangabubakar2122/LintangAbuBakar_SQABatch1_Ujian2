package no6;

import java.util.Scanner;

class BebasException extends Exception {
public BebasException(String s) {
super(s);
}
}
public class No6Main {
public static void main(String[] args) throws BebasException {
	
//Ujian, gunakan inputan
//jenis kelamin, status
//pria blm menikah, pajak 10%
//pria menikah, pajak 5%
//wanita blm menikah, pajak 7%
//wanita menikah, pajak 3%
//validasi: jika diinputkan selain 2 jenis kelamin tersebut gunakan throw
//validasi: jika diinputkan selain 2 status tersebut gunakan catch
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Masukan jenis kelamin 1.pria 2.wanita 3.banci :");
	String jenisKelamin = scan.nextLine();
	System.out.println("Masukan status 1.menikah 2.single :");
	String status = scan.nextLine();
	
	
	int pajak = 0;
	if(jenisKelamin.equalsIgnoreCase("1")) {
		if(status.equalsIgnoreCase("1")) {
			pajak = 5;
		} else {
			pajak = 10;
		}
	} else if (jenisKelamin.equalsIgnoreCase("1")) {
		if (status.equalsIgnoreCase("1")) {
			pajak = 3;
		} else {
			pajak = 7;
		}
	} else {
		throw new BebasException("Throw Custom Message Error");
	}

	System.out.println("pajak anda adalah :" + pajak + "%");

	try {
		throw new BebasException("Throw Custom Message Error");
	} catch (BebasException bebas) {
// TODO: handle exception
		System.out.println("Bebas Exception");
		System.out.println(bebas.getMessage());
	}
}
}