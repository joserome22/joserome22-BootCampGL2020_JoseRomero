package Excepciones;

public class MiException extends Exception{
           
	
	String mensaje= "CAdena";
	public MiException(String mensaje) {
		
		this.mensaje=mensaje;
	}
	
	public void mostrar(String mensaje) {
		
		System.out.println("Cadena almacenada"+mensaje);
		
	}
	
}
