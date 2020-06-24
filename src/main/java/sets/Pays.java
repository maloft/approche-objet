package sets;

public class Pays implements Comparable<Pays> {
	
	private String nom;
	private int nbHab;
	private double pibHab;
	private Continent continent;
	
	public Pays() {}
	
	public Pays(String nom, int nbHab, double pibHab, Continent continent) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
		this.continent = continent;
	}
	
	public Pays(String nom, int nbHab, double pibHab) {
		this.nom = nom;
		this.nbHab = nbHab;
		this.pibHab = pibHab;
	}
	
	
	/** Getters : */
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
	
	public Continent getContinent()
	{
		return this.continent;
	}
	
	
	/** Setters : */
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public void setNbHab(int nbHab)
	{
		this.nbHab = nbHab;
	}
	
	public void setPibHab(int pibHab)
	{
		this.pibHab = pibHab;
	}
 
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	@Override
	public int compareTo(Pays p) {
		int result = this.nbHab - p.getNbHab();
		return result;
	}
	
	@Override
	public String toString()
	{
		return this.nom + " , " + this.nbHab+" , "+this.pibHab + " , " + this.continent +"\n";
	}
	
	
	
	public void afficherPays()
	{
		System.out.println("Nom : " + this.nom);
		System.out.println("Nombre habitants : " + this.nbHab);
		System.out.println("PIB/Habitant : " + this.pibHab);
	}

	

}
