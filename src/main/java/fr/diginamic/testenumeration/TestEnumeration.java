package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		// Affichage de toutes les saisons : 
		
		for (Saison s : Saison.values()) 
		{
			System.out.println(s);
		}
		
		/* Utilisez une méthode de base des énumérations pour retrouver
		 *  et afficher lelibellé de l’instance de Saison dont le nom est ETE.*/
		
		for (Saison s : Saison.values())
		{
			if (Saison.ETE.equals(s))
			{
				System.out.println("La saison qui correspont est : " + s);
			}
		}
		
		/* Développez une méthode dans votre énumération qui retourne 
		 * une instance de Saison en fonction du libellé. */
		
		String libelle = "Hiver";
		
		Saison saison = Saison.libelleSaison(libelle);
		
		System.out.println("La saison correspondante est : " + saison);

	}


}
