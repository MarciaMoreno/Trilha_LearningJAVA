package PalavrasReservadas;

public class MotivoDaReserva {
	
	public void reservar01() {
		System.out.println("\nCONTROLE DE PACOTES\n");
		System.out.println("import: importa pacotes ou classes para dentro do código;");
		System.out.println("package: especifica a que pacote, todas as classes de um arquivo pertencem.");
	}
	public void reservar02() {
		System.out.println("MODIFICADORES DE ACESSO\n");
		System.out.println("public: acesso de qualquer classe;");
		System.out.println("private: acesso apenas dentro da classe;");
		System.out.println("protected: acesso por classes no mesmo pacote e subclasses.");
	}
	public void reservar03() {
		System.out.println("PRIMITIVOS\n");
		System.out.println("boolean: um valor indicando verdadeiro ou falso;");
		System.out.println("byte: um inteiro de 8 bits (signed);");
		System.out.println("char: um character unicode (16-bit unsigned);");
		System.out.println("double: um número de ponto flutuante de 64 bits (signed);");
		System.out.println("float: um número de ponto flutuante de 32 bits (signed);");
		System.out.println("int: um inteiro de 32 bits (signed);");
		System.out.println("long: um inteiro de 64 bits (signed);");
		System.out.println("short: um inteiro de 32 bits (signed);");
		System.out.println("void: indica que o método não tem retorno de valor.");
	}
	public void reservar04() {
		System.out.println("MODIFICADORES DE CLASSES VARIÁVEIS OU METODOS\n");
		System.out.println("abstract: classe que não pode ser instanciada ou método que precisa ser implementado, por uma subclasse não abstrata;");
		System.out.println("class: especifica uma classe;");
		System.out.println("extends: indica a superclasse que a subclasse está estendendo;");
		System.out.println("final: impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada;");
		System.out.println("implements: indica as interfaces que uma classe irá implementar;");
		System.out.println("interface: especifica uma interface;");
		System.out.println("native: indica que um método está escrito em uma linguagem dependente de plataforma, como o C;");
		System.out.println("new: instancia um novo objeto, chamando seu construtor;");
		System.out.println("static: faz um método ou variável pertencer à classe ao invés de às instâncias;");
		System.out.println("strictfp: usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante, em todas as expressões;");
		System.out.println("synchronized: indica que um método só pode ser acessado por uma thread de cada vez");
		System.out.println("transient: impede a serialização de campos;");
		System.out.println("volatile: indica que uma variável pode ser alterada durante o uso de threads.;");
		
	}
	public void reservar05() {
		System.out.println("CONTROLE DE FLUXO DENTRO DE UM BLOCO DE CODIGO\n");
		System.out.println("break: sai do bloco de código em que ele está;");
		System.out.println("case: executa um bloco de código dependendo do teste do switch;");
		System.out.println("continue: pula a execução do código que viria, após essa linha e vai para a próxima passagem do loop;");
		System.out.println("default: executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro;");
		System.out.println("do: executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente;");
		System.out.println("else: executa um bloco de código alternativo caso o teste \"if\" seja falso;");
		System.out.println("for: usado para realizar um loop condicional de um bloco de código;");
		System.out.println("if: usado para realizar um teste lógico de verdadeiro ou falso;");
		System.out.println("instanceof: determina se um objeto é uma instância de determinada classe, superclasse ou interface;");
		System.out.println("return: retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável);");
		System.out.println("switch: indica a variável a ser comparada nas expressões case;");
		System.out.println("while: executa um bloco de código repetidamente enquanto a condição for verdadeira.");
	}
	public void reservar06() {
		System.out.println("TRATAMENTOS DE ERRO\n");
		System.out.println("assert: testa uma expressão condicional, para verificar uma suposição do programador;");
		System.out.println("catch: declara o bloco de código usado para tratar uma exceção;");
		System.out.println("finally: bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção;");
		System.out.println("throw: usado para passar uma exceção para o método que o chamou;");
		System.out.println("throws: indica que um método pode passar uma exceção para o método que o chamou;");
		System.out.println("try: bloco de código que tentará ser executado, mas que pode causar uma exceção.");
	}
	public void reservar07() {
		System.out.println("VARIÁVEIS DE REFERÊNCIA\n");
		System.out.println("super: refere-se a superclasse imediata;");
		System.out.println("this: refere-se a instância atual do objeto.");
	}
	public void reservar08() {
		System.out.println("PALAVRAS RESERVADAS NÃO UTILIZADAS\n");
		System.out.println("const: Não utilize para declarar constantes; use public static final;");
		System.out.println("goto: não implementada na linguagem Java, por ser considerada prejudicial.");
	}
	public void reservar09() {
		System.out.println("LITERAIS RESERVADOS\n");
		System.out.println("null, true e false");
		System.out.println("Se utilizarmos um desses valores como keywords, criando algum identificador, o sistema retornará um erro de compilação.");
	}
	
}
