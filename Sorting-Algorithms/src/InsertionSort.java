public class InsertionSort {

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {10, 5, 30, 15, 50, 6};
        // before
        printArray(arr);

        insertionSort(arr);

        // after
        printArray(arr);

    }
}
