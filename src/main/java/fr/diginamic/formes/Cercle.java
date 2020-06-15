package fr.diginamic.formes;

public class Cercle extends Forme {
	
	private double rayon;
	
	public Cercle(double rayon)
	{
		this.rayon = rayon;
	}


	public double calculerSurface() {

		return 2*Math.PI*rayon;
	}


	public double calculerPerimetre() {

		return Math.PI*Math.PI*rayon;
	}
	
	public String afficherType() 
	{
		return "cercle";
	}

}
