package model;

public class NumeroUmColchetes extends NumeroUmDecorator{
	
	public NumeroUmColchetes() {}
	public NumeroUmColchetes(NumeroUm n1) {
		super(n1);
	}

	@Override
	public String imprimir() {
		return "["+super.imprimir()+"]";
	}
}
