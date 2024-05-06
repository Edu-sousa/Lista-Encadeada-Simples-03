package controller;

import br.com.biblioteca.quick.QuickSort;
import fateczl.listaEncadeada.model.ListaEncadeada;

public class Controller01 {

	ListaEncadeada lista = new ListaEncadeada();
	QuickSort quick = new QuickSort();

	public void popularLista(int[] vetor) throws Exception {
		for (int i = 0; i < vetor.length; i++) {
			if (i == 0) {
				lista.addFirst(vetor[i]);
			} else if (i == vetor.length) {
				lista.addLast(vetor[i]);
			} else {
				lista.add(vetor[i], i);
			}
		}
	}

	public int[] organizarVetor(int[] vetor) {
		quick.quickSort(vetor, 0, vetor.length - 1);
		return vetor;
	}

	public void listaOrganizada(int[] vetor) throws Exception {
		for (int i = 0; i < vetor.length; i++) {
			lista.remove(i);
			lista.add(vetor[i], i);
		}

	}

	public void exibirLista() throws Exception {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}

}
