package ddt.algorithms.sort;


public class BubbleSort implements Sort {

	/**
	 * Sorts the array using the bubble sort algorithm
	 */
	@Override
	public void sort(Comparable[] array) {
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i].compareTo(array[j]) > 0){ 
					Comparable aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
	}

}
