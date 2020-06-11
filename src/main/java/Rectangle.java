
public class Rectangle implements ObjetGeometrique  {

	private double largeur;
	private double longueur;
	
	public Rectangle(double largeur, double longueur)
	{
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	public double perimetre() 
	{
		return 2*(largeur + longueur);
	}
	
	public double surface()
	{
		return largeur*longueur;
	}
	
	public String afficherType()
	{
		return "rectangle";
	}
}
