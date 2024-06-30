package EstruturasDeCondicao;

public class CaixaEletronico {

    public static void main(String[] args) {
        //Exemplo de uso para uma Condicional Simples...
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        System.out.println("Saldo disponivel antes do saque: R$"+saldo);
        System.out.println("Valor solicitado para saque: R$"+valorSolicitado);
        if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado; 
        System.out.println("Disponivel para novo saque: R$"+saldo);
    }
}
