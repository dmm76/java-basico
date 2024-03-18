package msn;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		System.out.println("MSN");
		MsnMessenger msn = new MsnMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("FACEBOOK");
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("TELEGRAM");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}
