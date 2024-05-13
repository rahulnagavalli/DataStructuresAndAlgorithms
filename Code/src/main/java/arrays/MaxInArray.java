package arrays;
public class MaxInArray {

	public static void main(String[] args) {
		int[] arr = {2,3,128,7,1,10};
		int max = maxElement(arr);
		System.out.println("Element with max value is: " +  max);
		int maxIndex = maxElementIndexWithoutConstants(arr);
		System.out.println("Index of element with max value: " + maxIndex);
	}
	
	public static int maxElement(int[] arr) {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	public static int maxElementWithoutConstants(int[] arr) {
		int max = arr[0];
		for (int i: arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
	
	public static int maxElementIndexWithoutConstants(int[] arr) {
		int max = arr[0];
		int index = 0;
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}


}
