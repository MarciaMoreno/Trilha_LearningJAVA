package lanchonete;

import lanchonete.AreaDoCliente.Cliente;
import lanchonete.Cozinha.Cozinheiro;

public class Atendente {
	
	public void servindoMesa() {
		System.out.println("Atendente SERVINDO A MESA");
		levarPedidoCozinha();
		pegarPedidoBalcao();
		
	}
	void levarPedidoCozinha() {
		System.out.println("Atendente ANOTANDO O PEDIDO, E LEVANDO PARA PREPARO NA COZINHA");
	}
	void receberPagamento() {
		System.out.println("Atendente RECEBENDO PAGAMENTO");
	}
	void pegarPedidoBalcao() {
		System.out.println("Atendente PEGANDO O PEDIDO NO BALCÃO");
	}
}