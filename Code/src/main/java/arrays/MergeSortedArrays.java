package arrays;

import java.util.ArrayList;
import java.util.List;

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
		List<String> newList = new ArrayList<>();
		int newLen = arr1.length + arr2.length;
		int[] sortedArr = new int[newLen];
		int i,j,k = 0;
		for (i = 0; i< arr1.length; i++) {
			for (j = 0; j< arr2.length; j++) {
				if (arr1[i] < arr2[j]) {
					sortedArr[k] = arr1[i];
					k++;
					i++;
				} else if (arr1[i] > arr2[j]) {
					sortedArr[k] = arr2[j];
					k++;
					j++;
				}
			}
		}
		return sortedArr;
	}
}
// Starting off from the index 0, individually compare the elements at corresponding indexes of both arrays.
// Place the element with smaller value in the resultant array and increment the index of the array where you find the smaller value.
