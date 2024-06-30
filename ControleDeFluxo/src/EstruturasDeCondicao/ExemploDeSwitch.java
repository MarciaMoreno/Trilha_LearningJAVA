package EstruturasDeCondicao;

import java.util.Scanner;

public class ExemploDeSwitch {
     
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("UTILIZANDO UMA CONDIÇÃO DE LOOP IF/ELSE...");		
		System.out.println("Escolha um tamanho");
		System.out.println("M - MEDIO");
		System.out.println("P - PEQUENO");
		System.out.println("G - GRANDE");
        String sigla = scanner.next();
		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M" || sigla == "m")
			System.out.println("MÉDIO");
		else if(sigla == "G" || sigla == "g")
			System.out.println("GRANDE");
		else
			System.out.println("Não corresponde nenhuma das opções...");

        System.out.println("\n\nUTILIZANDO O MESMO CÓDIGO COM SWITCH...");
		System.out.println("Escolha um tamanho");
		System.out.println("M - MEDIO");
		System.out.println("P - PEQUENO");
		System.out.println("G - GRANDE");
        String sigla2 = scanner.next();
		switch (sigla2) {
		case "P","p":{
			System.out.println("PEQUENO");
			break;
		}
		case "M","m":{
			System.out.println("MÉDIO");
			break;
		}
		case "G","g":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("Não corresponde nenhuma das opções...");
		}
    }
}
