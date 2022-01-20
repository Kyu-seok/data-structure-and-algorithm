class Main {

	public static void main(String[] args) {
		Main main = new Main();
		var result = main.sumOfDigits(4);
		System.out.println(result);

	}

	public int sumOfDigits(int n) {
		if (n == 0 || n < 0) {
			return 0;
		}
		return n % 10 + sumOfDigits(n / 10);
	}

}
