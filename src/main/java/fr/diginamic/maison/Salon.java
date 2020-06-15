package fr.diginamic.maison;

public class Salon extends Piece {
	
	public Salon(double superficie, int etage)
	{
		if (superficie >= 0 && etage >= 0)
		{
			this.superficie = superficie; 
			this.etage = etage;
		}else
		{
			if (superficie < 0 )
			{
				System.out.println("Impossible de créer une pièce à superficie négative");
			}
			if (etage < 0)
			{
				System.out.println("Impossible : étage négatif");;
			}
		}
	}

}
