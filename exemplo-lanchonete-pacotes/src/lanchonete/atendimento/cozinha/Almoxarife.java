package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DO PRODUTO");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DO PRODUTO");
	}
	//public void entregarIngredientes() { //modificador defaul
	public void entregarIngredientes() {	
		System.out.println("ENTREGAR INGREDIENTES");
		controlarSaida();
	}
	//public void trocarGas() {//modificador defaul
	public void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO GAS");
	}
}
