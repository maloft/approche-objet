
public class Cercle implements ObjetGeometrique {
	
	private double rayon;
	
	public Cercle(double rayon)
	{
		this.rayon = rayon;
	}
	
	public double perimetre() 
	{
		return 2*Math.PI*rayon;
	}
	
	public double surface()
	{
		return Math.PI*Math.PI*rayon;
	}
	
	public String afficherType() 
	{
		return "cercle";
	}

}
