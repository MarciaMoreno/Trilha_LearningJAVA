package lanchonete;

import lanchonete.AreaDoCliente.Cliente;
import lanchonete.Cozinha.Almoxarife;
import lanchonete.Cozinha.Cozinheiro;

public class Estabelecimento {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Cozinheiro cozinheiro = new Cozinheiro();
		Atendente atendente = new Atendente();
		
		cliente.escolherLanche();
		cliente.fazerPedido();
		atendente.servindoMesa();
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();		
		atendente.receberPagamento();	
	
	}
	
}
