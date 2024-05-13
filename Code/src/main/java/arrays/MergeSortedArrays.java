package arrays;
public class MergeSortedArrays {

	public static void main (String[] args) {
		int[] arr1 = {1,4,5,8,20};
		int[] arr2 = {6,9,21,34};
		
		int[] sortedArray = sortArrays(arr1, arr2);
		
		for (int i=0; i< sortedArray.length; i++) {
			System.out.println(sortedArray[i] + " ");
		}
	}
	
	public static int[] sortArrays(int[] arr1, int[] arr2) {
		int i=0, j=0, k=0;
		int l1 = arr1.length;
		int l2 = arr2.length;
		int[] sortedArray = new int[l1 + l2];
		while (i<l1 && j<l2) {
			if (arr1[i] < arr2[j])
				sortedArray[k++] = arr1[i++];
			else if (arr1[i] > arr2[j])
				sortedArray[k++] = arr2[j++];
		}
		
		// Store remaining elements of first array 
	    while (i < l1) 
	    	sortedArray[k++] = arr1[i++]; 

	    // Store remaining elements of second array 
	    while (j < l2) 
	    	sortedArray[k++] = arr2[j++]; 
		return sortedArray;
	}
}
// Starting off from the index 0, individually compare the elements at corresponding indexes of both arrays.
// Place the element with smaller value in the resultant array and increment the index of the array where you find the smaller value.
