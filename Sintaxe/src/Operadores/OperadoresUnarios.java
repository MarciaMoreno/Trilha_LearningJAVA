package Operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Nesta linha, a variável numero é igual a "+numero);		
        System.out.print("Imprimindo a variável '-numero' em negativo: ");
        System.out.println(-numero);
        System.out.print("Incrementando numero++, imprime 6: ");
        numero ++;
        System.out.println(numero);
        System.out.println("Incrementando numero++ imprime 7");
        System.out.println("Incrementando numero ++, ocasionará um erro");
        System.out.println(numero ++);// ops algo de errado não está certo
        System.out.println("Agora sim a incrementação retornará 7");
        System.out.println(numero);
        //ordem de precedencia conta aqui
        System.out.println("A ordem conta e retornará 8 ");
        System.out.println(++ numero);
        System.out.println("\n\n---------------------------------------------");
        boolean verdadeiro = true;
        System.out.println(verdadeiro);
        System.out.println("Invertendo a varivael acima : " + !verdadeiro);
    }
}
