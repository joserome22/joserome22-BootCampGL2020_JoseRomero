package com.globallogic.clasesypaquetes.ejercicio6;

public class Empleado extends Persona {
	
	private int id;
	private String nombre;
	private double sueldoBase;
	private int horasExtrasRealizadas;
	private double tipoIrpf;
	private char casado;
	private int numeroHijos;
	static double importeHoraExtra;
	
	
	
	
	public Empleado(String dni) {
		super(dni);
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase=sueldoBase;
		
	}
	public int getHorasExtrasRealizadas() {
		return horasExtrasRealizadas;
	}
	public void setHorasExtrasRealizadas(int horasExtrasRealizas) {
		this.horasExtrasRealizadas=horasExtrasRealizadas;}
	
		public double getTipoIrpf() {
			return tipoIrpf;
		}
	public void setTipoIrpf(double tipoIrpf) {
		this.tipoIrpf=tipoIrpf;
	}
	public char getCasado() {
		return casado;
	}	
	public void setCasado(char casado) {
		this.casado=casado;
	}
	
	public int getNumeroHijos() {
		
		return numeroHijos;
	}
	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos=numeroHijos;
	}
	
	  public double getImporteHoraExtra() {
		return importeHoraExtra;
	}
	  
	  public static void setImporteHoraExtra(double importeHoraExtra) {
		  Empleado.importeHoraExtra=importeHoraExtra;
		  
	  }
	  
	  public double calculoImporteHoraExtra() {
		  return importeHoraExtra*horasExtrasRealizadas;
	  }
	  public double sueldoBruto(){
		  return sueldoBase+importeHoraExtra*horasExtrasRealizadas;
	  }
	  
	  public double calculoRetenciones() {
		  double tipo=tipoIrpf;
		  if(casado=='s'|| casado=='s') {
			  tipo = tipo-2 ; 
		  }
		  tipo = tipo-numeroHijos;
		  if (tipo<0) {
			  tipo=0;
			  
		  }
		  return sueldoBruto()*tipo/100;
			  
		  }
		
	  public double calcularSueldo() {
		  return sueldoBruto()-calculoRetenciones();
		  
	  }
	  @Override 
	  public  String toString() {
		 StringBuilder sb= new StringBuilder();
		 sb.append("\nDNI:");
		 sb.append(dni);
		 sb.append("\nNombre:");
		 sb.append(nombre);
		 sb.append("\nSueldo Base:");
		 sb.append(sueldoBase);
		 sb.append("\nHoras Extras Realizadas:");
		 sb.append(horasExtrasRealizadas);
		 sb.append("\ntipoIRPF:");
		 sb.append(tipoIrpf);
		 sb.append("\nCasado:");
		 sb.append(casado);
		 sb.append("\nNumero de Hijos:");
		 sb.append(numeroHijos);
		 sb.append("\nImporte hora Extra:");
		 sb.append(importeHoraExtra);
		  return sb.toString();
		  
	  }
	
	
}
