package Operadores;

public class Concatenacao {

    public static void main(String[] args) {
        
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM " + " JAVA";
        System.out.println(nomeCompleto);        
        //qual o resultado das expressoes abaixo?
        String concatenacao = "?"; 
        System.out.println("O valor da variável concatenada = '?' resulta: "+concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println("\nconcatenacao = 1+1+1+\"1\"; resultado = "+concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println("concatenacao = 1+\"1\"+1+1; resultado = "+concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println("concatenacao = 1+\"1\"+1+\"1\"; resultado = "+concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println("concatenacao = \"1\"+1+1+1; resultado = "+concatenacao);
        concatenacao = "1"+(1+1+1);
    }
}
