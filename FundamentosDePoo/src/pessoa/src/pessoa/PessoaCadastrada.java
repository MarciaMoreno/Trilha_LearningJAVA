package pessoa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class PessoaCadastrada {
	
	String nome;
	String cpf; 
	String endereço;
	
	public PessoaCadastrada(String nome, String cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	String genero;

	
	
	
}
