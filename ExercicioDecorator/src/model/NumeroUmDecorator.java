package model;

public abstract class NumeroUmDecorator implements NumeroUm{
	private NumeroUm numeroUm;
	
	public NumeroUmDecorator() {}
	public NumeroUmDecorator (NumeroUm n1) {
		this.numeroUm = n1;
	}

	@Override
	public String imprimir() {
		if(numeroUm == null)
			return "1";
		else
			return numeroUm.imprimir();
		
	}
}
