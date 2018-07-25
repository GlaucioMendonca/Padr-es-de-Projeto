
public class Slot10 extends SlotChain{

	public Slot10(SlotID id) {
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
		next = new Slot05(SlotID.slot25);
		return next.efetuarCompra(valores);
	}

}
