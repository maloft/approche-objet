package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		AdressePostale adr1 = new AdressePostale();
		
		adr1.numRue = 64;
		adr1.libelleRue = "De la paix";
		adr1.codePostal = 21000;
		adr1.ville = "Dijon";
		
		AdressePostale adr2 = new AdressePostale();
		
		adr2.numRue = 20;
		adr2.libelleRue = "Thiers";
		adr2.codePostal = 21000;
		adr2.ville = "Dijon";
		

	}

}
