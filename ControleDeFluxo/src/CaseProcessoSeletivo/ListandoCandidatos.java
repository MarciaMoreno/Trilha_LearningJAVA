package CaseProcessoSeletivo;

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
        if (salarioPretendido >= 2000.00)
        System.out.println("Candidato Selecionado: "+candidato);
        
    }

    static void selecionar(){
        
    }
    
}
