package Operadores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OperadoresAtribuicao {

    public static void main(String[] args) throws ParseException {
        //classe Operadores.java
        String nome = "GLEYSON SANTANA ARAÚJO";
        int idade = 22;
        double peso = 68.5;
        char genero = 'M';
        boolean doadorOrgao = false;
        String dataNascimento = "02041985081300";

        System.out.println("Nome Completo: "+nome);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("Peso Atual: "+peso+" Kg");
        System.out.println("Genero: "+genero);
        if(doadorOrgao == true) System.out.println("Doador de Orgãos?: SIM.");
        else System.out.println("Doador de Orgãos?: NÃO.");
        Date dt = new SimpleDateFormat("ddMMyyyyHHmmss").parse(dataNascimento);
        System.out.print("Data de Nascimento: ");
        System.out.print(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dt));

    }
}
