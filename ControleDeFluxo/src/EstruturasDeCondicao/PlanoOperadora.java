package EstruturasDeCondicao;
import java.util.Scanner;


public class PlanoOperadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("UTILIZANDO UMA CONDIÇÃO DE LOOP IF/ELSE...");		
        System.out.println("Escolha um plano para visualizar os beneficios...");
        System.out.println("1 - PLANO Box de Ligação");
        System.out.println("2 - PLANO Box de Midia");
        System.out.println("3 - PLANO Box YouTube GIGA");
        int plano = scanner.nextInt();
		
		if(plano == 1) {
			System.out.println("100 minutos de ligação");
		}else if(plano == 2 ) {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == 3 ) {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}else System.out.println("Erro de digitação... Tente uma opção válida...");

	System.out.println("\n\nUTILIZANDO UMA CONDIÇÃO DE LOOP SWITCH...");		
	System.out.println("Escolha um plano para visualizar os beneficios...");
        System.out.println("1 - PLANO Box de Ligação");
        System.out.println("2 - PLANO Box de Midia");
        System.out.println("3 - PLANO Box YouTube GIGA");
        int plano2 = scanner.nextInt();
		switch (plano2) {
			case 1:{
				System.out.println("RECARGA R$ 20,00...");
				System.out.println("100 minutos de ligação");
				break;
			}	
			case 2:{
				System.out.println("RECARGA R$ 30,00...");
				System.out.println("100 minutos de ligação");
				System.out.println("WhatsApp e Instagram grátis");	
				break;
			}	
			case 3: {
				System.out.println("RECARGA R$ 40,00...");
				System.out.println("100 minutos de ligação");
				System.out.println("WhatsApp e Instagram grátis");	
				System.out.println("5Gb Youtube");	
			}
			default:{
				System.out.println("Erro de digitação... Tente uma opção válida...");
			}
				break;
		}
    }
}
