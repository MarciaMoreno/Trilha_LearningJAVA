package CaseProcessoSeletivo;

import java.util.Arrays;

public class ListandoCandidatos {

    public static void main(String[] args){      

        case1("FELIPE", 1200.00);
        case1("MÁRCIA", 2000.00);
        case1("JULIA", 1500.00);
        case1("DANIELA", 1800.00);
        case1("PAULO", 2000.00);
        case1("AUGUSTO", 3000.00);
        case1("MÔNICA", 1700.00);
        case1("FABRÍCIO", 2100.00);
        case1("MIRELA", 2800.00);
        case1("JORGE", 2000.00);
    }

    static void case1(String candidato, double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido) {
            System.out.println("Candidato Selecionado: "+candidato);            
        }
        else if( salarioBase == salarioPretendido) System.out.println("Oferecer contra-proposta"+candidato);
        else System.out.println("Aguardar nova oportunidade...");
    }



}
