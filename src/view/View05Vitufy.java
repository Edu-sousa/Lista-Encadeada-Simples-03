package view;

import javax.swing.JOptionPane;

import controller.Controller05Vitufy;
import fateczl.listaSetGenerica.model.ListaSetGenerica;

public class View05Vitufy {

	public static void main(String[] args) throws Exception {

		Controller05Vitufy cont = new Controller05Vitufy();
		ListaSetGenerica lista = new ListaSetGenerica();
		int escolha = 1;

		String nomeMusica;
		String nomeArtista;
		int duracao;

		while (escolha != 0) {

			escolha = Integer.parseInt(JOptionPane.showInputDialog(
					"\tMenu Vitufy\n1 - Adicionar Musicas\n2 - Remover Musica\n3 - Executar Playlist\n0 - Sair"));
			switch (escolha) {

			case 1:
				nomeMusica = JOptionPane.showInputDialog("Nome Da Musica");
				nomeArtista = JOptionPane.showInputDialog("Nome Do Artista");
				duracao = Integer.parseInt(JOptionPane.showInputDialog("Duração Da Musica"));

				String info = nomeMusica + ";" + nomeArtista + ";" + duracao;
				cont.adicionaMusica(lista, info);
				break;

			case 2:
				int posicao = 0;
				cont.removeMusica(lista, posicao);
				break;

			case 3:
				cont.executarPlaylist(lista);
				break;

			case 0:
				escolha = 0;
			}
		}
	}
}
