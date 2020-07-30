package interfaces;

public interface Persona {
	
	public void hablar();
	public void dormirHombre();
	 default void  come(String a) {
		
		System.out.println("El "+a+" se alimenta");
	}

}
