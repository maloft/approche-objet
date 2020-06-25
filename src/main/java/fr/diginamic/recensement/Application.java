package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
			System.out.println(villeRecherchee);
			
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
			System.out.println("La population totale de l'Hérault est : " + pop);
			
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
			System.out.println("La plus petite ville de l'hérault :");
			System.out.println(villeMin);
			
			
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
			
			int populationTotaleOccitanie = 0;
			
			for (Ville v : listeVilles)
			{
				if (v.getNomRegion().equals("Occitanie"))
				{
					populationTotaleOccitanie += v.getPopulationTotale();
				}
			}
			
			System.out.println("La population de toute la région Occitanie : " + populationTotaleOccitanie);
			
			//////////////////////// Etape 8 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
			System.out.println("Les 10 plus grandes villes de Occitanie : ");
			//Création de la liste des villes de la région Occitanie :
			
			ArrayList<Ville> villesOccitanie = new ArrayList<Ville>();
			
			for (Ville v : listeVilles)
			{
				if (v.getNomRegion().equals("Occitanie"))
				{
					villesOccitanie.add(v);
				}
			}
			
			// Tri de ces villes en fonction de leurs populations
			
			Collections.sort(villesOccitanie);
			
			Iterator<Ville> it3 = villesOccitanie.iterator();
			
			int compteur3 = 1;
			
			while (it3.hasNext() && compteur3 < 11)
			{
				
				Ville villeTop10 = it3.next();
				System.out.println("En " + compteur3 + "eme place : \n" + villeTop10);
				compteur3++;
				
			}
			
			
			/** On regroupe les villes de l'Occitanie en fonction de leurs codeDep 
			* dans une map qui prend en clé le code du département et en valeur la population 
			* totale de ce département */
			
			
			Map<String, Integer> populationParDepartement = new HashMap<>();
			
			for (Ville v : villesOccitanie)
			{
				String key = v.getCodeDep();
				if (populationParDepartement.containsKey(key))
				{
					Integer cpt =populationParDepartement.get(key);
					cpt += v.getPopulationTotale();
					
				}
				else 
				{
					populationParDepartement.put(key, v.getPopulationTotale());
				}
			}
			
			/** On trie la map en fonction de ses valeurs. 
			 * Pour ce :
			 * 1- on crée une liste constituée des éléments de la hashmap
			 * 2- on trie la liste obtenue 
			 * 3- on recopie les éléments triés de la liste dans la hashmap
			 */
			//On crée une ArrayList à partir de la HashMap
			List<Map.Entry<String, Integer> > list = 
					new ArrayList<Map.Entry<String, Integer> >(populationParDepartement.entrySet());
		
			//on trie la liste : 
			Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
	            public int compare(Map.Entry<String, Integer> v1,  
	                               Map.Entry<String, Integer> v2) 
	            { 
	                return (v2.getValue()).compareTo(v1.getValue()); 
	            } 
	        });
			
			//On recopie les éléments triés dans la hashmap :
			
			//LinkedHashMap permet de garder les éléments dans l'ordre d'insertion
			HashMap<String, Integer> hashmapTriee = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> a : list) { 
	        	hashmapTriee.put(a.getKey(), a.getValue()); 
	        } 
	        
	        //Affichage des départements de l'occitanie et leurs population :
	        
	        for (Map.Entry<String, Integer> en : hashmapTriee.entrySet()) { 
	            System.out.println("CodeDep = " + en.getKey() +  
	                          ", Population = " + en.getValue()); 
	        }
	        
	        // Affichage du département le plus peuplé :
	        
	        Map.Entry<String, Integer> entry = hashmapTriee.entrySet().iterator().next();
	        System.out.println("Le département le plus peuplé porte le code : " + entry.getKey());
	        
	        
	        
	        
			
			
			
			
							
			} catch (IOException e) {
			System.out.println(e.getMessage());
			}
		

	}

}