package lanchonete.Cozinha;

public class Almoxarife {
	
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarEntrada();
		controlarSaida();		
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
		controlarEntrada();
		controlarSaida();	
	}
}