package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
	
	/** Une maison est symbolisée par un ensemble de pièce. */
	private ArrayList<Piece> maison = new ArrayList<Piece>();
	

	
	
	/** Méthode permettant d'ajouter une pièce à la maison. */
	public void ajouterPiece(Piece p)
	{
		this.maison.add(p);
	}

	/** Cette méthode permet de retourner la supérfiie totale de la maison. */
	public double superficieTotale()
	{
		double totale = 0;
		for(Piece p : this.maison)
		{
			totale += p.superficie;
		}
		
		return totale;
	}
	
	/** Redéfinition de la méthode pour le cas où on veut la superficie totale d'un étage donné. */
	public double superficieTotale(int etage)
	{
		double totale = 0;
		for(Piece p : this.maison)
		{
			if (p.etage == etage)
			{
				totale += p.superficie;
			}
		}
		
		return totale;
	}
}
