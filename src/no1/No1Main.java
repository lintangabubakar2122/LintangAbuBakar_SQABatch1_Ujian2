package no1;

import java.util.Scanner;

public class No1Main {
	
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);
		}
		static void cetakFibonacci(int batas) {
			
			int [] deret = new int[batas];
			deret[0] = 1;
			deret[1] = 1;
			
			for(int i = 2; i < batas; i++) {
				deret[i] = deret[i-1] + deret[i-2];
			}
			
			for (int i = 0; i < batas; i++) {
				System.out.print(deret[i] +  " ");
			}
		}

}
