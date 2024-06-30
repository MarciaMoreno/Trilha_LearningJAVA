package Metodos;

public class TvSmart extends UtilizandoTvSmart {

    public static void main(String[] args) {
        
        UtilizandoTvSmart tv = new UtilizandoTvSmart();
		tv.ligar();
		tv.aumentarVolume();
		tv.mudarCanal();
		tv.mudarCanal();
		tv.mudarCanal();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.retornarCanal();
		tv.retornarCanal();
		tv.diminuirVolume();
		tv.desligar();
    }

}
