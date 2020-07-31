package Excepciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			 throw new Exception("Esto es una excepcion");
		}
		catch(Exception e) {
			System.out.println("un error "+e.getMessage());
			
		}
		finally {
			System.out.println("Se ejecuta sin importar si se presentan errores");
		}
		
					
	}

}
