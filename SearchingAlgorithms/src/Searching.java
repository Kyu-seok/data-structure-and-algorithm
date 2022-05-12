public class Searching {

    public int linearSearch(int arr[], int value) {
        int timeComplexity = 1;
        if (arr == null || value < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("[LINEAR_SEARCH] : The element is found with the time complexity of O[" + timeComplexity + "]");
                return timeComplexity;
            }
            timeComplexity++;
        }
        System.out.println("[LINEAR_SEARCH] : The element " + value + " not found.");
        return -1;
    }

    public int binarySearch(int arr[], int value, boolean isSorted) {
        int timeComplexity = 1;
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        if (value < 0 || isSorted == false || arr == null) {
            throw new IllegalArgumentException("Invalid input");
        }
        if (arr.length == 0) {
            return -1;
        }
        while (arr[middle] != value && start <= end) {
            if (value < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
            timeComplexity++;
        }
        if (arr[middle] == value) {
            System.out.println("[BINARY_SEARCH] : The element is found with the time complexity of O[" + timeComplexity + "]");
            return timeComplexity;
        } else {
            System.out.println("[BINARY_SEARCH] : The element " + value + " not found.");
            return -1;
        }
    }

    public void case1024(int value) {
        int arr[] = generateSortedArrayWithoutMultipleOf5(1024);
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
        int arr[] = generateSortedArrayWithoutMultipleOf5(8192);
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
     * This method returns array of sorted integer except for multiple of 5
     *
     * @param size The size of array
     * @return The generated array of sorted integer
     */
    public int[] generateSortedArrayWithoutMultipleOf5(int size) {
        int arr[] = new int[size];
        int num = 0;
        for (int i = 0; i < size; i++) {
            if ((num % 5 == 0) && num != 0) {
                num++;
            }
            arr[i] = num;
            num++;
        }
        return arr;
    }

    public int[] generateSortedArray(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

}