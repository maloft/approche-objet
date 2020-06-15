package fr.diginamic.salaire;

/** Pigiste représente les personnes payées à la journée */
public class Pigiste extends Intervenant {
	
	/** Nombre de jours travaillés. */
	private int nbJour;
	
	/** Le montant journalier de rémunération. */
	private double montant;
	
	/**Redéfinition du constucteur : */
	public Pigiste(String nom, String prenom, int nbJour, double montant)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.nbJour = nbJour;
		this.montant = montant;
		
	}
	
	/** Redéfinition du Getter getSalaire() : */
	public double getSalaire()
	{
		return nbJour * montant;
	}

}
