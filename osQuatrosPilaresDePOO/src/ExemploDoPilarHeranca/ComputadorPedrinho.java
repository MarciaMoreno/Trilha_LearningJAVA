package ExemploDoPilarHeranca;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------");
		System.out.println("MSN Messenger");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println("---------------------------------------------------------");
		System.out.println("Facebook Messenger");
		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		System.out.println("---------------------------------------------------------");
		System.out.println("Telegram");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}
