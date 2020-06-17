package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays o1, Pays o2) {
		int result = (int)(o1.getPibHab() - o2.getPibHab()); 
		return result;
	}

}
