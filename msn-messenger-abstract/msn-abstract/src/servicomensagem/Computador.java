package servicomensagem;

import apps.Facebook;
import apps.Msn;
import apps.Telegram;

public class Computador {
	public static void main(String[] args) {
		
		System.out.println("MSN");
		Msn msn = new Msn();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("\nFACEBOOK");
		Facebook fcb = new Facebook();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("\nTELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
