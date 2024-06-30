package Metodos;

public class UtilizandoTvSmart{

    boolean ligada;
	int volume = 25;
	int canal = 1;

	public void ligar() {
		if (ligada == false)
		System.out.println("TV SMART LIGANDO ");
	}
	public void desligar() {
		if (ligada == false)
		System.out.println("TV SMART DESLIGANDO");
	}
	public void mudarCanal() {
		canal++;
		System.out.println("CANAL "+canal);
	}
	public void retornarCanal() {
		canal--;
		System.out.println("CANAL "+canal);
	}
	public void aumentarVolume() {
		volume++;
		System.out.println("VOLUME "+ volume);
	}
	public void diminuirVolume() {
		volume--;
		System.out.println("VOLUME "+volume);
	}

}
