public abstract class SlotChain {
	protected SlotChain next;
	protected SlotID identificador;
	
	public SlotChain (SlotID id) {
		next = null;
		identificador = id;
	}
	
	public void setNext (SlotChain slot) {
		if (next == null) {
			next = slot;
		}else {
			next.setNext(slot);
		}
		
	}

	public abstract Double efetuarCompra (SlotID valores);
	
}
