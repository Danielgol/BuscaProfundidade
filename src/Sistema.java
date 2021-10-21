import java.util.ArrayList;

public class Sistema {
	
	private ArrayList<Cidade> visitadas;
	
	public Sistema() {
		this.visitadas = new ArrayList<Cidade>();
	}

	public String busca(Cidade origem, Cidade destino) {
		
		this.visitadas.add(origem);
		
		if(origem.equals(destino)) {
			return origem.getNome();
		}
		
		for(int i=0; i<origem.getCidades().size(); i++) {
			Cidade node = origem.getCidades().get(i);
			
			if(!this.visitadas.contains(node)) {
				
				/*
				for(int x=0; x<origem.getCidades().size(); x++) {
					if(origem.getCidades().get(x).equals(node)) {
						System.out.print("("+origem.getCidades().get(x).getNome()+")   ");
					}else {
						System.out.print(origem.getCidades().get(x).getNome()+"   ");
					}
				}
				System.out.println();
				*/
				
				String resultado = this.busca(node, destino);
				if(!resultado.equals("")) {
					return origem.getNome()+" => "+resultado;
				}
			}
		}
		return "";
		
	}

}
