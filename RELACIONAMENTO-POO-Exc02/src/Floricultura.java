//Em um sistema de uma floricultura deve se guardar o nome da flor, o preço, o nome do cliente 
//que comprou a flor e um boolean que determina se a flor é para presente ou não
//Descubra:
//a) Qual a flor mais cara?
//b) Se a loja teve uma receita maior vendendo flores para presente ou não

import java.util.ArrayList;
import java.util.List;

public class Floricultura {
	private List<Flor> listaFlores;

	//construtor
	public Floricultura() {
		listaFlores = new ArrayList<Flor>();
	}
	
	public void adicionarFlores(Flor f) {
		listaFlores.add(f);
	}
	
	public List<Flor> listarFlores() {
		return listaFlores;
	}
	
	// METODOS
	public Flor acharFlorMaisCara() {
		double maisCara = 0;
		Flor florMaisCara = null;
		
		for(Flor f : listaFlores) {
			if(f.getPreco() > maisCara) {
				maisCara = f.getPreco();
				florMaisCara = f;
			}
		}
		return florMaisCara;
	}
	
	
	public Flor calcularReceitaLojaFlor() {
		boolean maiorReceitaPresente;
		Flor presenteReceitaFlor = null;
		
		for(Flor f : listaFlores) {
			if(f.faturamentoPresenteFlorTrue() > f.faturamentoPresenteFlorFalse()) {
				maiorReceitaPresente = true;
				presenteReceitaFlor = f;
			}
		
		}
		return presenteReceitaFlor;
	}
	
	
	
}
	

























