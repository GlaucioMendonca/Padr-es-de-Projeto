package aplication;

import model.NumeroUm;
import model.NumeroUmChaves;
import model.NumeroUmColchetes;
import model.NumeroUmNormal;

public class Teste {
	
	public static void main (String args[]) {
		
		NumeroUm normal = new NumeroUmNormal();
		NumeroUm colchete = new NumeroUmColchetes();
		NumeroUm chaves = new NumeroUmChaves();
		NumeroUm chaveColchete = new NumeroUmChaves(new NumeroUmColchetes());
		
		System.out.println(normal.imprimir());
		System.out.println(colchete.imprimir());
		System.out.println(chaves.imprimir());
		System.out.println(chaveColchete.imprimir());
	}
}
