package fr.diginamic.maison;

public class Chambre extends Piece {
	
	public Chambre(double superficie, int etage)
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
