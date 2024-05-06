package controller;

import fateczl.listaEncadeada.model.ListaEncadeada;

public class Controller03 {

	ListaEncadeada lista = new ListaEncadeada();

	public void popularLista(int[] vetor) throws Exception {

		for (int i = 0; i < vetor.length - 1; i++) {
			if (lista.isEmpty()) {
				lista.addFirst(vetor[i]);
			} else {
				lista.add(vetor[i], i);
			}
		}
	}

	public void operações(int[] vetor) throws Exception {

		for (int i = 0; i < vetor.length - 1; i++) {
			for (int j = 0; j < lista.size(); j++) {
				if (lista.get(j) == vetor[i]) {
					lista.addLast(i);
//					j = lista.size();
					break;
				}
				if(vetor[i] % 2 == 0) {
					lista.add(vetor[i], 2);
				}else {
					lista.add(vetor[i], 1);
				}
			}
		}
	}
	
	public void exibirLista() throws Exception {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
