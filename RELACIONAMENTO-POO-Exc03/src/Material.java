
public class Material {
	private String nomeProduto;
	private String descricao;
	private double preco;
	private double volume;
	private double peso;
	private int quantidadeEstoque = 1;
	
	public Material(String nomeProduto, String descricao, double preco, double volume, double peso ,int quantidadeEstoque) {
		setNomeProduto(nomeProduto);
		setDescricao(descricao);
		setPreco(preco);
		setVolume(volume);
		setPeso(peso);
		setQuantidadeEstoque(quantidadeEstoque);
	}
	
	
	// METODOS
	
	public double gerarVolumeDoMaterial() {
		return this.preco * this.volume;
	}
	
	public double gerarDensidadeDoMaterial() {
		return this.peso * this.volume;
	}
	
	
	//Adiciona mais unidades da peça ao estoque
		public void adicionarPecaEstoque(int quantidade) {
			if(quantidade <= 0) {
				throw new IllegalArgumentException("A quantidade deve ser maior do que zero");
			}
			this.quantidadeEstoque += quantidade;
		}
	
		
	//Vender um produto, podendo ser vendido até o mesmo número de peças que tem no estoque
		public void venderProduto(int quantidade) {
			if(quantidade > this.quantidadeEstoque) {
				throw new IllegalArgumentException("A quantidade de produtos a ser vendido excedeu a quantidade em estoque!");
			}
			this.quantidadeEstoque -= quantidade;
		}
		
		
	// Colocar o produto em promoção, o parâmetro do método deve ser a porcentagem do desconto
		
		public void produtoEmPromocao(double percentual) {
			double desconto = this.preco * (percentual / 100);
			double precoModificado = this.preco - desconto;
			this.preco = precoModificado;
		}
		
	
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		if(nomeProduto == null || nomeProduto.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nomeProduto = nomeProduto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if(descricao == null || descricao.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public void setVolume(double volume) {
		if(volume <= 0) {
			throw new IllegalArgumentException("Volume inválido");
		}
		this.volume = volume;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso <= 0) {
			throw new IllegalArgumentException("Peso inválido");
		}
		this.peso = peso;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque < 0) {
			throw new IllegalArgumentException("Quantidade inválida");
		}
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
}
