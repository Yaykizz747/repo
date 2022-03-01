package com.yaykizz.main;

import java.util.*;
import java.text.*;

public class Cobadua {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("masukan jumlah uang: ");
	    double x=scan.nextDouble();
	    
	    
	    Locale US = new Locale("us", "US");
	    Locale IN = new Locale("in", "IN");
	    Locale CH = new Locale("ch", "CH");
	    Locale FR = new Locale("fr","FR");
	    
	    
	    Currency Amerika=Currency.getInstance(US);
	    Currency India=Currency.getInstance(IN);
	    Currency China=Currency.getInstance(CH);
	    Currency Prancis=Currency.getInstance(FR);
	    
	    
	    NumberFormat matauang1=NumberFormat.getCurrencyInstance(US);
	    NumberFormat matauang2=NumberFormat.getCurrencyInstance(IN);
	    NumberFormat matauang3=NumberFormat.getCurrencyInstance(CH);
	    NumberFormat matauang4=NumberFormat.getCurrencyInstance(FR);
	    
	    
	    System.out.println("US:"+matauang1.format(x));
	    System.out.println("India:"+matauang2.format(x));
	    System.out.println("China:"+matauang3.format(x));
	    System.out.println("France:"+matauang4.format(x));
	    
	   

	}

}