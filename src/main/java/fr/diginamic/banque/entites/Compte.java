package fr.diginamic.banque.entites;

public class Compte {
	
	protected String numCompte;
	protected double solde;
	
	public Compte() {}
	
	public Compte(String numCompte, double solde)
	{
		this.numCompte = numCompte;
		this.solde = solde;
	}
	
	public String getNumCompte()
	{
		return numCompte;
	}
	
	public String toString() 
	{
		return "Le numéro de compte : " + this.getNumCompte() + "\n" + "Le solde : " + String.valueOf(this.solde);
	}

}
