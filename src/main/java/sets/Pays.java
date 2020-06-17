package sets;

public class Pays implements Comparable<Pays> {
	
	private String nom;
	private int nbHab;
	private double pibHab;
	
	public Pays() {}
	
	public Pays(String nom, int nbHab, double pibHab) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}
	
	public int getNbHab() 
	{
		return this.nbHab;
	}
	
	
	public String getNom()
	{
		return this.nom;
	}
	
	public double getPibHab()
	{
		return this.pibHab;
	}
	
	public void afficherPays()
	{
		System.out.println("Nom : " + this.nom);
		System.out.println("Nombre habitants : " + this.nbHab);
		System.out.println("PIB/Habitant : " + this.pibHab);
	}
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}

	@Override
	public int compareTo(Pays p) {
		int result = this.nbHab - p.getNbHab();
		return result;
	}


	

}
