package entites;

public class Personne {
	
	public String nom;
	public String prenom;
	public AdressePostale adr;
	
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
	

}
