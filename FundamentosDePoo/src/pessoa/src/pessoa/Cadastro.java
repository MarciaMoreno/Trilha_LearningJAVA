package pessoa;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Cadastro {
	
	public static void main(String[] args) throws ParseException {
		
		PessoaCadastrada cadastro1 = new PessoaCadastrada("MARCOS AURÉLIO RÚBIO", "220.145.554.61");
		cadastro1.setEndereço("Rua das Amoreiras nº 14 - Vila Isabel / SP");
		cadastro1.setGenero("Masculino");
		
		System.out.println("Nome Completo: "+cadastro1.nome);
		System.out.println("CPF: "+cadastro1.cpf);
		System.out.println("Endereço: "+cadastro1.getEndereço());
		System.out.println("Genero: "+cadastro1.getGenero());
		
		
	
	}
}
