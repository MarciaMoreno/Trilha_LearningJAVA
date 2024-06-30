package EstruturasDeCondicao;

public class ExemploDeSwitch {
     
    public static void main(String[] args) {

        System.out.println("UTILIZANDO UMA CONDIÇÃO DE LOOP IF/ELSE...");
        String sigla = "M";
		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");

        System.out.println("\n\nUTILIZANDO O MESMO CÓDIGO COM SWITCH...");
        String sigla2 = "M";

		switch (sigla2) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}
