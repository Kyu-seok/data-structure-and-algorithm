import java.util.Arrays;
import java.util.Collections;

public class BestScore {

    public static void main(String[] args) {
        Integer[] input = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        System.out.println(firstSecond(input));
    }

    static String firstSecond(Integer[] myArray) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > second) {
                if (myArray[i] > first) {
                    second = first;
                    first = myArray[i];
                } else {
                    second = myArray[i];
                }
            }
        }
        return first + " " + second;
    }
}
