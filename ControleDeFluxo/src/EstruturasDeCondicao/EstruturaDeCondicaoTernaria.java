package EstruturasDeCondicao;

public class EstruturaDeCondicaoTernaria {

    public static void main(String[] args) {
        System.out.println("Exemplo - Estrutura de condição Unária... ");
        int nota = 7;System.out.println("Aluno com nota = "+nota);
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);

        System.out.println("Exemplo - Estrutura de condição Ternária... ");
        int nota2 = 6;System.out.println("Aluno com nota = "+nota2);
		String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);
    }
}
