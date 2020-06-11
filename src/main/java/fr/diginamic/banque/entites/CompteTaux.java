package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private int tauxRem;
	
	
	public CompteTaux(String numCompte, double solde, int tauxRem) 
	{
		this.numCompte = numCompte;
		this.solde = solde;
		this.tauxRem = tauxRem;
	}
	
	
	public String toString()
	{
		return super.toString() + "\n" + "Le taux de rémunération est de : " + String.valueOf(this.tauxRem);	
	}

}
