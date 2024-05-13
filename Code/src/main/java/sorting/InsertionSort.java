package sorting;

// Program to insert elements in Ascending Order.
// Here, we will do sorting of the elements one element at a time. 
// No new array is required here.  (in-place sorting)
// Here, we treat elements as a sub-array and sort them.
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,29,8,1,90, 2};
		int[] sortedArray = doSorting(arr);
		for (int i = 0; i< sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}
	
	public static int[] doSorting(int[] arr) {
		// swap the elements to the left.
		for (int i = 1; i< arr.length; i++) {
			int j = i;
			while ( j> 0 && arr[j-1] > arr[j]) {
				int key = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = key;
				j = j-1;
			}
		}
		return arr;
	}
	

}
