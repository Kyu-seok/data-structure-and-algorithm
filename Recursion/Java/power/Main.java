class Main {

	public static void main(String[] args) {
		Main main = new Main();
		var result = main.power(2, 2);
		System.out.println(result);
	}

	public int power(int base, int exp) {
		if (exp < 0) {
			return -1;
		}
		if (exp == 0) {
			return 1;
		}
		if (exp == 1) {
			return base;
		}
		return base * power(base, exp - 1);
	}

}
