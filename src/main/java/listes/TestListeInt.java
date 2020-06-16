package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> liste = new ArrayList<>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		
		//*****************Affichage des éléments de la liste ***************************
		
		System.out.println("La liste : " + liste);
		
		System.out.println("La taille de la liste : "+ liste.size()); //Taille de liste
		
		
		//********************Recherche du plus grand élément de liste *******************
		
		Iterator<Integer> it2 = liste.iterator();
		int max = Integer.MIN_VALUE;
		
		while (it2.hasNext()) 
		{
			int i = it2.next();
			if (i > max)
			{
				max = i;
			}
			
		}
		
		System.out.println("Le plus grand élément est : " + max); //Affichage du plus grand élément
		
		//****************** Suppression du plus petit élément *****************************
		
		Iterator<Integer> it3 = liste.iterator();
		int min = Integer.MAX_VALUE;
		
		while (it3.hasNext()) 
		{
			int i = it3.next();
			if (i < min)
			{
				min = i;
			}
			
		}
		
		
		liste.remove(liste.indexOf(min));
		System.out.println("La liste sans le min : " + liste);
		
		//********************* Rendre les éléments négatifs positifs ************************ 
		
		Iterator<Integer> it4 = liste.iterator();
		
		while (it4.hasNext()) 
		{
			int i = it4.next();
			if (i < 0)
			{
				liste.set(liste.indexOf(i), -i);
			}
			
		}
		
		System.out.println("La liste positive : " + liste);
		
		
		
		
		
		
		

	}

}
