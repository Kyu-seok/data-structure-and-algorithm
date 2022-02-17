import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        MiddleFunction middleFunction = new MiddleFunction();
        int[] input = new int[] {1, 2, 3, 4};
        int[] ans = middleFunction.middle(input);
        System.out.println(Arrays.toString(ans));
    }

    static int[] middle(int[] arr) {
        // TODO
        return Arrays.copyOfRange(arr, 1, arr.length - 1);
    }
}
