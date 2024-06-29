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

        Date dt = new SimpleDateFormat("ddMMyyyy").parse(dataNascimento);
        System.out.print("Data de Nascimento: ");
        System.out.print(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dt));

    }
}
