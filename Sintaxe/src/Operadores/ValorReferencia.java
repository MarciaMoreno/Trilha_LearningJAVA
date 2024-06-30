package Operadores;

public class ValorReferencia {

    public static void main(String[] args) {
        
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println("Utilizando argumentos de atribuição: ");
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        System.out.println("\nUtilizando equals na referencia: ");
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
    }
}
