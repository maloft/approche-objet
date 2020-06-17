package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {
	
	public static void main(String[] args) {
	
	Map<String, Double> map1 = new HashMap<>();
	
	map1.put("Paul", 1750.0);
	map1.put("Hicham", 1825.0);
	map1.put("Yu", 2250.0);
	map1.put("Ingrad", 2015.0);
	map1.put("Chantal", 2418.0);
	
	System.out.println("La taille de la map : " + map1.size());
	
	
	}

}
