package ExemploPilarAbstracao;

public class MSNMessenger extends ServicoMensagemInstantanea{

	public void receberMensagem() {
		validarConexao();
		System.out.println("RECEBENDO MENSAGEM VIA MSNMessenger...");
		atualizarHistorico();
	}
	public void enviarMensagem() {
		validarConexao();
		System.out.println("ENVIANDO MENSAGEM VIA MSNMessenger...");
		atualizarHistorico();
	}
	private void validarConexao(){
		System.out.println("Conexão com a internet OK...");
	}
	private void atualizarHistorico() {
		System.out.println("ARMAZENANDO MENSAGEM NO HISTORICO MSNMessenger...");
	}
}
