import java.util.*;

class CreateArray {
	public static void main(String[] args) {

		int[] intArray;
		intArray = new int[3];
		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		System.out.println(intArray);

		// All in one step
		String sArray[] = {"a", "b", "c"};
		System.out.println(Arrays.toString(sArray));

	}
}
