public class FactorialIterative {

	public static void main(String args[]) {
		System.out.println(calcFactorial(6));
	}

	public static int calcFactorial(int n) {
		int value = 1;
		for (int i = 1; i <= n; i++) {
			value *= i;
		}
		return value;
	}
}
