package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import listes.Ville;
import sets.Pays;

public class TestPays {

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
		
		
		//Recherche du pays avec le plus grand PIB/Hab : 
		
		Iterator<Pays> it = pays.iterator();
		
		double maxPibHab = Double.MIN_VALUE;
		Pays paysPlusGrandPIB = new Pays();
		
		while (it.hasNext())
		{
			Pays v = it.next();
			if (v.getPibHab() > maxPibHab)
			{
				maxPibHab = v.getPibHab();
				paysPlusGrandPIB = v;
			}
		}
		System.out.println("Le pays avec le PIB/Hab le plus grand est : ");
		paysPlusGrandPIB.afficherPays();
		
		//Pays avec le PIB total le plus important : 
		
		Iterator<Pays> it2 = pays.iterator();
		
		double maxPib = Double.MIN_VALUE;
		Pays paysPIBImportant = new Pays();
		
		while (it2.hasNext())
		{
			Pays v = it2.next();
			double pibTotal = v.getPibHab() * v.getNbHab();
			if ( pibTotal > maxPib)
			{
				maxPib = pibTotal;
				paysPIBImportant = v;
			}
		}
		
		System.out.println("Le pays avec le PIB le plus grand est : ");
		paysPIBImportant.afficherPays();
		
		//Mettre en maj : 
		
		Iterator<Pays> it3 = pays.iterator();
		
		double minPib = Double.MAX_VALUE;
		Pays paysPIBFaible = new Pays();
		
		while (it3.hasNext())
		{
			Pays v = it3.next();
			double pibTotal = v.getPibHab() * v.getNbHab();
			if ( pibTotal < minPib)
			{
				minPib = pibTotal;
				paysPIBFaible = v;
			}
		}
		
		paysPIBFaible.setNom(paysPIBFaible.getNom().toUpperCase());
		System.out.println("Le pays avec le PIB le plus petit est : ");
		paysPIBFaible.afficherPays();
		
		
		//Suppression de ce pays : 
		
		pays.remove(paysPIBFaible);
		
		System.out.println("Nouveau set de pays : ");
		Iterator<Pays> iterator = pays.iterator();
		while (iterator.hasNext()) {

		Pays myUser = iterator.next();
		myUser.afficherPays();

		}
		
		
		
		
		

	}

}
