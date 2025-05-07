
public class FloriculturaCRUD {
	public static void main(String[] args) {
		Flor f1 = new Flor("Orquidea", 15.50, "Reinaldo", false);
	Flor f2 = new Flor("Girassol", 22.50, "Reinaldo", false);
	Flor f3 = new Flor("Tulipa", 19.50, "Reinaldo", true);
	Flor f4 = new Flor("Rosa", 25.50, "Reinaldo", true);
	Flor f5 = new Flor("Margarida", 30.00, "Reinaldo", false);

	Floricultura fr1 = new Floricultura();
	fr1.adicionarFlores(f1);
	fr1.adicionarFlores(f2);
	fr1.adicionarFlores(f3);
	fr1.adicionarFlores(f4);
	fr1.adicionarFlores(f5);
	
	System.out.println("A flor mais cara é: " + fr1.acharFlorMaisCara().getNomeFlor());
	
	//System.out.println("A loja faturou R$" + fr1.acharFlorMaisCara().faturamentoPresenteFlorTrue() + " vendendo flor para presente e faturou R$" + fr1.calcularReceitaLojaFlor().faturamentoPresenteFlorFalse() + " vendendo flor que não é pra presente!");
	
	}
	
	
}
