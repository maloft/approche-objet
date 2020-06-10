package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale(20, "de la paix", 21000, "dijon" );
		
		Personne pers1 = new Personne("elgnaoui", "mohamed", adr1); //Appel au constructeur avec 3 paramètres
		
		Personne pers2 = new Personne("elgnaoui", "mohamed"); //Appel au constructeur avec 2 paramètres
		
		pers2.nomMaj(); 
		
		AdressePostale nouvAdr1 = new AdressePostale(43, "DRAPEAU", 21000, "dijon" );
		
		pers1.setAdr(nouvAdr1); //Modifier l'adresse de pers1


	}

}
