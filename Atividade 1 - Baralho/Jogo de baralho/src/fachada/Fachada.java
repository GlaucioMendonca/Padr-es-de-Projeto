package fachada;

import model.Jogador;

public class Fachada {

	// O jogo ser� melhor de 3
	// reposit�rio de jogadas do primeiro round
	private static Jogo round1;
	// reposit�rio de jogadas do segundo round
	private static Jogo round2;
	// reposit�rio de jogadas do terceiro round
	private static Jogo round3;
	
	private static int rodada = 0;

	public static void iniciarPartida(String nomeJ1, String nomeJ2) {
		// reposit�rio auxiliar
		Jogo aux = new Jogo();
		// primeiro jogador
		Jogador j = new Jogador(nomeJ1);
		aux.setJ1(j);
		j = null;

		// segundo jogador
		j = new Jogador(nomeJ2);
		aux.setJ2(j);

		if (round1 == null) {
			round1 = aux;
			
			return;
		}
		if (round2 == null) {
			round2 = aux;
			return;
		}
		if (round3 == null) {
			round3 = aux;
			return;
		}

	}
	
	public static 

}