import java.util.Comparator;

public class StartingDateComparator implements Comparator<College>
{

	@Override
	public int compare(College o1, College o2) {
		return o1.getStartingDate().compareTo(o2.getStartingDate());
	}

}
