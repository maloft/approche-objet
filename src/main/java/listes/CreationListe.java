package listes;

import java.util.ArrayList; 


public class CreationListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste = new ArrayList<Integer>();
		
		for (int i = 1; i <= 100; i++)
		{
			liste.add(i); //On stocke tous les entiers de 1 à 100 dans liste
		}
		
		System.out.println("La taille de la liste est : " + liste.size()); //Affiche la taille de liste
		
		
		

	}

}
