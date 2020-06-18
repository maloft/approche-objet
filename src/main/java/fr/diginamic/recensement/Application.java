package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
			
			//On vérifie si le nombre de ville correspond au nombre de lignes
			//System.out.println("Nombre de lignes :" + lignes.size());
			System.out.println("Nombre de ville :" + listeVilles.size()); 
			
			
				
			} catch (IOException e) {
			System.out.println(e.getMessage());
			}
		

	}

}
