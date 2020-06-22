package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import sets.Pays;

public class MapPays {

	public static void main(String[] args) {
		
		Set<Pays> pays = new HashSet<>();
		
		pays.add(new Pays("USA", 328_239_523, 62606));
		pays.add(new Pays("France", 69_861_344, 43551));
		pays.add(new Pays("Allemagne", 82_801_531, 50206));
		pays.add(new Pays("UK", 63_421_628, 43620));
		pays.add(new Pays("Italie", 61_302_519, 37970));
		pays.add(new Pays("Japon", 124_856_424, 42659));
		pays.add(new Pays("Chine", 1_408_089_559, 16624));
		pays.add(new Pays("Russie", 126_434_660, 27900));
		pays.add(new Pays("Inde", 1_386_249_417, 5174));
		
		/* Création d'une map permettant de stocker les instances de pays (valeur)
		 *  en fonction de leur nom (clé). : */
		
		HashMap<String, Pays> mapPays = new HashMap<>();
		
		for (Pays p : pays)
		{
			mapPays.put(p.getNom(), p);
		}
		
		//Suppression du pays avec le moins d'habitants : 
		
		Pays paysMoinsHab = new Pays();
		
		int minPopulation = Integer.MAX_VALUE;
		paysMoinsHab.setNbHab(minPopulation);
		
		for (Pays p : mapPays.values())
		{
				if (p.getNbHab() < paysMoinsHab.getNbHab())
				{
					paysMoinsHab = p;
				}
		}
		
		mapPays.remove(paysMoinsHab.getNom());
		
		//Affichage de l’ensemble des pays restants.
		
		for (Pays p : mapPays.values())
		{
			System.out.println(p);
		}
		
		

	}

}
