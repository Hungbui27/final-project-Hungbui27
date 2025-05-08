import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testGetEvens() {
        assertEquals(Arrays.asList(2, 4, 6, 8), MyMain.getEvens(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        assertEquals(Arrays.asList(2, 2, 2), MyMain.getEvens(Arrays.asList(1, 1, 2, 2, 1, 2)));
        assertEquals(Collections.emptyList(), MyMain.getEvens(Arrays.asList(1, 3, 5, 7, 9)));
    }

    @Test
    public void testGetFirstSquare() {
        assertEquals(Optional.of(9), MyMain.getFirstSquare(Arrays.asList(8, 9, 10, 11, 4)));
        assertEquals(Optional.empty(), MyMain.getFirstSquare(Arrays.asList(2, 3)));
        assertEquals(Optional.of(4), MyMain.getFirstSquare(Arrays.asList(3, 4, 5, 6, 7, 8, 9)));
    }

    @Test
    public void testContains7() {
        assertFalse(MyMain.contains7(Arrays.asList(8, 9, 10, 11, 4)));
        assertTrue(MyMain.contains7(Arrays.asList(8, 9, 10, 11, 7, 4)));
    }

    @Test
    public void testAllBiggerThan10() {
        assertFalse(MyMain.allBiggerThan10(Arrays.asList(8, 9, 10, 11, 4)));
        assertTrue(MyMain.allBiggerThan10(Arrays.asList(11, 12, 15, 18, 19)));
        assertTrue(MyMain.allBiggerThan10(Collections.emptyList()));
    }

    @Test
    public void testFirstNAreNegative() {
        assertTrue(MyMain.firstNAreNegative(3, Arrays.asList(-8, -9, -10, 11, 4)));
        assertFalse(MyMain.firstNAreNegative(4, Arrays.asList(-8, -9, -10, 11, 4)));
        assertTrue(MyMain.firstNAreNegative(5, Arrays.asList(-8, -9, -10, -11, -4)));
    }

    @Test
    public void testSmallestNAreOdd() {
        assertTrue(MyMain.smallestNAreOdd(3, Arrays.asList(5, 7, 8, 10, 3)));
        assertFalse(MyMain.smallestNAreOdd(4, Arrays.asList(3, 1, 5, 11, 4)));
        assertTrue(MyMain.smallestNAreOdd(5, Arrays.asList(1, 1, 3, 3, 5)));
    }

    @Test
    public void testFirstFiveUniqueDoubled() {
        assertEquals(Arrays.asList(2, 4, 6, 12, 8), MyMain.firstFiveUniqueDoubled(Arrays.asList(1, 1, 2, 3, 2, 6, 1, 4, 10)));
        assertEquals(List.of(6), MyMain.firstFiveUniqueDoubled(Arrays.asList(3, 3, 3, 3, 3, 3, 3, 3, 3, 3)));
    }

    @Test
    public void testWordsThatStartWithVowels() {
        assertEquals(Arrays.asList("onion", "arugula", "olive"), MyMain.wordsThatStartWithVowels(Arrays.asList("pepper", "onion", "lettuce", "arugula", "olive")));
        assertEquals(Collections.singletonList("art"), MyMain.wordsThatStartWithVowels(Arrays.asList("art", "science", "math")));
    }

    @Test
    public void testPalindromesWithoutNumbers() {
        assertEquals(Arrays.asList("a", "racecar", "mom"), MyMain.palindromesWithoutNumbers(Arrays.asList("1", "a", "racecar", "151", "rac3car", "mom")));
        assertEquals(Arrays.asList("amanaplanacanalpanama", ""), MyMain.palindromesWithoutNumbers(Arrays.asList("amanaplanacanalpanama", "palindrome", "")));
    }
}