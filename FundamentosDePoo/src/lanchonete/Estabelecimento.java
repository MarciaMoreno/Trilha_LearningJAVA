package lanchonete;

import lanchonete.AreaDoCliente.Cliente;
import lanchonete.Atendimento.Atendente;
import lanchonete.Cozinha.Almoxarife;
import lanchonete.Cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
			
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();

	}
}
