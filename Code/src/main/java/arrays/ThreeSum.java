package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an Integer Array nums, return all the triplets [ nums[i], nums[j], nums[k] ] such that nums[i] + nums[j] + nums[k] = 0. 
// Order of the triplets doesn't matter.
public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		System.out.println(doThreeSumOp(nums));
			
	}
	
	public static List<List<Integer>> doThreeSumOp(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		// sort the Array in increasing order.
		int[] arr = {-4, -1, -1, 0, 1,2};
		for (int i = 0; i< arr.length - 2; i++) {
			int l = i+1;
			int r = arr.length - 1;
			while (l <=r) {
				if (arr[i] + arr[l] + arr[r] ==0) {
					list.add(Arrays.asList(arr[i], arr[l], arr[r]));
				}
				if (arr[l] + arr[r] < - arr[i]) {
					l = l +1;
				} else if (arr[l] + arr[r] > - arr[i]) {
					r = r-1;
				}
			}
		}
		return null;
	}

}
