package escola;

public class Escola {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Felipe Andrade Munhoz");
		aluno1.setIdade(12);
		aluno1.setGenero("M");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Ana Batista Simões");
		aluno2.setIdade(12);
		aluno2.setGenero("F");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Claudia Felipe Munhoz");
		aluno3.setIdade(12);
		aluno3.setGenero("F");
		System.out.println("--------------------------------------------------------");
		System.out.println("Nome Completo: "+aluno1.getNome());
		System.out.println("Idade: "+aluno1.getIdade()+" anos");
		System.out.println("Genero: "+aluno1.getGenero());
		System.out.println("--------------------------------------------------------");
		System.out.println("Nome Completo: "+aluno2.getNome());
		System.out.println("Idade: "+aluno2.getIdade()+" anos");
		System.out.println("Genero: "+aluno2.getGenero());
		System.out.println("--------------------------------------------------------");
		System.out.println("Nome Completo: "+aluno3.getNome());
		System.out.println("Idade: "+aluno3.getIdade()+" anos");
		System.out.println("Genero: "+aluno3.getGenero());
	}
}
