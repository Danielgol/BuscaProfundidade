import java.util.ArrayList;

public class Cidade {
	
	private String nome;
	private ArrayList<Cidade> cidades;
	
	public Cidade(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object o) {
		Cidade outra = (Cidade) o;
		if(outra.getNome().equals(nome)) {
			return true;
		}
		return false;
	}
	
	public void definirCidades(ArrayList<Cidade> lista) {
		this.cidades = lista;
	}

	public ArrayList<Cidade> getCidades() {
		return cidades;
	}
	
	public String getNome() {
		return nome;
	}

}
