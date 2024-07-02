
public class RotatedBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {6,7,8,1,2,3};
		System.out.println("Element found at index=" + findMid(arr, 3));
	}
	
	public static int findMid(int[] arr, int k) {
		int l = 0; 
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l+r)/2;
			if (arr[mid] == k) {
				return mid;
			}
			// if left side is sorted.
			if (arr[l] <= arr[mid]) {
				if (arr[l] <= k && k <= arr[mid]) {
					// k exists in left side.
					r = mid - 1;
				} else {
					// k doesn't exist in left side.
					l = mid +1 ;
				}
			} else { // if right part is sorted.
				if (arr[mid] <= k && k <= arr[r]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
		}
		return 0;
	}

}

// time complexity = O(log n)
// Space complexity = O(1) (As we did not use any new data structures)
