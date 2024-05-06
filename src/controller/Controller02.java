package controller;

import fateczl.listaEncadeada.model.ListaEncadeada;

public class Controller02 {

	ListaEncadeada listaI = new ListaEncadeada();
	ListaEncadeada listaU = new ListaEncadeada();

	public ListaEncadeada popularLista(int[] vetor, ListaEncadeada lista) throws Exception {
		for (int i = 0; i < vetor.length; i++) {
			if (i == 0) {
				lista.addFirst(vetor[i]);
			} else if (i == vetor.length) {
				lista.addLast(vetor[i]);
			} else {
				lista.add(vetor[i], i);
			}
		}
		return lista;
	}

	// I � a lista com a intersec��o das listas A e B
	public ListaEncadeada listaI(ListaEncadeada lista, ListaEncadeada lista2) throws Exception {
		int aux = 0; // variavel para definir a posi��o para adicionar elementos na listaI

		for (int i = 0; i < lista.size(); i++) {
			for (int j = 0; j < lista2.size(); j++) {

				if (lista.get(i) == lista2.get(j) && listaI.isEmpty()) {
					listaI.addFirst(lista.get(i)); // Pega na lista o valor da posi��o i e adiciona o primeiro elemento
													// da fila
				} else if (lista.get(i) == lista2.get(j)) {
					listaI.add(lista.get(i), aux); // Pega na lista o valor da posi��o i e adiciona na listaI na posi��o
													// aux
					aux++;
				}
			}
		}
		exibirLista(listaI);
		return listaI;

	}

	// U � a lista com a uni�o de A e B
	public void listaU(ListaEncadeada L, ListaEncadeada L2) throws Exception {
		// adicionando elementos da primeira lista - lista A
		for (int i = 0; i < L.size(); i++) {
			if (listaU.isEmpty()) {
				listaU.addFirst(L.get(i)); // Adiciona na listaU o valor da posi��o i da lista L
			} else {
				listaU.add(L.get(i), i);
			}
		}

		for (int i = 0; i < L2.size(); i++) {
			if (listaU.isEmpty()) {
				listaU.addFirst(L.get(i));
			} else {
				listaU.add(L2.get(i), i);
			}
		}

		exibirLista(listaU);
	}

	public void exibirLista(ListaEncadeada lista) throws Exception {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
