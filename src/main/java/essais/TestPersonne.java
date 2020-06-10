package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr = new AdressePostale(20, "de la paix", 21000, "dijon" );
		
		Personne pers1 = new Personne("mohamed", "amine", adr); //Appel au constructeur avec 3 paramètres
		
		Personne pers2 = new Personne("mohamed", "amine"); //Appel au constructeur avec 2 paramètres


	}

}
