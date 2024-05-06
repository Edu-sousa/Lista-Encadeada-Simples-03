package view;

import controller.Controller02;
import fateczl.listaEncadeada.model.ListaEncadeada;

public class View02 {

	public static void main(String[] args) throws Exception {

		Controller02 cont = new Controller02();
		ListaEncadeada listaA = new ListaEncadeada();
		ListaEncadeada listaB = new ListaEncadeada();
		ListaEncadeada listaI = new ListaEncadeada();
		ListaEncadeada listaU = new ListaEncadeada();
		
		int[] vetor = { 3, 5, 8, 12, 9, 7, 16 };
		int[] vetor2 = { 9, 6, 2, 3, 7 };
		
		
		cont.popularLista(vetor, listaA);
		cont.popularLista(vetor2, listaB);
		
		cont.listaU(listaA, listaB);
		System.out.println("\n");
		cont.listaI(listaA, listaB);
		
		
		
		
		
	}

}
