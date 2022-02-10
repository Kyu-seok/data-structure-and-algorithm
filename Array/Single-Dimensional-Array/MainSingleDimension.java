class MainSingleDimension {

	public static void main(String[] args) {

		SingleDimensionArray sda = new SingleDimensionArray(10);
		sda.insert(0, 0);
		sda.insert(1, 10);
		sda.insert(2, 20);
		sda.insert(1, 30);
		sda.insert(12, 120);

		// var firstElement = sda.arr[0];
		// System.out.println(firstElement);
		// var thirdElement = sda.arr[2];
		// System.out.println(thirdElement);

		// sda.searchInArray(40);
		sda.deleteValue(0);
		System.out.println(sda.arr[0]);
	}
}
