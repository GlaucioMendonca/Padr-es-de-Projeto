
public class Maquina {
	private Double preco;
	private Double soma;
	private SlotID[] moedas;
	
	public Maquina (Double preco, SlotID ...moedas) {
		this.preco = preco;
		this.moedas = moedas;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double getSoma() {
		return soma;
	}

	public void setSoma(Double soma) {
		this.soma = soma;
	}

	public SlotID[] getMoedas() {
		return moedas;
	}

	public void setMoedas(SlotID[] moedas) {
		this.moedas = moedas;
	}
	
	public Double comfirmarPagamento () {
		SlotChain slot = new Slot01(SlotID.slot01);
		
		if(preco != null) {
			for (SlotID moeda: moedas) {
				soma = slot.efetuarCompra(moeda);
				
				if (soma >= preco) {
					break;
				}
			}
		}else {
			return null;
		}
		
		return soma - preco;
	}
}
