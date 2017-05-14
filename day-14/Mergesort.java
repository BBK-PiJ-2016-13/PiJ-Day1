public class Mergesort {

	public ArrayList mergeSort(ArrayList list) {
		ArrayList masterList = new ArrayList(); //an ArrayList of ArrayLists
		masterList[0] = list;
		for (int i = 0; i < masterList.size(); i++) {
			if (masterList[i].size() < 2) {
				return masterList[i];
			} else {

			//an ArrayList of ArrayLists for this - each element has multiple elements to sort
			//each time the list splits we need a location for each sublist in the array
			//

		}
	}

}