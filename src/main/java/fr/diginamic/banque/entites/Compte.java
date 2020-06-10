package fr.diginamic.banque.entites;

public class Compte {
	
	private int numCompte;
	private double solde;
	
	public Compte(int numCompte, double solde)
	{
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public int getNumCompte()
	{
		return numCompte;
	}
	
	public String toString() 
	{
		return "Le numéro de compte : " + String.valueOf(this.getNumCompte()) + "\n" + "Le solde : " + String.valueOf(this.solde);
	}

}
