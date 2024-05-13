package sorting;

// here we will send first largest element to the right by swapping from first element onwards and continue the process. 
public class BubbleSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,29,8,1,90, 2};
		int[] sortedArray = bubbleSort(arr, arr.length);
		for (int i = 0; i< sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}
	
public static int[] bubbleSort(int [] sort_arr, int len){
        
	// For n-1 elements (where n is index)
        for (int i=0;i<len-1;++i){

        	// we are doing len-i-1 because, for each iteration we will be ignoring the last i'th elements (0 first time, 1 second time, 2 elements third time etc. )
            for(int j=0;j<len-i-1; ++j){

                if(sort_arr[j+1]<sort_arr[j]){

                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;

                }
            }
        }
        return sort_arr;
    }
}
