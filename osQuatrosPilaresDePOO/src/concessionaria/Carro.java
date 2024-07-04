package concessionaria;

public class Carro extends Veiculo {
	
	public void ligar() {
		conferirCombustivel();
		conferirCambio();
		System.out.println("CARRO LIGANDO...");
	}
	private void conferirCombustivel() {
		System.out.println("CONFERINDO NIVEL DE COMBUSTIVEL...");
	}
	private void conferirCambio() {
		System.out.println("COLOCANDO O CAMBIO NA POSIÇÃO P...");
	}
}
