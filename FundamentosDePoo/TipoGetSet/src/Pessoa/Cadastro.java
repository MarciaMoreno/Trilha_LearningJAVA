package Pessoa;

public class Cadastro {

	public static void main(String[] args) {
	
		PessoaCadastrada cadastrado1 = new PessoaCadastrada("Maurilene Dias Samuel", "124.524.454.21");
		cadastrado1.setEndereço("Rua Maria das Camélias nº 28 - Vila Copenhagem / SP");
		cadastrado1.setTelefone("(11) 98857-2252");
		
		PessoaCadastrada cadastrado2 = new PessoaCadastrada("Diamo Guacamo Suria", "334.524.454.14");
		cadastrado2.setEndereço("Rua Virzenio Camugi nº 18 - Vila Isabel / SP");
		cadastrado2.setTelefone("(11) 94857-7752");
		
		PessoaCadastrada cadastrado3 = new PessoaCadastrada("Daniel Feresini Castro", "887.144.454.84");
		cadastrado3.setEndereço("Rua Mariano Salazario Prudente nº 112 - Vila São Pedro / SP");
		cadastrado3.setTelefone("(11) 95581-2359");
		
		System.out.println("Nome Completo: "+cadastrado1.nome);
		System.out.println("CPF : "+cadastrado1.cpf);
		System.out.println("Endereço: "+cadastrado1.getEndereco());
		System.out.println("Telefone: "+cadastrado1.getTelefone());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Nome Completo: "+cadastrado2.nome);
		System.out.println("CPF : "+cadastrado2.cpf);
		System.out.println("Endereço: "+cadastrado2.getEndereco());
		System.out.println("Telefone: "+cadastrado2.getTelefone());
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Nome Completo: "+cadastrado3.nome);
		System.out.println("CPF : "+cadastrado3.cpf);
		System.out.println("Endereço: "+cadastrado3.getEndereco());
		System.out.println("Telefone: "+cadastrado3.getTelefone());
	}
}
