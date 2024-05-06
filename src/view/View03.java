package view;

import controller.Controller03;

public class View03 {

	public static void main(String[] args) throws Exception {
		
		Controller03 cont = new Controller03();
		int[] vetor = { 3, 3, 9, 6, 9, 8, 9, 5, 7, 10, 4, 8, 10, 8 };
		int[] filaInicial = { 1, 2, 6, 7, 8 };
		
		cont.popularLista(filaInicial);
		cont.operações(vetor);
		cont.exibirLista();
		
	}
}
