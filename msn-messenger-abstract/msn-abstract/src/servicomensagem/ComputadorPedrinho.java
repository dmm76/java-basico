package servicomensagem;
import java.util.Scanner;

import apps.Facebook;
import apps.Msn;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ServicoMensagemInstantanea smi = null;
		
		
		System.out.println("Escolha a opcao desejada: ");
		System.out.println("1: MSN");
		System.out.println("2: FACEBOOK");
		System.out.println("3: TELEGRAM");
		String appEscolhidos = scanner.next();
		
		
		
		if(appEscolhidos.equals("1"))
			smi = new Msn();
		else if(appEscolhidos.equals("2"))
			smi = new Facebook();
		else if(appEscolhidos.equals("3"))
			smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
		//smi.validarConectadoInternet();//mudando o nivel do pacote perdeu a visibilidade
		//pois nao esta no mesmo pacote
		
	}
}
