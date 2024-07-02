package arrays;

public class RemoveEvenIntegers {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int[] newArr = removeEven(arr);
		for (int i= 0; i< newArr.length; i++) {
			System.out.println(newArr[i]);
		}

	}
	
	public static int[] removeEven(int[] arr) {

        
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2!= 0) {
                len++;
            }
        }
        int[] newArray = new int[len];
        for (int i = 0, j=0; i < arr.length && j < len; i++) {
            if (arr[i] %2 !=0) {
                newArray[j] = arr[i];
                j++;
            }
        }
        return newArray;
        

    }

}
