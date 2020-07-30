package com.globallogic.herencia.ejercicio51;

public class Heladera extends Electrodomestico {
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	public Heladera() {};
	 public Heladera (String marca, double peso,char consumo,String color,double capacidad,boolean tieneFreezer,double capacidadFreezer) {

        super(marca, peso, consumo,color);

        this.capacidad =capacidad ;
        this.tieneFreezer=tieneFreezer;
        this.capacidadFreezer=capacidadFreezer;}
	 
	 public double  getCapacidad() {
			return capacidad;
			
		}
		public void  setCapacidad(double capacidad) {
			this.capacidad=capacidad;
		}
	
		public void  setTieneFreezer(boolean tieneFreezer) {
			this.tieneFreezer=tieneFreezer;
		}
		public boolean  getTieneFreezer() {
			return tieneFreezer;
			
		}
		 public double  getCapacidadFreezer() {
				return capacidadFreezer;
				
			}
		public void  setCapacidadFreezer(double capacidadFreezer) {
			this.capacidadFreezer=capacidadFreezer;
		}
	 
	 
	public void guardarElemento(String nombre) {
		
		System.out.println("Elemento a guardar: "+nombre);
	}
public void extraerElemento(String nombre) {
		
		System.out.println("Elemento a extraer: "+nombre);
	}


}
