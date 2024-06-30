package EstruturaQueRepetem;

public class ExemploForContinue {

    public static void main(String[] args) {
        
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);           
        }
        System.out.println("A contagem loop for com a variael numero permanece até completar <= 5. ");
    }
}
