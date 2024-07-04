package fabrica;

import equipamentos.multifuncional.*;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.digitalizadora.Scanner;
import equipamentos.digitalizadora.*;
import equipamentos.copiadora.*;

public class Loja {
 
	public static void main(String[] args) {
		Impressora impressora1 = new Deskjet();
		Impressora impressora2 = new Laserjet();
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Digitalizadora digitalizadora = em;
		Impressora impressora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
