package com.yaykizz.main;

import java.util.Scanner;

public class Percabanganlima {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.print("masukan usia anda: ");
		int usia=scan.nextInt();
		
		System.out.print("masukan berat badan anda: ");
		int bb=scan.nextInt();
		
		if (usia>=17) { //kondisi A benar
			if(bb>=50) { //kondisi B benar, maka
				System.out.println("usia anda:"+usia);
				System.out.println("berat badan anda:"+bb);
				System.out.println("anda sudah boleh donor darah");
			}
			
			else if(bb<=50) { //kondisi B yang salah
				System.out.println("ada salah satu input yang kurang memenuhi persyaratan, data tidak valid!"); 
			}
	
			else { //kondisi A yang salah
				System.out.println("ada salah satu input yang kurang memenuhi persyaratan, data tidak valid!"); 
			}
		}
			
					

	 	else { //kondisi A dan B yang salah
	 		System.out.println("usia anda:"+usia);
			System.out.println("berat badan anda:"+bb);
			System.out.println("anda belum boleh donor darah");	
	 		
		}
	

	}
	
}

	



	



			



