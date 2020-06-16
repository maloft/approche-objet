package listes;

import java.util.ArrayList;
import java.util.Iterator;


public class TestListeString {
	
	public static void afficherListe(ArrayList<Ville> ville)
	{
		Iterator<Ville> it4= ville.iterator();
		
		while (it4.hasNext())
		{
			Ville v = it4.next();
			v.afficherVille();
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Ville> ville = new ArrayList<>();
		
		ville.add(new Ville("Nice", 343000));
		ville.add(new Ville("Carcassonne", 47800));
		ville.add(new Ville("Narbonne", 53400));
		ville.add(new Ville("Lyon", 484000));
		ville.add(new Ville("Foix", 9700));
		ville.add(new Ville("Pau", 77200));
		ville.add(new Ville("Marseille", 850700));
		ville.add(new Ville("Tarbes", 40600));
		
		Iterator<Ville> it = ville.iterator();
		
		int maxPop = Integer.MIN_VALUE;
		Ville peuple = new Ville();
		
		while (it.hasNext())
		{
			Ville v = it.next();
			if (v.getNbHab() > maxPop)
			{
				maxPop = v.getNbHab();
				peuple = v;
			}
		}
		System.out.println("La ville la plus peuplée : ");
		peuple.afficherVille(); //Afficher la ville la plus peuplée
		
		//******** Suppression de la ville la moins peuplée **************
		
		Iterator<Ville> it2 = ville.iterator();
		
		int min = Integer.MAX_VALUE;
		Ville moinsPeuplee = new Ville();
		
		while (it2.hasNext())
		{
			Ville v = it2.next();
			if (v.getNbHab() < min)
			{
				min = v.getNbHab();
				moinsPeuplee = v;
			}
		}
		
		ville.remove(ville.indexOf(moinsPeuplee));
		
		
		//*********** Mettre en maj les villes dont le nbHab > 100 000 ******************
		
		Iterator<Ville> it3= ville.iterator();
		
		while (it3.hasNext())
		{
			Ville v = it3.next();
			if (v.getNbHab() >= 100000)
			{
				v.setNom(v.getNom().toUpperCase());
			}
		}
		

		//****************** Afficher la liste ********************
		
		System.out.println("La liste des villes : ");
		TestListeString.afficherListe(ville);
		
		

		
		

	}

}
