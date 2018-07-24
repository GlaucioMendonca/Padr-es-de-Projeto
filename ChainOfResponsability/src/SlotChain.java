import java.util.ArrayList;

public abstract class SlotChain {
	protected SlotChain next;
	protected SlotID identificadorSlot;
	private Double valorCompra;
	
	public SlotChain (SlotID id) {
		next = null;
		identificadorSlot = id;
		
	}
	
	public void setNext (SlotChain slot) {
		if (next == null) {
			next = slot;
		}else {
			next.setNext(slot);
		}
		
	}
	
	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public abstract void efetuarCompra (ArrayList<SlotID> valores);
	
}
