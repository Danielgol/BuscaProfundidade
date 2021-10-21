import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Cidade c1 = new Cidade("Brest");
		Cidade c2 = new Cidade("Rennes");
		Cidade c3 = new Cidade("Nantes");
		Cidade c4 = new Cidade("Tours");
		Cidade c5 = new Cidade("Limoges");
		Cidade c6 = new Cidade("Bordeaux");
		Cidade c7 = new Cidade("Toulouse");
		Cidade c8 = new Cidade("Montpellier");
		Cidade c9 = new Cidade("Marseille");
		Cidade c10 = new Cidade("Nice");
		Cidade c11 = new Cidade("Lyon");
		Cidade c12 = new Cidade("Dijon");
		Cidade c13 = new Cidade("Orleans");
		Cidade c14 = new Cidade("Paris");
		Cidade c15 = new Cidade("Amiens");
		Cidade c16 = new Cidade("Lille");
		Cidade c17 = new Cidade("Reims");
		Cidade c18 = new Cidade("Metz");
		Cidade c19 = new Cidade("Nancy");
		Cidade c20 = new Cidade("Strasbourg");
		
		ArrayList<Cidade> lista1 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista2 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista3 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista4 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista5 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista6 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista7 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista8 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista9 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista10 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista11 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista12 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista13 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista14 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista15 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista16 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista17 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista18 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista19 = new ArrayList<Cidade>();
		ArrayList<Cidade> lista20 = new ArrayList<Cidade>();
		
		lista1.add(c2);
		
		lista2.add(c1);
		lista2.add(c3);
		
		lista3.add(c2);
		lista3.add(c4);
		
		lista4.add(c3);
		lista4.add(c5);
		lista4.add(c13);
		
		lista5.add(c4);
		lista5.add(c6);
		lista5.add(c7);
		lista5.add(c11);
		
		lista6.add(c5);
		
		lista7.add(c5);
		lista7.add(c8);

		lista8.add(c7);
		lista8.add(c9);
		lista8.add(c11);
		
		lista9.add(c8);
		lista9.add(c10);
		lista9.add(c11);
		
		lista10.add(c9);
		
		lista11.add(c5);
		lista11.add(c8);
		lista11.add(c9);
		lista11.add(c12);
		
		lista12.add(c11);
		lista12.add(c13);
		lista12.add(c19);
		
		lista13.add(c4);
		lista13.add(c12);
		lista13.add(c14);
		
		lista14.add(c13);
		lista14.add(c15);
		lista14.add(c17);
		
		lista15.add(c14);
		lista15.add(c16);
		lista15.add(c17);
		
		lista16.add(c15);
		
		lista17.add(c14);
		lista17.add(c15);
		lista17.add(c18);
		
		lista18.add(c17);
		lista18.add(c19);
		
		lista19.add(c12);
		lista19.add(c18);
		lista19.add(c20);
		
		lista20.add(c19);
		
		c1.definirCidades(lista1);
		c2.definirCidades(lista2);
		c3.definirCidades(lista3);
		c4.definirCidades(lista4);
		c5.definirCidades(lista5);
		c6.definirCidades(lista6);
		c7.definirCidades(lista7);
		c8.definirCidades(lista8);
		c9.definirCidades(lista9);
		c10.definirCidades(lista10);
		c11.definirCidades(lista11);
		c12.definirCidades(lista12);
		c13.definirCidades(lista13);
		c14.definirCidades(lista14);
		c15.definirCidades(lista15);
		c16.definirCidades(lista16);
		c17.definirCidades(lista17);
		c18.definirCidades(lista18);
		c19.definirCidades(lista19);
		c20.definirCidades(lista20);
		
		Sistema system = new Sistema();
		
		System.out.println(system.busca(c20, c1));
		
	}

}
