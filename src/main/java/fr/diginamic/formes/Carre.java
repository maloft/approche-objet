package fr.diginamic.formes;

public class Carre extends Rectangle {
	
	private double longueur;
	
	public Carre(double longueur)
	{
		this.longueur = longueur;
	}
	
	public double calculerSurface() {
		return longueur*longueur;
	}

	public double calculerPerimetre() {
		return 4 * longueur;
	}
	
	public String afficherType() 
	{
		return "carré";
	}

}
