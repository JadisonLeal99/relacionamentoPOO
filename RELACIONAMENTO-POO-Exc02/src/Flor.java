//Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente 
//que comprou a flor e um boolean que determina se a flor é para presente ou não
//Descubra:
//a) Qual a flor mais cara?
//b) Se a loja teve uma receita maior vendendo flores para presente ou não
public class Flor {
	private String nomeFlor;
	private double preco;
	private String nomeCliente;
	private Boolean presenteFlor;
	
	public Flor(String nomeFlor, double preco, String nomeCliente, boolean presenteFlor) {
		setNomeFlor(nomeFlor);
		setPreco(preco);
		setNomeCliente(nomeCliente);
		setPresenteFlor(presenteFlor);
	}
	
	
	public String getNomeFlor() {
		return nomeFlor;
	}
	
	public void setNomeFlor(String nomeFlor) {
		if(nomeFlor == null || nomeFlor.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nomeFlor = nomeFlor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		if(preco <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		if(nomeCliente == null || nomeCliente.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nomeCliente = nomeCliente;
	}
	
	public boolean getPresenteFlor() {
		return presenteFlor;
	}
	
	public void setPresenteFlor(Boolean presenteFlor) {
		this.presenteFlor = presenteFlor;
	}


	@Override
	public String toString() {
		return "Flor [nomeFlor=" + nomeFlor + ", preco=" + preco + ", nomeCliente=" + nomeCliente + ", presenteFlor="
				+ presenteFlor + "]";
	}
	
}



















































