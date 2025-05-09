import java.util.ArrayList;
import java.util.List;

public class MaterialConstrucao {
	private List<Material> listaMateriais;
	
	
	//constructor
	public MaterialConstrucao() {
		listaMateriais = new ArrayList<Material>();
	}
	
	
	public void adicionarMateriais(Material m) {
		listaMateriais.add(m);
	}
	
	public List<Material> listarMateriais() {
		return listaMateriais;
	}
	
	
	// Qual o material mais caro
	public Material acharMaterialMaisCaro() {
		double maisCaro = 0;
		Material materialMaisCaro = null;
		for(Material m : listaMateriais) {
			if(m.getPreco() > maisCaro) {
				maisCaro = m.getPreco();
				materialMaisCaro = m;
			}
		}
		return materialMaisCaro;
	}
	
	
	// Qual o material mais caro por metro cúbico
	public Material acharMaisCaroPorVolume() {
		double maisCaro = 0;
		Material materialVolumeMaisCaro = null;
		for(Material m : listaMateriais) {
			if(m.gerarVolumeDoMaterial() > maisCaro) {
				maisCaro = m.gerarVolumeDoMaterial();
				materialVolumeMaisCaro = m;
			}
		}
		return materialVolumeMaisCaro;
	}
	

	// Qual o material mais denso
	public Material acharMaterialMaisDenso() {
		double maisDenso = 0;
		Material materialMaiorDensidade = null;
		for(Material m : listaMateriais) {
			if(m.gerarDensidadeDoMaterial() > maisDenso) {
				maisDenso = m.gerarDensidadeDoMaterial();
				materialMaiorDensidade = m;
			}
		}
		return materialMaiorDensidade;
	}
	
	
	// Qual o material que mais ocupa espaço no estoque
	public Material acharMaterialMaisVolumoso() {
		double maisVolume = 0;
		Material materialMaiorVolume = null;
		for(Material m : listaMateriais) {
			if(m.getVolume() > maisVolume) {
				maisVolume = m.getVolume();
				materialMaiorVolume = m;
			}
		}
		return materialMaiorVolume;
	}
	
	
}












