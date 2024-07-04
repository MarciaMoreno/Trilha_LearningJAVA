package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

	public void copiar() {
		System.out.println("Copiando VIA MULTIFUNCIONAL...");
	}
	public void imprimir() {
		System.out.println("Imprimindo VIA MULTIFUNCIONAL...");
	}
	public void digitalizar() {
		System.out.println("Digitalizando VIA MULTIFUNCIONAL...");
	}
	
	
}
