package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {
		int result = p1.compareTo(p2);
		return result;
	}
	
	

}
