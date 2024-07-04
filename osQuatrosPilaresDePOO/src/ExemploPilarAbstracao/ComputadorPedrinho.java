package ExemploPilarAbstracao;

public class ComputadorPedrinho {

public static void main(String[] args) {
		System.out.println("------------------------------------------------------");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println("------------------------------------------------------");
		FacebookMessenger fbm = new FacebookMessenger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		System.out.println("------------------------------------------------------");
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}
