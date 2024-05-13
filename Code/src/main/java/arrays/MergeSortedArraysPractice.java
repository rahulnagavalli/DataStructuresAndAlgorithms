package arrays;
public class MergeSortedArraysPractice {
	
	public static void main(String[] args) {
	
		int[] array1 = {1,2,7,8,100};
		int[] array2 = {4,55,623,1000};
		
		int[] sortedArray = mergeSortedArrays(array1, array2);
		
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i] + " ");
		}
	}
	
	public static int[] mergeSortedArrays(int[] a1, int[] a2) {
		int FinalLength = a1.length + a2.length;
		int[] a3 = new int[FinalLength];
		int i=0, j=0, k = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] < a2[j]) {
				a3[k++] = a1[i++];
			} else if (a1[i] > a2[j]) {
				a3[k++] = a2[j++];
			}
		}
		
//		 Store remaining elements of first array 
	    while (i < a1.length) 
	    	a3[k++] = a1[i++]; 
//
//	    // Store remaining elements of second array 
	    while (j < a2.length) 
	    	a3[k++] = a2[j++]; 
		return a3;	
	}

}
