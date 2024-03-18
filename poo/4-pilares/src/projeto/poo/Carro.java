package projeto.poo;

public class Carro extends Veiculo {
	
	public void ligar() {
		confereCambio();  //encapsulamos os metodos
		confereCombustivel(); //encapsulamos os metodos
		System.out.println("Carro Ligado");
	}
	//modificadores de visibilidade
	//private - visivel somente pela classe
	private void confereCombustivel() {
		System.out.println("Conferindo Combustivel");
	}
	private void confereCambio(){
		System.out.println("Cambio em P");
	}
}
