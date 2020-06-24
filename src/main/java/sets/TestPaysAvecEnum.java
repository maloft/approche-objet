package sets;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestPaysAvecEnum {

	public static void main(String[] args) {
		
		Set<Pays> pays = new HashSet<>();
		
		pays.add(new Pays("USA", 328_239_523, 62606, Continent.AMERIQUEDUNORD));
		pays.add(new Pays("France", 69_861_344, 43551, Continent.EUROPE));
		pays.add(new Pays("Allemagne", 82_801_531, 50206, Continent.EUROPE));
		pays.add(new Pays("UK", 63_421_628, 43620, Continent.EUROPE));
		pays.add(new Pays("Italie", 61_302_519, 37970, Continent.EUROPE));
		pays.add(new Pays("Japon", 124_856_424, 42659, Continent.ASIE));
		pays.add(new Pays("Chine", 1_408_089_559, 16624, Continent.ASIE));
		pays.add(new Pays("Maroc", 34_434_660, 3150, Continent.AFRIQUE));
		
		
		
		// Réalisez une boucle qui affiche l’ensemble des pays
		for (Continent c : Continent.values())
		{
			System.out.println(c);
		}
		
		// Comptage de pays par continent : 
		Map<Continent, Integer> comptage = new HashMap<>();
		
		for (Continent c : Continent.values())
		{
			comptage.put(c, 0);
		}
		
		for (Pays p : pays)
		{
			Integer compteur = comptage.get(p.getContinent());
			compteur++;
			comptage.put(p.getContinent(), compteur);
		}
		
		for (Continent c : comptage.keySet())
		{
			System.out.println(c.getNom() + " contient : " + comptage.get(c) + " pays.");
		}
		

		
		
	}

}
