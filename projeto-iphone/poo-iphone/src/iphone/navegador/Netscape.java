package iphone.navegador;

public class Netscape implements NavegadorInternet {
	public void exibindoPagina() {
		System.out.println("\n### BEM VINDO AO NETSCAPE ###");
		acessarNavegador();
		verificarConexao();
		System.out.println("Exibir página da Intenet");
	}
	
	public void adicionarAba() {
		System.out.println("Adicionando nova aba no navegador");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página da Intenet");
	}
	
	public void voltandoPagina() {
		System.out.println("Exibir página anterior");
	}
	
	public void avancarPagina() {
		System.out.println("Exibir próxima página");
	}
	
	private void verificarConexao() {
		System.out.println("\nConectado a Internet");
	}

	@Override
	public void acessarNavegador() {
		System.out.println("Acesso ao Navegador Permitido");
		
	}
}
