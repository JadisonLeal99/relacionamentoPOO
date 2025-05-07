//Faça uma classe chamada Retangulo, com os atributos altura e largura.
//Faça um método para descobrir a área e outro para descobrir o perímetro.
//Crie 5 objetos de Retangulo.
//Crie uma lista em outra classe para armazenar todos os objetos de Retangulo
//Faça um método que encontre o Retangulo com a maior área e outro que encontre o Retangulo 
//com o maior perímetro
//Imprima o toString desses Retangulos


import java.util.ArrayList;
import java.util.List;

public class ColecaoRetangulos {
	private List<Retangulo> listaRetangulos;
	
	//construtor
	public ColecaoRetangulos() {
		listaRetangulos = new ArrayList<Retangulo>();
	}
	
	public void adicionarRetangulos(Retangulo r) {
		listaRetangulos.add(r);
	}
	
	public List<Retangulo> listarRetangulos() {
		return listaRetangulos;
	}
	
	// METODOS
	public Retangulo acharMaiorArea() {
		double maiorArea = 0;
		Retangulo retanguloArea = null;
		for(Retangulo r : listaRetangulos) {
 			if(r.calcularArea() > maiorArea) {
				maiorArea = r.calcularArea();
				retanguloArea = r;
			}
		}
		return retanguloArea;
	}
	
	public Retangulo acharMaiorPerimetro() {
	
		double maiorPerimetro = 0;
		Retangulo retanguloMaiorPerimetro = null;
		
		for(Retangulo r : listaRetangulos) {
 			if(r.calcularPerimetro() > maiorPerimetro) {
 				maiorPerimetro = r.calcularPerimetro();
				retanguloMaiorPerimetro = r;
			}
		}
		return retanguloMaiorPerimetro;
	}
}

























