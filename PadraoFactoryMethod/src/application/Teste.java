package application;

import controller.FirstNameFactory;
import controller.LastNameFactory;


public class Teste {

	public static void main(String[] args) {
		
		FirstNameFactory nome_ft = new LastNameFactory();
		
		nome_ft.criarNome("Gláucio,Mendonça","Gustavo,Lima","Rebeca,Gabrielle");
		
		nome_ft.Imprimir();
	}

}
