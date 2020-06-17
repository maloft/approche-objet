package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		
		
		Set<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		//Affichage des éléments de set :
		System.out.println("Notre set : " +set);
		
		//Recherche du plus grand élément : 
		Iterator<Double> iterator = set.iterator();
		double max = Double.MIN_VALUE;
		
		while (iterator.hasNext()) 
		{

			double d = iterator.next();
			if (d > max)
			{
				max = d;
			}

		}
		
		System.out.println("Le plus grand élément est : " + max);
		
		//Suppression du plus petit élément : 
		
		Iterator<Double> it3 = set.iterator();
		double min = Double.MAX_VALUE;
		
		while (it3.hasNext()) 
		{
			double i = it3.next();
			if (i < min)
			{
				min = i;
			}
			
		}
		
		set.remove(Double.valueOf(min));
		System.out.println("La liste sans le min : " + set);

	}

}
