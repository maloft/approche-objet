package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte c = new Compte("FR345000493", 123.44);
		
		CompteTaux ct = new CompteTaux("FR45303030", 12345.33, 23);
		
		/** On crée un tableau qui contient les 2 instances précédantes.*/
		Compte[] tabCompte = {c,ct};
		
		/** On affiche les informations des 2 comptes */
		for (int i = 0 ; i < 2 ; i++ )
		{
			System.out.println(tabCompte[i]);
		}
		

	}

}
