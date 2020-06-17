package sets;

import java.util.HashSet;
import java.util.Set;

import listes.Ville;

public class TestSetString {

	public static void main(String[] args) {
		
		Set<String> pays = new HashSet<>();
		
		pays.add("USA");
		pays.add("France");
		pays.add("Allemagne");
		pays.add("UK");
		pays.add("Italie");
		pays.add("Japon");
		pays.add("Chine");
		pays.add("Russie");
		pays.add("Inde");
		
		//Pays ayant le plus de lettres : 
		
		String paysPlusGrandNbDeLettres = "";
		for (String nomPays: pays) {
			if (pays.size()>paysPlusGrandNbDeLettres.length()) {
				paysPlusGrandNbDeLettres = nomPays;
			}
		}
		System.out.println("Nom du pays ayant le plus de lettres : "+paysPlusGrandNbDeLettres);

		
		//Suppression de ce pays : 
		
		pays.remove("Allemagne");
		System.out.println("Nouveau set : " + pays);
		
		
	}

}
