package AnatomiaDasClasses;

import java.util.Arrays;

public class VariavelJavaBeans {
     public static void main(String[] args) {
        
        double salarioMedio=1500.23;
        String email ="josephcastro@gmail.com";
        String [] emails = {"coordenador@escola.com","professor@escola.com"};
        String meuNome = "JOSEPH CASTRO SALAZER"; 

        System.out.println("Nome Completo: "+meuNome);
        System.out.println("e-mail pessoal: "+email);
        System.out.println("e-mails corporativos: "+Arrays.toString(emails));
     }
}
