package lesson28.classwork.example01;


import lesson27.classwork.example01.StringUtils;
import lesson27.classwork.example01.StringUtilsImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.*; // wildcard import

public class StringUtilsTest {
    private static StringUtils utils;

    @BeforeAll
    public static void init() {
        utils = new StringUtilsImpl();
    }

    @Test
    public void isPalindromeReturnsTrueForPalindromes() {
        assertTrue(utils.isPalindrome("12:21"));
        assertTrue(utils.isPalindrome("123321"));
        assertTrue(utils.isPalindrome("tenet"));
    }

    @Test
    public void isPalindromeReturnsFalseForNonPalindromes() {
        assertFalse(utils.isPalindrome("123456"));
        assertFalse(utils.isPalindrome("Hello"));
        assertFalse(utils.isPalindrome("How are you"));
    }

    @Test
    public void isPalindromeReturnsTrueFroSingleChar() {
        assertTrue(utils.isPalindrome("1"));
    }

    @Test
    public void isPalindromeReturnsTrueForEmptyString() {
        assertTrue(utils.isPalindrome(""));
    }

    @Test
    public void isPangramReturnsTrueForPangrams() {
        assertTrue(utils.isPangram("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    public void isPangramReturnsFalseForNonPangrams() {
        assertFalse(utils.isPangram("Hello world!"));
    }

    @Test
    public void isPangramReturnsFalseForEmptyString() {
        assertFalse(utils.isPangram(""));
    }
    /*
    Считает сколько раз символ letter появляется в строке text и возвращает это число.
    Возвращает 0 если переданная строка равна null, пуста, либо этого символа нет в строке.
    int countOccurencies(String text, char letter);
     */
    @Test
    public void countOccurenciesCountsLetters() {
        assertEquals(3, utils.countOccurencies("Hello world!", 'l'));
        assertEquals(1, utils.countOccurencies("1234548", '2'));
    }

    @Test
    public void countOccurenciesReturnsZeroWhenCharNotPresent() {
        assertEquals(0, utils.countOccurencies("1234548", 'a'));
    }

    @Test
    public void countOccurenciesReturnsZeroForEmptyString() {
        assertEquals(0, utils.countOccurencies("", '1'));
    }

    @Test
    public void countOccurenciesReturnsZeroForNull() {
        assertEquals(0, utils.countOccurencies(null, '1'));
    }

    /*
        Разворачивает строку text. Например,
        строка Hello world должна быть превращена в dlrow olleH
    String reverse(String text);
     */
    @Test
    public void reverseWorks() {
        assertEquals("dlrow olleH", utils.reverse("Hello world"));
    }

    @Test
    public void reverseReturnsSameStringForSingleLetter() {
        String s = "a";
        assertEquals(s, utils.reverse(s));
        //assertSame(s, utils.reverse(s)); // провалит
    }

    @Test
    public void reverseReturnsEmptyStringForEmptyString() {
        assertEquals("", utils.reverse(""));
    }

    @Test
    public void wordReverseWorks() {
        assertEquals("world hello", utils.wordReverse("hello world"));
    }

    @Test
    public void wordReverseReturnsSameStringForSingleWord() {
        String s = "word";
        assertEquals(s, utils.wordReverse(s));
    }

    @Test
    public void wordReverseReturnsEmptyStringForEmptyString() {
        assertEquals("", utils.wordReverse(""));
    }





}
