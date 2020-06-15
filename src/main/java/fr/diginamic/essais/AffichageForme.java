package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class AffichageForme {
	
	
	/** Une méthode de classe permettant d'afficher le périmètre et la surface de la forme choisie. */
	public static void afficher(Forme f )
	{
		System.out.println("Le périmètre du " + f.afficherType() + " est : " + f.calculerPerimetre());
		System.out.println("La surface du " + f.afficherType() + " est : " + f.calculerSurface());
		
	}

}
