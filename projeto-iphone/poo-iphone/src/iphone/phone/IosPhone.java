package iphone.phone;

public class IosPhone implements AparelhoTelefonico{
	public void ligar() {
		System.out.println("\nEfetuando Ligação");
	}
	
	public void atender() {
		System.out.println("Atendendo Ligação");
	}
	
	public void correio() {
		System.out.println("Ouvindo correio de voz");
	}
}
