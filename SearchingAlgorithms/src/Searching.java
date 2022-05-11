public class Searching {

    private int linearSearch(int arr[], int value) {
        int oN = 0;
        if (arr == null) {
            throw new NullPointerException("Null array input");
        }
        if (value < 0) {
            throw new IllegalArgumentException("Entered value is negative");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("[LINEAR_SEARCH] : The element is found with O[" + oN + "]");
                return oN;
            }
            oN++;
        }
        System.out.println("[LINEAR_SEARCH] : The element " + value + " not found.");
        return -1;
    }

    private int binarySearch(int arr[], int value, boolean isSorted) {
        int oN = 0;
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        if (arr == null) {
            throw new NullPointerException("Null array input");
        }
        if (value < 0 || isSorted == false) {
            throw new IllegalArgumentException("Invalid input");
        }
        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
            oN++;
        }
        if (arr[middle] == value) {
            System.out.println("[BINARY_SEARCH] : The element is found with O[" + oN + "]");
            return oN;
        } else {
            System.out.println("[BINARY_SEARCH] : The element " + value + " not found.");
            return -1;
        }
    }

    public void case1024(int value) {
        int arr[] = generateArray(1024);
        int linearON, binaryON;
        System.out.println("\n------------------------CASE 1024------------------------\n");
        linearON = linearSearch(arr, value);
        binaryON = binarySearch(arr, value, true);
        if (linearON == -1 || binaryON == -1) {
            System.out.println("The element " + value + " not found.");
        } else {
            double ratio =  (double) linearON / (double) binaryON;
            System.out.println("BinarySearch is x" + String.format("%.2f", ratio) + " times faster than LinearSearch in sorted array.\n");
        }
    }

    public void case8192(int value) {
        int arr[] = generateArray(8192);
        int linearON, binaryON;
        System.out.println("\n------------------------CASE 8192------------------------\n");
        linearON = linearSearch(arr, value);
        binaryON = binarySearch(arr, value, true);
        if (linearON == -1 || binaryON == -1) {
            System.out.println("The element " + value + " not found.");
        } else {
            double ratio =  (double) linearON / (double) binaryON;
            System.out.println("BinarySearch is x" + String.format("%.2f", ratio) + " times faster than LinearSearch in sorted array.\n");
        }
    }

    /**
     * This method returns array of sorted integer except for divisor of 5
     *
     * @param number The size of array
     * @return The generated array of sorted integer
     */
    public int[] generateArray(int number) {
        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            if (i % 5 == 0) {
                continue;
            }
            arr[i] = i;
        }
        return arr;
    }

}