package fr.diginamic.banque.entites;

public abstract class Operation {
	
	protected String date;
	protected double montant;
	
	public Operation() {}
	
	public Operation(String date, double montant) 
	{
		this.date = date;
		this.montant = montant;
	}
	
	public String getDate()
	{
		return this.date;
	}
	
	public double getMontant()
	{
		return this.montant;
	}
	
	public abstract String afficherType();
	

}
