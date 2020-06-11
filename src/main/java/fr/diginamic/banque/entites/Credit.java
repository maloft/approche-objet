package fr.diginamic.banque.entites;

public class Credit extends Operation {
	
	public Credit(String date, double montant) {
		//Appel implicite du constructeur de la classe abstraite
		super(date, montant);
	}
	
	public String afficherType()
	{
		return "Credit";
	}

}
