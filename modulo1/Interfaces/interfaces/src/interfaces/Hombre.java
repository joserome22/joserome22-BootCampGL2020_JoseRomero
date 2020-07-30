package interfaces;

public class Hombre implements InterfaceAnimal,Persona {

	@Override
	public void come(String a) {
		// TODO Auto-generated method stub
		InterfaceAnimal.super.come(a);
	}
	public void hablar() {
		System.out.println("El hombre habla mucho");
		
	}
	@Override
	public void dormirHombre() {
		System.out.println("El hombre duerme muchas horas ");
		
	}
	
	@Override
	public void dormir() {
		System.out.println("Se ejecuta método de la clase hombre ");
		
	}
	@Override
	public void sonidoAnimal() {
		
		System.out.println("El hombre no hace sonidos de animal ");
	}
	
	public static void main(String[] args) {
		
		Hombre man=new Hombre();
		
		
		man.dormirHombre();
		man.hablar();
		man.sonidoAnimal();
		man.dormir();
		

	}

}
