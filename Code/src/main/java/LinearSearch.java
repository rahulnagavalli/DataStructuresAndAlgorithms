public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,33,4,1,0,8};
		int n = 99;
		System.out.println("Element " + n + " is found in given array: " + linearSearch(arr, n));
	}
	
	public static boolean linearSearch(int[] arr, int n) {
		for (int i = 0; i< arr.length; i++) {
			if (n == arr[i]) {
				return true;
			}
		}
		return false;
	}

}
// Time complexity: O(n) Because we are checking each element exactly once. 
// Here we will search every element starting from 0th index in an array.