package EstruturasDeExcecao;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        //Criando as definições do objeto scanner...
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();   

        } catch (Exception e ) {
            // TODO: handle exception
           System.out.println("Preencha . em lugar da vírgula e somente um nome por vez...");
        }          
       

    }
}
