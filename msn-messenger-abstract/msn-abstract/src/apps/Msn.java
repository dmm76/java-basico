package apps;

public class Msn extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		// TODO Auto-generated method stub
		validarConectadoInternet();
		System.out.println("ENVIANDO mensagem pelo MSN");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("RECEBENDO mensagem pelo MSN");
	}

	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		
	}

}
