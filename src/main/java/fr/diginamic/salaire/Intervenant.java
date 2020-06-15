package fr.diginamic.salaire;

public abstract class Intervenant {
	
	
	/** Nom et prénoms de l'intervenant */
	protected String nom;
	protected String prenom;
	
	
	/** Constructeur par défaut */
	public Intervenant() {} 
	
	/** Cette méthode abstraite est un Getter permettant d'accéder au salaire de l'intervenant. */ 
	public abstract double getSalaire();
	
	/** Cette méthode retourne le statut de l'intervenant (salarié ou pigiste). */
	public abstract String getStatut();
	
	
	/** Cette méthode affiche toutes les données concernant l'intervenant : */
	public void afficherDonnees()
	{
		System.out.println("Les données de l'intervenant : ");
		System.out.println("- Nom : " + this.nom);
		System.out.println("- Prénom : " + this.prenom);
		System.out.println("- Salaire : " + this.getSalaire());
		System.out.println("- Statut : " + this.getStatut());
	}

}
