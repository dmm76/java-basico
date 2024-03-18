package apps;

public class Facebook extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConectadoInternet();
		System.out.println("ENVIANDO mensagem pelo FACEBOOK");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("RECEBENDO mensagem FACEBOOK");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

}
