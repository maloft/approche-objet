package fr.diginamic.entites;


/** Cette classe permet de créer des cercles. */

public class Cercle {
	
	
	/**Cet attribut correspond au rayon du cercle*/
	private double rayon;
	
	
	public Cercle(double rayon)
	{
		this.rayon = rayon;
	}
	
	/** Méthode qui calcule le périmètre du cercle */
	public double perimetre() 
	{
		return 2*Math.PI*rayon;
	}
	
	/** Méthode qui calcule a surface du cercle */
	public double surface()
	{
		return Math.PI*Math.PI*rayon;
	}
	

}