package Usuario;

import java.util.Scanner;

import iphone.Iphone;
import iphone.musica.Mp3Player;
import iphone.navegador.GoogleChrome;
import iphone.navegador.NavegadorInternet;
import iphone.navegador.Netscape;
import iphone.phone.AparelhoTelefonico;
import iphone.phone.IosPhone;

public class IphoneDouglas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Mp3Player player = new Mp3Player();
		player.tocarMusica();
		player.pausarMusica();
		
		IosPhone iosphone = new IosPhone();
		iosphone.ligar();
		iosphone.atender();
		iosphone.correio();
		
		AparelhoTelefonico phone = new Iphone();
		phone.ligar();
		phone.atender();
		phone.correio();
		
		NavegadorInternet ni = null;
		
		System.out.println("\nEscolha qual navegador irá usar?");
		System.out.println("1: GOOGLE CHROME");
		System.out.println("2: NETSCAPE");
		int appEscolhido = scanner.nextInt();
		
		if(appEscolhido == 1)
			ni = new GoogleChrome();
		else if(appEscolhido == 2)
			ni = new Netscape();
			
		ni.exibindoPagina();
		ni.adicionarAba();
		ni.atualizarPagina();
		ni.avancarPagina();
		ni.voltandoPagina();
			
		scanner.close();
	}
}
