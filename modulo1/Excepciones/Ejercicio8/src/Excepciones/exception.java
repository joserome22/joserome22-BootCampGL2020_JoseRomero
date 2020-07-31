package Excepciones;

public class exception {

	public static void main(String[] args) {
		Ejercicio8_2 objeto=null;
		
		
		try {
			objeto.Ejecutarmetodo();
			
		}
		catch (Exception e){
			System.out.println("Se produjo una excepcion "+e.getMessage());
			
		}
         
	}

}
