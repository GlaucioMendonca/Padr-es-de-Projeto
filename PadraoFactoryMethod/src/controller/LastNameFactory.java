package controller;

import model.Nome;

public class LastNameFactory extends FirstNameFactory{
	
	@Override
	public void Imprimir () {
		for (Nome n: nomes) {
			System.out.println(n.getSobrenome()+" "+n.getNome());
		}
	}
}
