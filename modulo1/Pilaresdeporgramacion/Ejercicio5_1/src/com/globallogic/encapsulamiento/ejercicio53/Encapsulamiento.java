package com.globallogic.encapsulamiento.ejercicio53;

public class Encapsulamiento {

	public static void main(String[] args) {
	
		Gato gt=new Gato();
		
		gt.setNombre("Kitty");
		gt.setPatas(4);
		System.out.println("El nombre del gatito es : "+gt.getNombre()+" y el numero de patas es :"+gt.patas());
		
	}

}
