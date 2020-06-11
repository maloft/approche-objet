package fr.diginamic.banque.entites;

public class Debit extends Operation {
	
	public Debit(String date, double montant) {
		//Appel implicite du constructeur de la classe abstraite
		super(date, montant);
	}
	
	public String afficherType()
	{
		return "Debit";
	}

}
