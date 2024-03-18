package apps;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//mais um metodo abstrato
	public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este metodo
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado à INTERNET");
	}
}
