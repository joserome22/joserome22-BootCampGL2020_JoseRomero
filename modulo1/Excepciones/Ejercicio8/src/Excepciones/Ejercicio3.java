package Excepciones;

public class Ejercicio3 {
           static int[] array= new int[2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		array[2]=6;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fuera del indice del  rango del array " +e.getMessage());
			
		}
		

	}

}
