package EstruturasDeExcecao;

import java.text.NumberFormat;
import java.lang.Exception;
import java.text.ParseException;


public class TratamentoDeExcecao extends Exception {

    public static void main(String[] args) {
        try {
             Number valor = Double.valueOf("a1.75");

            valor = NumberFormat.getInstance().parse("a1.75");
            
            System.out.println(valor);
        } catch (Exception e) {
            // TODO: handle exception...
        }
           
    }
}
