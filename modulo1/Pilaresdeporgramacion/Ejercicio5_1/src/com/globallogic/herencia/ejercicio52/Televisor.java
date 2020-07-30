package com.globallogic.herencia.ejercicio52;

public class Televisor extends Electrodomestico {
	private double pulgadas;
	private String resolucion;
	
	public Televisor() {};
	 public Televisor (String marca, double peso,char consumo,String color,double pulgadas,String reslucion) {

        super(marca, peso, consumo,color);

        this.pulgadas =pulgadas ;
        this.resolucion=resolucion;
       }
	 
	 public double  getPulgadas() {
			return pulgadas;
			
		}
		public void  setPulgadas(double pulgadas) {
			this.pulgadas=pulgadas;
		}
	
		public void  setResolucion(String resolucion) {
			this.resolucion=resolucion;
		}
		
	 
	public void cambiarCanal(int canal) {
		
		System.out.println("El canal es : "+canal);
	}
	@Override
	public void enceder() {
		System.out.println("Encender Televisor");
		
		
	}



}
