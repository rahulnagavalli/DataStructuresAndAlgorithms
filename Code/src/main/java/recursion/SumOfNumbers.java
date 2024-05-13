package recursion;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = addNumbers(10);
		System.out.println("Sum is " + sum);
	}
	
//	public static int addNumbers(int n) {
//		if (n > 0) {
//			return n + addNumbers(n-1);
//		} else
//			return 0;
//	}
	
//	public static int addNumbers(int n) {
//		int sum = 0;
//		while (n > 0) {
//			sum = sum + n;
//			n = n -1;
//		}
//		return sum;
//	}
	
	public static int addNumbers(int n) {
		if (n == 0) {
			return 0;
		}else
			return n + addNumbers(n-1);
	}

}
