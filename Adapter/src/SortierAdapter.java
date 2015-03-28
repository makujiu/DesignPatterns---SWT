import java.util.*;


public class SortierAdapter extends SortiererFremd implements Sortierer {

	@Override
	public int[] sort(int[] zahlen) {
		List<Integer> listToUse = new ArrayList<Integer>();
		for (int zahl : zahlen)
		{
			listToUse.add(zahl);
		}
		List<Integer> sortedList = sortierteZahlen(listToUse);
		int[] newSortedArray = new int[sortedList.size()-1];
		for(int i = 0; i < sortedList.size()-1; i++)
			{
				newSortedArray[i] = sortedList.get(i);
			}
		
		
		return newSortedArray;
	}

	



}
