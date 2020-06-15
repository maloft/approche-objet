package fr.diginamic.salaire;

public class Salarie extends Intervenant {
	
	/** Montant mensuel du salarié : */
	private double salaire;
	
	/**Redéfinition du constucteur : */
	public Salarie(String nom, String prenom, double salaire)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		
	}
	
	/** Redéfinition du Getter getSalaire : */
	public double getSalaire()
	{
		return this.salaire;
	}
	
	/** Redéfinition de getStatut(). */
	public String getStatut()
	{
		return "Salarié";
	}
	

}
