package Operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        //classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;
        System.out.println("A condição relacional entre as variaveis numero1 e 2, retornar as condições logicamente verdade...");
        if(numero1 > numero2)
            System.out.print("\nNumero 1 pode ser maior que numero 2");

        if(numero1 < numero2)
            System.out.print("\nNumero 1 pode ser menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("\nNumero 1 pode ser maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("\nNumero 1 pode ser menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("\nNumero 1 é diferente de numero 2");
    }
}
