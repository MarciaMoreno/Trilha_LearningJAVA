package ExemploDeEncapsulamento;

public class MSNMessenger {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
		
		
	}
		
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Conexão com a internet OK...");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando a mensagem dentro do histórico...");
	}
	public void receberMensagem() {
		// TODO Auto-generated method stub
		validarConectadoInternet();
		System.out.println("Recebendo mensagem");
	}
}

