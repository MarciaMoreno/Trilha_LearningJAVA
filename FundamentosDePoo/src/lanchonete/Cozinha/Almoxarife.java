package lanchonete.Cozinha;

public class Almoxarife {

	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() {
		controlarEntrada();
		controlarSaida();
		System.out.println("ENTREGANDO INGREDIENTES");
		//...?
	}
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
