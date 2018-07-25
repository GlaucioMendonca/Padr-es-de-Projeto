
public class Client {
	
	public static void main (String args[]) {
		Maquina m = new Maquina(2.00, SlotID.slot1, SlotID.slot1);
		System.out.println(m.comfirmarPagamento());
	}
}
