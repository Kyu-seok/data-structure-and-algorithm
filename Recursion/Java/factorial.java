public class factorial {

	public static void main(String[] args) {
		System.out.println(calcFactorial(6));
		System.out.println(calcFactorial(5));
		System.out.println(calcFactorial(4));
		System.out.println(calcFactorial(3));
		System.out.println(calcFactorial(2));
		System.out.println(calcFactorial(1));
	}

	public static int calcFactorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * calcFactorial(n-1);
		}
	}

}
