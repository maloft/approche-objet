package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		
		/** Création d'une maison : */
		Maison m = new Maison();
		
		/** Création de pièces différentes à différents étages. */
		Piece cuisine = new Cuisine(12, 0), 
				chambre1 = new Chambre(10,1), chambre2 = new Chambre(9,1),
				salon = new Salon(15,0),
				salleDeBain = new SalleDeBain(8,1),
				wc = new WC(3,1);
		
		/** Ajout des pièces à la maison : */
		m.ajouterPiece(cuisine);
		m.ajouterPiece(salon);
		m.ajouterPiece(chambre1);
		m.ajouterPiece(chambre2);
		m.ajouterPiece(salleDeBain);
		m.ajouterPiece(wc);
		
		/** Test des méthodes de calcul de supérficies : */
		
		System.out.println("La supérficie totale du RDC est : " + m.superficieTotale(0)); /** Résultat attendu : 27m2 */
		System.out.println("La supérficie totale du 1er étage est : "+m.superficieTotale(1)); /** Résultat attendu : 30m2 */
		
		System.out.println("La supérficie totale de la maison est : " + m.superficieTotale()); /** Résultat attendu : 57m2 */
		
		

	}

}
