package com.globallogic.herencia.ejercicio52;

import java.util.ArrayList;
import java.util.Iterator;

public class Polimorfismo {

	public static void main(String[] args) {
		Heladera heladera1=new Heladera();
		Cafetera cafetera1=new Cafetera();
		Televisor televisor1=new Televisor();
		televisor1.setPulgadas(2343.9);
		
		
		
		ArrayList<Electrodomestico> electrodomesticos=new ArrayList();
		electrodomesticos.add(heladera1);
		electrodomesticos.add(cafetera1);
		electrodomesticos.add(televisor1);
		
		for (Electrodomestico list:electrodomesticos) {
			list.enceder();
			
		}
			
		
	
	}

}
