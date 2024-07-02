
public class BinarySearch {

	public static void main(String[] args) {
		// Case 1: Numbers in the array are in sorted in Ascending order.
		int[] arr = new int[] {1,3,6,8,90,980,9808};
		int index = findNumber(arr, 90);
		System.out.println("Value of index is=" + index);

	}
	
	public static int findNumber(int[] arr, int k) {
		int l = 0;
		int r = arr.length -1;
		while (l <= r) {
			int mid = (l+r)/2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				l = mid+1;
			} else if (arr[mid] > k) {
				r = mid-1;
			}
		}
		return -1;
	}

}

// Time Complexity is O(log n)
