package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		Personne pers1 = new Personne();
		
		pers1.nom = "Mohamed";
		pers1.Prenom = "Amine";
		
		pers1.adr = new AdressePostale();
		
		pers1.adr.numRue = 20;
		pers1.adr.libelleRue = "Fontaine du bac";
		pers1.adr.codePostal = 63000;
		pers1.adr.ville = "Clermont";
		
		Personne pers2 = new Personne();
		
		pers2.nom = "OUALI";
		pers2.Prenom = "othmane";
		
		pers2.adr = new AdressePostale();
		
		pers2.adr.numRue = 20;
		pers2.adr.libelleRue = "Fontaine du bac";
		pers2.adr.codePostal = 63000;
		pers2.adr.ville = "Clermont";

	}

}
