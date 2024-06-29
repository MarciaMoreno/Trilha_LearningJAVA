package TiposEVariaveis;
public class ExemploEstrutura {

    public static void main(String[] args) {
        System.out.println("Segue a estrutura básica: ");
        System.out.println("<Tipo> <nomeVariavel> = <atribuicaoDeValor>"); 
        
        System.out.println("Exemplos abaixo...");
        int idade = 0; //Tipo "int", nome "idade", com nenhum valor atribuído. 
        int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
        double valorMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.

        System.out.println("int idade = 0; resultado deste tipo é : "+idade);
        System.out.println("int anoFabricacao = 2021; resultado deste tipo é : "+anoFabricacao);
        System.out.println("double valorMinimo = 2.500; resultado deste tipo é : "+valorMinimo);
    }
}
