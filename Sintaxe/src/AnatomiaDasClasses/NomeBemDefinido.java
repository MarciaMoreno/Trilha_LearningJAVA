package AnatomiaDasClasses;

public class NomeBemDefinido {

    public static void main(String[] args) {
        
        int idade = 23;
        double altura = 1.62;
        Dog spike = new Dog(); //observe que aqui a variável spike não tem valor, é normal

        System.out.println("Olá meu nome é Marcos...");
        System.out.println("Tenho "+idade+" de idade, "+altura+" de altura, solteiro e moro com um cachorro...");
        spike.nomear();
        spike.latir();
    }
}
