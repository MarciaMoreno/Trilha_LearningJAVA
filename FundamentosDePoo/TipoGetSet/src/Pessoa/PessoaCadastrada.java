package Pessoa;

public class PessoaCadastrada {
 
	String nome;
	String cpf;
	String endereco;
	String telefone;
	
	public PessoaCadastrada(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
