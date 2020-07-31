package com.globallogic.herencia.ejercicio52;

public class Cafetera extends Electrodomestico {
	private double litros;
	
	public Cafetera() {};
	 public Cafetera (String marca, double peso,char consumo,String color,double litros) {

        super(marca, peso, consumo,color);

        this.litros =litros;
        }
	 
	 public double  getLitros() {
			return litros;
			
		}
		public void  setLitros(double litros) {
			this.litros=litros;
		}
	
		
		
		 
		
	 
	 
	public void elegirSabor(String sabor) {
		
		System.out.println("El sabor es : "+sabor);
	}
	@Override
	public void enceder() {
		System.out.println("Encender Cafetera");
		
		
	}



}
