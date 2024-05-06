package controller;

import fateczl.listaSetGenerica.model.ListaSetGenerica;
import model.InformacoesMusica;

public class Controller05Vitufy extends Thread {

	public void adicionaMusica(ListaSetGenerica list, String stringMusica) throws Exception {

		// split retorna um vetor de Strings
		String[] infos = stringMusica.split(";");

		// Guardando as informa��es no Object Musica //Transformando a dura��o da Musica
		// em um inteiro
		InformacoesMusica novaMusica = new InformacoesMusica(infos[0], infos[1], Integer.parseInt(infos[2]));

		if (list.isEmpty()) {
			list.addFirst(novaMusica);
		} else
			list.addLast(novaMusica);
	}

	public void removeMusica(ListaSetGenerica list, int posicao) throws Exception {
		if (list.isEmpty()) {
			throw new Exception("Nenhuma Musica Para ser Removida");
		} else
			list.remove(posicao);
	}

	public void executarPlaylist(ListaSetGenerica list) throws Exception {

		for (int i = 0; i < list.size(); i++) {
			// acessando o toString da classe Informa��es Musica
			System.out.println(list.get(i).toString());

			// Acessando a dura��o da m�sica
			InformacoesMusica musica = (InformacoesMusica) list.get(i);
			int duracao = musica.getDuracao();
			sleep(duracao);

		}
		if (list.isEmpty()) {
			throw new Exception("Nenhuma Musica Para ser Tocada");
		}
	}
}
