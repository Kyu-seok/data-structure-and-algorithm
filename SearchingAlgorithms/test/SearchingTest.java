import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchingTest {

    static int arrNull[], arr0[], arr1[], arr10[];
    static Searching searching;

    @BeforeAll
    public static void init() {
        searching = new Searching();
        arrNull = null;
        arr0 = new int[0];
        arr1 = searching.generateSortedArrayWithoutMultipleOf5(1);
        arr10 = searching.generateSortedArrayWithoutMultipleOf5(10);
        System.out.println("Running a test...");
    }

    @Test
    public void linearSearchPrimePathCoverage() {
        assertThrows(IllegalArgumentException.class, () -> searching.linearSearch(arrNull, -1));
        assertEquals(-1, searching.linearSearch(arr0, 1));
        assertEquals(1, searching.linearSearch(arr10, 0));
        assertEquals(-1, searching.linearSearch(arr1, 1));
        assertEquals(3, searching.linearSearch(arr10, 2));
    }

    @Test
    public void linearSearchBaseChoiceCoverage() {
        assertEquals(2, searching.linearSearch(arr10, 1));
        assertThrows(NullPointerException.class, () -> searching.linearSearch(arrNull, 1));
        assertEquals(-1, searching.linearSearch(arr0, 1));
        assertThrows(IllegalArgumentException.class, () -> searching.linearSearch(arr10, -1));
        assertEquals(1, searching.linearSearch(arr10, 0));
        assertEquals(-1, searching.linearSearch(arr10, 5));

    }

    @Test
    public void binarySearchPrimePathCoverage() {

    }

    @Test
    public void binarySearchBaseChoiceCoverage() {
        assertEquals(2, searching.binarySearch(arr10, 1, true));
        assertThrows(NullPointerException.class, () -> searching.binarySearch(arrNull, 1, true));
        assertEquals(-1, searching.binarySearch(arr0, 1, true));
        assertThrows(IllegalArgumentException.class, () -> searching.binarySearch(arr10, -1, true));
        assertEquals(3, searching.binarySearch(arr10, 0, true));
        assertEquals(-1, searching.binarySearch(arr10, 5, true));
        assertThrows(IllegalArgumentException.class, () -> searching.binarySearch(arr10, 1, false));
    }

}