import java.util.Arrays;

class Main {

	public static void main(String[] args) {
		TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);
		sda.insertValueInTheArray(0, 0, 10);
		sda.insertValueInTheArray(0, 1, 20);
		sda.insertValueInTheArray(1, 0, 30);
		sda.insertValueInTheArray(2, 0, 40);
		// sda.accessCell(0, 1);
		// sda.traverse2DArray();
		// sda.searchingValue(20);

		System.out.println(Arrays.deepToString(sda.arr));
		sda.deleteValueFromArray(0, 0);
		System.out.println(Arrays.deepToString(sda.arr));
	}
}
