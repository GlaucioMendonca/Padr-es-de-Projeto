package model;

public class NumeroUmChaves extends NumeroUmDecorator{

	public NumeroUmChaves() {}
	public NumeroUmChaves(NumeroUm n1) {
		super(n1);
	}
	
	@Override
	public String imprimir() {
		return "{ "+super.imprimir()+" }";
	}
}
