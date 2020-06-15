package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	private double largeur;
	private double longueur;
	
	public Rectangle() {}
	
	public Rectangle(double largeur, double longueur)
	{
		this.largeur = largeur;
		this.longueur = longueur;
	}

	public double calculerSurface() {
		return largeur*longueur;
	}

	public double calculerPerimetre() {
		return 2*(largeur + longueur);
	}
	
	public String afficherType() 
	{
		return "rectangle";
	}

}
