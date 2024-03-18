package iphone.musica;

public class Mp3Player implements ReprodutorMusical{
	public void tocarMusica() {
		playList();
		selecionarMusica();
		System.out.println("Executando Musica");
	}
	
	public void pausarMusica() {
		System.out.println("Pausando Musica");
	}
	
	private void selecionarMusica() {
		System.out.println("Selecionando Musica");
	}
	
	private void playList() {
		System.out.println("Lista de Musicas Selecionadas");
	}

}
