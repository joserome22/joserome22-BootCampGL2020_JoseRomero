package com.globallogic.clasesypaquetes.ejercicio6;
import java.io.IOException;
import java.util.Scanner;





public class EmpleadosPrincipal {
	
	 final static int MAXIMO_EMPLEADOS=20;
	static Empleado[] empleados= new Empleado[MAXIMO_EMPLEADOS];
	static int indice=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws IOException  {
	double importe;
	Empleado e;
	leerempleados();
	if(numeroDeEmpleados()>0) {
	// mostrar empleados
		System.out.println("\n\nEmpleados introducidos: ");
		mostrar();
		
		
		importe = leerImporteHorasExtras();
		
		
		
		Empleado.setImporteHoraExtra(importe);
		
		
		
		 //calcular el empleado que más cobra
		e=empleadoQueMasCobra();
		System.out.println("\n\nEmpleado que más cobra;");
		System.out.println(e);
		System.out.printf("Sueldo: ",e.calcularSueldo());
		
		
		/// dswhjsadjkfhjdsafhadsj
		 //calcular el empleado que menos cobra
		
		e=empleadoQueMenosCobra();
		System.out.println("\nEmpleado menos cobra");
		System.out.println(e);
		System.out.printf("Sueldo: ",e.calcularSueldo());
		
		
		 //calcular el empleado que menos cobra por horas extra
		e=empleadoQueMenosCobraPorHorasExtras();
		System.out.println("\nEmpleado menos cobra horas extra");
		System.out.println(e);
		System.out.printf("Sueldo: ",e.calculoImporteHoraExtra());
		
		
		//calcular el empleado que más cobra por horas extra
		e=empleadoQueMasCobraPorHorasExtras();
		System.out.println("\nEmpleado mass cobra horas extra");
		System.out.println(e);
		System.out.printf("Sueldo: ",e.calculoImporteHoraExtra());
		
		ordenarSalario();
       //  System.out.println("\n\nEmpleados ordenados por salario:");
       //  mostrarEmpleadosYSalarios();
	//	 ordenarSalario();
	
		/// 
	}
	}	
		
		
		public static void leerempleados()throws IOException {
			Empleado emp;
	        String dni, nombre;
	        double sueldoBase;
	        int horasExtrasRealizadas;
	        double tipoIrpf;
	        char casado; 
	        int numeroHijos;
	        int i, N;
	        
	        do {
	            System.out.print("Número de empleados? ");
	            N = sc.nextInt();
	        } while (N < 0 || N > MAXIMO_EMPLEADOS);
	       
	        for (i = 1; i <= N; i++) {
	            sc.nextLine(); //limpiar el intro
	            System.out.println("Empleado " + i);
	            System.out.print("Nif: ");
	            dni = sc.nextLine();
	            System.out.print("Nombre: ");
	            nombre = sc.nextLine();
	            System.out.print("Sueldo Base: ");
	            sueldoBase = sc.nextDouble();
	            System.out.print("Horas extra: ");
	            horasExtrasRealizadas = sc.nextInt();
	            System.out.print("Tipo de IRPF: ");
	            tipoIrpf = sc.nextDouble();
	            System.out.print("Casado (S/N): ");
	            casado = (char) System.in.read();
	            System.out.print("Número de hijos: ");
	            numeroHijos = sc.nextInt();
	           
	            emp = new Empleado(dni); 

	            emp.setNombre(nombre);
	            emp.setSueldoBase(sueldoBase);
	            emp.setHorasExtrasRealizadas(horasExtrasRealizadas);
	            emp.setTipoIrpf(tipoIrpf);
	            emp.setCasado(Character.toUpperCase(casado));
	            emp.setNumeroHijos(numeroHijos);

	            empleados[indice] = emp; 
	            indice++;
	        }
	    }
		    public static  void mostrar() {
		        for (int i = 0; i < indice; i++) {
		            System.out.println(empleados[i]);
		        }
		    }
		    
		    public static double leerImporteHorasExtras() {
		        double importes;
		        System.out.print("Introduce el importe a pagar por cada hora extra: ");
		        importes = sc.nextDouble();
		        return importes;
		    }
		    public static int numeroDeEmpleados() {
		        return indice;
		    }
		    public static Empleado empleadoQueMasCobra() {
		        Empleado mayor = empleados[0];
		        for (int i = 1; i < indice; i++) {
		            if (empleados[i].calcularSueldo() > mayor.calcularSueldo()) {
		                mayor = empleados[i];
		            }
		        }
		        return mayor;
		    }
		    
		    public static Empleado empleadoQueMenosCobra() {
		        Empleado menor = empleados[0];
		        for (int i = 1; i < indice; i++) {
		            if (empleados[i].calcularSueldo() < menor.calcularSueldo()) {
		                menor = empleados[i];
		            }
		        }
		        return menor;
		    }
		    public static Empleado empleadoQueMasCobraPorHorasExtras() {
		        Empleado mayor = empleados[0];
		        for (int i = 1; i < indice; i++) {
		            if (empleados[i].calculoImporteHoraExtra() > mayor.calculoImporteHoraExtra()) {
		                mayor = empleados[i];
		            }
		        }
		        return mayor;
		    }
		    
		    public static Empleado empleadoQueMenosCobraPorHorasExtras() {
		        Empleado menor = empleados[0];
		        for (int i = 1; i < indice; i++) {
		            if (empleados[i].calculoImporteHoraExtra() < menor.calculoImporteHoraExtra()) {                 
		                menor = empleados[i];
		            }
		        }
		        return menor;
		    }
		    
		    public static void ordenarSalario() {

		        int i, j;
		        Empleado aux;
		        for (i = 0; i < indice - 1; i++) {
		            for (j = 0; j < indice - i - 1; j++) {
		                if (empleados[j + 1].calcularSueldo() < empleados[j].calcularSueldo()) {
		                    aux = empleados[j + 1];
		                    empleados[j + 1] = empleados[j];
		                    empleados[j] = aux;
		                }
		            }
		        }
		    }
		    public static void mostrarEmpleadosYSalarios() {
		        for (int i = 0; i < indice; i++) {
		            System.out.println(empleados[i]);
		            System.out.printf("Sueldo:" , empleados[i].calcularSueldo());
		        }
		    }


		
		
	}
	
		
		
		
		
		
		
		
		
		
	
		

