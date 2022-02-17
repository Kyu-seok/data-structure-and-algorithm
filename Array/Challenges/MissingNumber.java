public class MissingNumber {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 6};
        System.out.println(missingNumber(input, 6));
    }

    static int missingNumber(int[] arr, int totalCount) {
        int ideal = 0, sum = 0;
        for (int i = 1; i <= totalCount; i++) {
            ideal += i;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return ideal - sum;
    }
}
