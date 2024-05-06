package model;

public class InformacoesMusica {

	String nomeMusica;
	String nomeArtista;
	int duracao;

	public InformacoesMusica(String nomeMusica, String nomeArtista, int duracao) {
		this.nomeMusica = nomeMusica;
		this.nomeArtista = nomeArtista;
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return "[Música: " + nomeMusica + " - Artista: " + nomeArtista + " Duracao: " + duracao + "]";
	}

	public int getDuracao() {
		return duracao;
	}
	
	
}
