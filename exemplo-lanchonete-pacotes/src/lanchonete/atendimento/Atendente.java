package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO MESA\n");
	}
	private void pegarLancheCozinha() {
		System.out.println("\nPEGANDO LANCHE COZINHA");
	}
	public void receberPagamento() {
		System.out.println("\nRECEBENDO PAGAMENTO");
	}
	void trocarGas() {//modifica
		System.out.println("ATENDENTE TROCANDO GAS");
	}
	private void pegarPedidoBalcao() {
		System.out.println("PEGANDO PEDIDO BALCAO");
	}
}
