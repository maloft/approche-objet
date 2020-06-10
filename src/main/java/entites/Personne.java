package entites;

public class Personne {
	
	private String nom;
	private String prenom;
	private AdressePostale adr;
	
	public Personne(String nom_ , String prenom_ , AdressePostale adr_)
	{
		nom = nom_;
		prenom = prenom_;
		adr = adr_;
		
	}
	
	public Personne(String nom_ , String prenom_)
	{
		nom = nom_;
		prenom = prenom_;
		
	}
	
	public void nomMaj()
	{
		System.out.println( this.prenom );
		System.out.println( this.nom.toUpperCase() );
		
	}
	
	/**Setters : */ 
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	public void setAdr(AdressePostale adr)
	{
		this.adr = adr;
	}
	
	
	/** Getters : */ 
	
	public String getNom()
	{
		return nom;
	}
	
	public String getPrenom()
	{
		return prenom;
	}
	
	public AdressePostale getAdr()
	{
		return adr;
	}
	

}
