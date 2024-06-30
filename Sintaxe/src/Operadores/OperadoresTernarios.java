package Operadores;

public class OperadoresTernarios {

    public static void main(String[] args) {
        
        int a, b;

		a = 5;
		b = 6;
        boolean resultado;
		//EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		if(a==b){ resultado = false; 
           System.out.println("Falso 'a' é diferente de 'b'..."); 
        } 	  
		else{  resultado = true;
           System.out.println("Verdade 'a' é diferente de 'b'..."); 
         }
		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String resultado2 = (a==b) ? "verdadeiro, 5 = 6 " : "falso, 5 é diferente de 6.";

		System.out.println(resultado2);
    }
}
