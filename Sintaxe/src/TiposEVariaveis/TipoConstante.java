package TiposEVariaveis;

public class TipoConstante {

    public static void main(String[] args) {
        
        System.out.println("Vamos iniciar uma variável chamada numero com o valor de 5...");
        int numero = 5;
        System.out.println("int numero = "+numero);

        System.out.println("Logo abaixo vamos declarar um novo valor para a mesma, sem o tipo...");
        numero = 10;
        System.out.println("numero = "+numero);

        System.out.println("\n\nAGORA SEGUE O EXEMPLO DO USO DE UMA VARIÁVEL CONSTANTE");
        System.out.println("Uma vez declarada seu valor não se altera mais...");
        /*
		 * ao usar a palavra reservada final, e declaração em CAIXA ALTA, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo a linha 25 vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
        final double VALOR_DE_PI = 3.14;
        System.out.println("final double VALOR_DE_PI = "+VALOR_DE_PI);
        System.out.println("Se tentarmos declarar VALOR_DE_PI = 2,5, geraremos um erro de compilação...");
    }
}
