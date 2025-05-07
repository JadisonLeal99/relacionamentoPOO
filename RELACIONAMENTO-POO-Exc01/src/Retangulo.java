
public class Retangulo {
	private double altura;
	private double largura;
	
	
	public Retangulo(Double altura, Double largura) {
		setAltura(altura);
		setLargura(largura);
	}
	
	
	public double calcularArea() {
		return altura * largura;
	}
	
	public double calcularPerimetro() {
		return (altura * 2) + (largura * 2);
	}
	
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		if(altura <= 0) {
			throw new IllegalArgumentException("Altura Inválida!");
		}
		this.altura = altura;
	}
	
	public Double getLargura() {
		return largura;
	}
	
	public void setLargura(Double largura) {
		if(largura <= 0) {
			throw new IllegalArgumentException("Largura Inválida!");
		}
		this.largura = largura;
	}

	@Override
	public String toString() {
		return "Retangulo [altura=" + altura + ", largura=" + largura + "]";
	}
	
}









