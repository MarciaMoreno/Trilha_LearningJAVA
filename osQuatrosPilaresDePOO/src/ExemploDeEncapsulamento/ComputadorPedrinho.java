package ExemploDeEncapsulamento;

public class ComputadorPedrinho {
	
	/*
	 * Simulação do uso da classe MSNMessenger
	 * ***ESCOPO SEM ENCAPSULAMENTO... 
	
	public class ComputadorPedrinho {
		public static void main(String[] args) {
			//abrindo MSN Messenger
			MSNMessenger msn = new MSNMessenger();
			
			msn.validarConectadoInternet();
			msn.enviarMensagem();
			msn.salvarHistoricoMensagem();
			
			msn.receberMensagem();
		}
	}
	 */
	
	//ESCOPO COM ENCAPSULAMENTO... 
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		msn.receberMensagem();
		msn.enviarMensagem();
	}
	
}
