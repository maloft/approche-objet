package entites;

public class AdressePostale {
	
	private int numRue;
	private String libelleRue;
	private int codePostal;
	private String ville;
	
	
	public AdressePostale(int numRue_ , String libelleRue_ , int codePostal_ , String ville_)
	{
		numRue = numRue_;
		libelleRue = libelleRue_;
		codePostal = codePostal_;
		ville = ville_;
		
	}
	
	//Getters : 
	
	public int getNumRue()
	{
		return numRue;
	}
	
	public String getLibelleRue()
	{
		return libelleRue;
	}
	
	public int getCodePostal()
	{
		return codePostal;
	}
	
	public String getVille()
	{
		return ville;
	}
	

}
