package msn;

public class ServicoMensagemInstantanea {
	
	public void enviarMensagem() { //ENCAPSULAMENTO
		validarConectadoInternet();
		System.out.println("Enviando Mensagem");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem\n");
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado a internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando historico de mensagem");
	}
}
