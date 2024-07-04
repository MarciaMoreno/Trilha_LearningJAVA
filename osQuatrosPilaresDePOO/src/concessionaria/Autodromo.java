package concessionaria;

public class Autodromo {

	public static void main(String[] args) {
		
		Carro jeep = new Carro();
		jeep.ligar();
		jeep.setChassi("7558545-12");
		
		Moto z400 = new Moto();
		z400.setChassi("7558551-22");
		
		System.out.println("Chassi: "+jeep.getChassi());
		System.out.println("Chassi: "+z400.getChassi());
	}
}
