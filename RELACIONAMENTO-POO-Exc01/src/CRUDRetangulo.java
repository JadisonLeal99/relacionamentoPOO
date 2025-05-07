
public class CRUDRetangulo {
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(15.0, 1.0);
		Retangulo r2 = new Retangulo(5.0, 6.0);
		Retangulo r3 = new Retangulo(3.0, 2.0);
		Retangulo r4 = new Retangulo(1.0, 3.0);

		
		
		ColecaoRetangulos cr1 = new ColecaoRetangulos();
		cr1.adicionarRetangulos(r1);
		cr1.adicionarRetangulos(r2);
		cr1.adicionarRetangulos(r3);
		cr1.adicionarRetangulos(r4);
		
		System.out.println("Retangulo maior Area: " + cr1.acharMaiorArea());
		System.out.println("Retangulo maior Perimetro: " + cr1.acharMaiorPerimetro());
		
	}
}
