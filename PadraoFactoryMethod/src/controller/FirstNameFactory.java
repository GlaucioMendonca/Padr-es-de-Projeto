package controller;

import java.util.ArrayList;
import java.util.List;

import model.Nome;

public class FirstNameFactory {
	
	protected List<Nome> nomes = new ArrayList <Nome>(); 
	
	public void criarNome (String ...nomeCompleto) {
		String n = null;
		String s = null;
		String[] nome = null;
		
		for(String i: nomeCompleto) {
			i.trim();
			nome = i.split(",");
			n = nome[0];
			s = nome[1];
			
			Nome name = new Nome(n,s);
			nomes.add(name);
		}
	}
	
	public void Imprimir () {
		for (Nome n: nomes) {
			System.out.println(n.getNome()+" "+n.getSobrenome());
		}
	}
}
