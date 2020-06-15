package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {
		
		Forme cercle = new Cercle(2), rec = new Rectangle(1, 2), carre = new Carre(3);
		
		/** Test de la méthode afficher(Forme) de la classe AffichageForme */
		AffichageForme.afficher(cercle);
		AffichageForme.afficher(rec);
		AffichageForme.afficher(carre);
		

	}

}
