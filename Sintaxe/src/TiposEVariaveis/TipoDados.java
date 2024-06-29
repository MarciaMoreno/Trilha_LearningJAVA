package TiposEVariaveis;

public class TipoDados {

    public static void main(String[] args) {
        
                byte idade = 23;
                short ano = 2021;
                int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
                long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
                float pi = 3.14F;
                double salario = 1275.33;

                System.out.println("Exemplo de uma variável tipo byte: "+idade);
                System.out.println("Exemplo de uma variável tipo short: "+ano);
                System.out.println("Exemplo de uma variável tipo int: "+cep);
                System.out.println("Exemplo de uma variável tipo long: "+cpf);
                System.out.println("Exemplo de uma variável tipo float: "+pi);
                System.out.println("Exemplo de uma variável tipo double: R$ "+salario);

    }
}
