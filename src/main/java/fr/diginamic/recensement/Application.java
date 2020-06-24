package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class Application {
	



	public static void main(String[] args) {
		
		
		try {
			File file = new File("C:\\\\Users\\\\abdel\\\\OneDrive\\\\Desktop\\\\Formation DTA\\\\TP1 Java Objet\\\\recensement 2016 - recensement 2016.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			ArrayList<Ville> listeVilles = new ArrayList<>();
			
			//On parcours le fichier ligne par ligne pour récupérer les données et créer des objets Ville.
			//On saute la première ligne qui ne contient que les noms des attributs.
			
			for (String ligne: lignes.subList(1, lignes.size())){
				
				/*On découpe chaque ligne en tableaux de chaine de caractère. 
				  Le ";" est le séparateur */
				
				String[] ligneDecoupee = ligne.split(";");
				String codeRegion = ligneDecoupee[0];
				String nomRegion = ligneDecoupee[1];
				String codeDep = ligneDecoupee[2];
				String codeCommune = ligneDecoupee[5];
				String nomCommune = ligneDecoupee[6];
				String population = ligneDecoupee[9];
				
				int populationTotale = Integer.parseInt(population.replace(" ", "").trim());
				
				//On crée un objet Ville à partir des données retenues de chaque ligne.
				listeVilles.add(new Ville(codeRegion, nomRegion, codeDep,
										codeCommune, nomCommune, populationTotale));
				
				}
			///////////////////////////////////// Etape 2 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			
			
			//Recherche de la ville de Montpellier et affichage de ses informations :
			
			Ville villeRecherchee = listeVilles.iterator().next();
			
			for (Ville v : listeVilles)
			{
				if (v.getNomCommune().equals("Montpellier"))
				{
					 villeRecherchee = v;
				}
			}
			//System.out.println(villeRecherchee);
			
			///////////////////////////////////// Etape 3 & 4 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			
			/*Exploitez les données dont vous disposez pour afficher 
			*la population de tout le département de l’Hérault. */
			
			int pop = 0;
			ArrayList<Ville> villesHerault = new ArrayList<Ville>();
			
			for (Ville v : listeVilles)
			{
				if (v.getCodeDep().equals("34"))
				{
					villesHerault.add(v);
					pop += v.getPopulationTotale();
				}
			}
			//System.out.println("La population totale de l'Hérault est : " + pop);
			
			///////////////////////////////////// Etape 5 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			
			//Recherche de la plus petite ville du département : 
			int popMin = Integer.MAX_VALUE;
			Ville villeMin = villesHerault.iterator().next();
			for (Ville v : villesHerault)
			{
				if (v.getPopulationTotale() < popMin)
				{
					popMin = v.getPopulationTotale();
					villeMin = v;
				}
			}
			//System.out.println("La plus petite ville de l'hérault :");
			//System.out.println(villeMin);
			
			
			/////////////////////Etape 6 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			
			//Affichez les 10 plus grandes villes du département de l'hérault : 
			System.out.println("Les 10 plus grandes villes : ");
			
			Collections.sort(villesHerault);
			
			Iterator<Ville> it = villesHerault.iterator();
			
			int compteur = 1;
			
			while (it.hasNext() && compteur < 11)
			{
				
				Ville villeTop10 = it.next();
				System.out.println("En " + compteur + "eme place : \n" + villeTop10);
				compteur++;
				
			}
			
			//Afficher les 10 plus petites villes du département de l'hérault : 
			System.out.println("Les 10 plus petites villes : ");
			
			Collections.sort(villesHerault, Collections.reverseOrder());
			
			Iterator<Ville> it1 = villesHerault.iterator();
			
			int compteur2 = 1;
			
			while (it1.hasNext() && compteur2 < 11)
			{
				
				Ville villeTop10 = it1.next();
				System.out.println("En " + compteur2 + "eme place : \n" + villeTop10);
				compteur2++;
				
			}
			
			
			//////////////////////////// Etape 7 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			
			System.out.println("La population de toute la région Occitanie : ");
			
			int populationTotaleOccitanie = 0;
			
			for (Ville v : listeVilles)
			{
				if (v.getNomRegion().equals("Occitanie"))
				{
					populationTotaleOccitanie += v.getPopulationTotale();
				}
			}
			
			System.out.println("La population de toute la région Occitanie : " + populationTotaleOccitanie);
			
			
			
							
			} catch (IOException e) {
			System.out.println(e.getMessage());
			}
		

	}

}
