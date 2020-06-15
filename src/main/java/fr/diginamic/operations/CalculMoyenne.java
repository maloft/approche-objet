package fr.diginamic.operations;

import java.util.ArrayList;

public class CalculMoyenne {
	
	/** Un tableau dynamique de double. */
	private ArrayList<Double> tab = new ArrayList<Double>();
	
	/** Constructeur */
	public CalculMoyenne() {};
	
	/** Getter : */
	
	public ArrayList<Double> getTab()
	{
		return tab;
	}
	
	/** Méthode pour ajouter un élément au tableau. */
	public void ajout(double elm) 
	{
		this.tab.add(elm);
	}
	
	/** Méthode qui calcule la moyenne des éléments du tableau.	 */
	public double calcul()
	{
		double sum = 0.0, moy = 0.0; /** sum contiendra la somme des éléments du tableau. moy contiendra la moyenne */
		
		int taille = this.tab.size();
		
		for (int i = 0; i < taille; i++)
		{
			sum += this.tab.get(i);
		}
		
		moy = sum / taille;
		
		return moy;
	}
	


}
