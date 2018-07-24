import java.util.ArrayList;

public class Slot1 extends SlotChain{

	public Slot1(SlotID id) {
		super(id);
		
	}

	@Override
	public void efetuarCompra(ArrayList<SlotID> valores) {
		if (super.getValorCompra() < 1.00) return;
		
		for (SlotID valor:valores) {
			
			// se a moeda for desse valor
			if (valor == SlotID.slot1) {
				//remova a moeda
				valores.remove(valor);
				
				
				//atualize valor da compra
				super.setValorCompra(super.getValorCompra()-1.00);
			}
			
		}
	}
}
