package lanchonete.Cozinha;

public class Cozinheiro {
	
		//pode ser default
		public void adicionarLancheNoBalcao() {
			System.out.println("Cozinheiro ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
		}
		//  pode ser default
		public void adicionarSucoNoBalcao() {
			System.out.println("Cozinheiro ADICIONANDO SUCO DE FRUTA NO BALCÃO");
		}
		//pode ser default
		public void adicionarComboNoBalcao() {
			adicionarLancheNoBalcao();
			adicionarSucoNoBalcao();
		}
		private void prepararLanche() {
			System.out.println("Cozinheiro PREPARANDO LANCHE TIPO HAMBÚRGUER");
		}
		private void prepararVitamina() {
			System.out.println("Cozinheiro PREPARANDO VITAMINA DE MORANGO COM MAMÃO PAPAYA");
		}
		private void prepararCombo() {
			prepararLanche();
			prepararVitamina();
		}
		private void selecionarIngredientesLanche() {
			System.out.println("Cozinheiro SELECIONANDO O PÃO, SALADA, OVO E CARNE");
		}
		private void selecionarIngredientesVitamina() {
			System.out.println("Cozinheiro SELECIONANDO FRUTA, LEITE E SUCO");
		}
		private void lavarIngredientes() {
			System.out.println("Cozinheiro LAVANDO INGREDIENTES");
		}
		private void baterVitaminaLiquidificador() {
			System.out.println("Cozinheiro BATENDO VITAMINA NO LIQUIDIFICADOR");
		}
		private void fritarIngredientesLanche() {
			System.out.println("Cozinheiro FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
		}
		void pedirParaTrocarGas(Almoxarife almoxarife) {
			almoxarife.trocarGas();
		}
		void pedirIngredientes(Almoxarife almoxarife) {
			almoxarife.entregarIngredientes();
		}
	
}
