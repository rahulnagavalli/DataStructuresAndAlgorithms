package arrays;
// Given an Array and an integer k. Find sub array having the elements whose sum totals k.
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] finalArr = findSum(new int[] {1,2,3,4,7}, 6);
		int[] finalArr = findSumTwoPointer1(new int[] {1,2,3,4,7}, 6);
		for (int i = 0; i< finalArr.length; i++) {
			System.out.println(finalArr[i]);
		}

	}
	
	// Time complexity = O(n^2)
	public static int[] findSum(int[] arr, int k) {
		int[] newArr = new int[2];
		for (int i = 0; i< arr.length; i++) {
			for (int j = i+1; j< arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					newArr[0] = arr[i];
					newArr[1] = arr[j];
				}
			}
		}
		return newArr;
	}
	
	// given the elements are sorted in increasing order.
	public static int[] findSumTwoPointer1(int[] arr, int k) {
		int l = 0;
		int r = arr.length - 1;
		while (r > 0 && l < arr.length) {
			if (arr[l] + arr[r] == k) {
				return new int[] {arr[l], arr[r]};
			} else if (arr[l] + arr[r] > k) {
				r--;
			} else if (arr[l] + arr[r] < k) {
				l++;
			}
		}
		return null;
	}

}
