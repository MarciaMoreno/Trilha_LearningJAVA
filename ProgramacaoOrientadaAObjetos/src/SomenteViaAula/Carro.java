package SomenteViaAula;

public class Carro extends Veiculo{

    public void ligar(){
        conferirCombustivel();
        conferirCambio();
        System.out.println("CARRO LIGANDO...");
    }

    private void conferirCombustivel(){
        System.out.println("Conferindo combustivel...");
    }

    private void conferirCambio(){
        System.out.println("Checando câmbio em 'P'...");
    }
}
