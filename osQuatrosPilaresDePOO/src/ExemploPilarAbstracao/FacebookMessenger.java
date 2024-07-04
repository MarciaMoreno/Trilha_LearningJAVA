package ExemploPilarAbstracao;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	public void receberMensagem() {
		validarConexao();
		System.out.println("RECEBENDO MENSAGEM VIA FacebookMessenger...");
		atualizarHistorico();
	}
	public void enviarMensagem() {
		validarConexao();
		System.out.println("ENVIANDO MENSAGEM VIA FacebookMessenger...");
		atualizarHistorico();
	}
	private void validarConexao(){
		System.out.println("Conexão com a internet OK...");
	}
	private void atualizarHistorico() {
		System.out.println("ARMAZENANDO MENSAGEM NO HISTORICO FacebookMessenger...");
	}
}
