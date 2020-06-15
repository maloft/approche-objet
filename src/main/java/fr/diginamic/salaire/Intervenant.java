package fr.diginamic.salaire;

public abstract class Intervenant {
	
	
	/** Nom et prénoms de l'intervenant */
	protected String nom;
	protected String prenom;
	
	
	/** Constructeur par défaut */
	public Intervenant() {} 
	/** Cette méthode abstraite est un Getter permettant d'accéder au salaire de l'intervenant. */ 
	public abstract double getSalaire();

}
