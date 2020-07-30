package com.globallogic.herencia.ejercicio51;

public class Herencia {

	public static void main(String[] args) {
		Heladera heladera1=new Heladera();
		Electrodomestico tv=new Electrodomestico();
		// Heladera heladera2=new Heladera(null, 0, 0, null, 0, false, 0);
	tv.setColor("negro");
	tv.setMarca("Samsung");;
    
    heladera1.setPeso(233.4);
    heladera1.setCapacidad(147.3);
   
    System.out.println("El color de la tv es :  "+tv.getColor()+"Y su marca"+tv.getMarca()+"  y esta: ");
    tv.enceder();
    System.out.println("El peso de la heladera es:  "+heladera1.getPeso()+" kg   y su capacidad:  "+heladera1.getCapacidad()+" Kg.  y esta: ");
    heladera1.enceder();
	}

}
