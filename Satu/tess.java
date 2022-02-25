package com.yaykizz.perulangan;

import java.util.Scanner;

public class Perulanganempat {

	public static void main(String[] args) {
		
		String lanjut = "Y";
        while(lanjut.equals("Y"))
        {
		System.out.println("-------------------------------------------------");
		System.out.println("             Rumus Bidang datar                  ");
		System.out.println("1. Persegi");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Segitiga");
		System.out.println("4. Lingkaran");
		System.out.println("-------------------------------------------------");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("pilih rumus: ");
		
		
		int pilihrumus=scan.nextInt();
		
			
		if(pilihrumus==1) {
			System.out.println("anda memilih rumus luas persegi, silahkan isi angkanya");
			System.out.print("masukan nilai sisi: ");int sisi=scan.nextInt();
			System.out.print("rumusnya adalah s x s, jadi hasilnya adalah "+sisi*sisi);
		}
		
		else if(pilihrumus==2) {
			System.out.println("anda memilih rumus luas persegi panjang, silahkan isi angkanya");
			System.out.print("masukan nilai panjang: ");int panjang=scan.nextInt();
			System.out.print("masukan nilai lebar: ");int lebar=scan.nextInt();
			System.out.print("rumusnya adalah p x l, jadi hasilnya adalah " +panjang*lebar);
		}

		else if(pilihrumus==3) {
			System.out.println("anda memilih rumus luas segitiga, silahkan isi angkanya");
			System.out.print("masukan nilai alas: ");int alas=scan.nextInt();
			System.out.print("masukan nilai tinggi: ");int tinggi=scan.nextInt();
			System.out.print("rumusnya adalah  1/2 x a x t, jadi hasilnya adalah "+0.5*alas*tinggi);
		}
		else if(pilihrumus==4) {
			System.out.println("anda memilih rumus luas lingkaran, silahkan isi angkanya");
			System.out.print("masukan nilai jari-jari: ");int jj=scan.nextInt();
			System.out.print("rumusnya adalah 3.14 x jari-jari x jari-jari, jadi hasilnya adalah " +3.14*jj*jj);
		}
		 else {
             System.out.println("hanya 1 sampai 4 input nya");
             
         }
		System.out.println();
		System.out.println();
		
		System.out.print("Mau coba rumus lain (Y/T) ? ");
        Scanner menu = new Scanner(System.in);
        lanjut = menu.nextLine().toUpperCase();
			
 
      }
		
	}
	
}