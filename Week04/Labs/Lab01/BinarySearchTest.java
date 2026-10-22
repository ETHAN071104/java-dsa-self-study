import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {
    @Test
    void returnsMinusOneForEmptyInput() {
        assertEquals(-1, BinarySearch.search(new int[]{}, 4));
    }

    @Test
    void findsAValueAtEitherBoundary() {
        int[] values = {2, 4, 6};
        assertEquals(0, BinarySearch.search(values, 2));
        assertEquals(2, BinarySearch.search(values, 6));
    }

    @Test
    void handlesSingleElementArray() {
        assertEquals(0, BinarySearch.search(new int[]{5}, 5));
        assertEquals(-1, BinarySearch.search(new int[]{5}, 2));
    }

    @Test
    void acceptsAnyMatchingDuplicateIndex() {
        int index = BinarySearch.search(new int[]{1, 3, 3, 7}, 3);
        assertTrue(index == 1 || index == 2);
    }

    @Test
    void returnsMinusOneWhenTargetIsAbsent() {
        assertEquals(-1, BinarySearch.search(new int[]{1, 3, 7}, 5));
    }
}
