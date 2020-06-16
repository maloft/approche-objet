package listes;

public class Ville {
	

	private String nom;
	private int nbHab;
	
	public Ville() {}
	public Ville(String nom, int nbHab) {
		this.nom = nom;
		this.nbHab = nbHab;
	}
	
	public int getNbHab() 
	{
		return this.nbHab;
	}
	
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void afficherVille()
	{
		System.out.println("Nom : " + this.nom);
		System.out.println("Nombre habitants : " + this.nbHab);
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	

}

