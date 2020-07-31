package interfaces;

public interface InterfaceAnimal {
	public void dormir();
	public void sonidoAnimal();
	default void  come(String a) {
		System.out.println("El "+a+" se alimenta");
		
		
	}
	static void  camina(String a) {
		System.out.println("El "+a+" camina");
		
		
	}
	

}
