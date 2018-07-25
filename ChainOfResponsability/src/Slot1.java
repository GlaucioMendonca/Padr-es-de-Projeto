public class Slot1 extends SlotChain{

	public Slot1(SlotID id) {
		super(id);
	}

	@Override
	public Double efetuarCompra(SlotID valores) {
	
		if (valores.toString().equals("slot1")) {
			return new Double(1.00);
		}
		else if(next!= null){
			return next.efetuarCompra(valores);
		}
		
		return new Double(0);

	}
}