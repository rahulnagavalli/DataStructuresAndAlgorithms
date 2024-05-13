package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,29,8,1,90, 2};
		int[] sortedArray = selectionSort(arr);
		for (int i = 0; i< sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}
	
	public static int[] selectionSort(int[] arr) {
//		int leastElement = arr[0];
		for (int i = 0; i< arr.length; i++) {
			int smallestIndex = i;
			for (int j = i+1; j< arr.length; j++) {
				if (arr[smallestIndex] > arr[j])
					smallestIndex = j;
			}
			int temp = arr[smallestIndex];
			arr[smallestIndex] = arr[i];
			arr[i] = temp;
		}
		return arr;
		
	}
	
	

}
