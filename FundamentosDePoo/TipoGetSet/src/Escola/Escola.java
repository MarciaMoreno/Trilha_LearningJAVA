package Escola;

public class Escola {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Ana Beatriz Saldanha");
		aluno1.setIdade(12);
		aluno1.setGenero("F");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Carla Maria Souza");
		aluno2.setIdade(12);
		aluno2.setGenero("F");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Douglas Penedo Campos");
		aluno3.setIdade(12);
		aluno3.setGenero("M");
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Nome Completo: "+aluno1.getNome());
		System.out.println("idade: "+aluno1.getIdade());
		System.out.println("Gênero: "+aluno1.getGenero());
		System.out.println("----------------------------------------------------------");
		System.out.println("Nome Completo: "+aluno2.getNome());
		System.out.println("idade: "+aluno2.getIdade());
		System.out.println("Gênero: "+aluno2.getGenero());
		System.out.println("----------------------------------------------------------");
		System.out.println("Nome Completo: "+aluno3.getNome());
		System.out.println("idade: "+aluno3.getIdade());
		System.out.println("Gênero: "+aluno3.getGenero());
	}
}
