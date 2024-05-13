package recursion;

public class SumBetween2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = addNumbers(5, 10);
		System.out.println("Sum is " + sum);
	}
	
//	public static int addNumbers(int start, int end) {
//		int sum = 0;
//		if (start < end ) {
//			return end + addNumbers(start, end-1);
//		} else 
//			return end;
//	}
	
	public static int addNumbers(int start, int end) {
		if (end == start)
			return end;
		else
			return end + addNumbers(start, end-1);
	}

}
