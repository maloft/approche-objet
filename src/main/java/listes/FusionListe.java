package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {
	
	
	public static void main(String args[]) {
		
			List<String> liste1 = new ArrayList<String>();
			
			liste1.add("Rouge");
			liste1.add("Vert");
			liste1.add("Orange");
			
			List<String> liste2 = new ArrayList<String>();
			
			liste2.add("Blanc");
			liste2.add("Bleu");
			liste2.add("Orange");
			
			List<String> liste3 = new ArrayList<String>();
			
			Iterator<String> it1 = liste1.iterator();
			
			while (it1.hasNext())
			{
				String s = it1.next();
				liste3.add(s);
			}
			
			Iterator<String> it2 = liste2.iterator();
			
			while (it2.hasNext())
			{
				String s = it2.next();
				liste3.add(s);
			}
			
			System.out.println(liste3);
			
	}
}