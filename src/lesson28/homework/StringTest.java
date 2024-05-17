package lesson28.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    @Test
    public void testLength() {
        String str = "Hello, World!";
        assertEquals(13, str.length());
    }

    @Test
    public void testCharAt() {
        String str = "Hello, World!";
        assertEquals('H', str.charAt(0));
        assertEquals('!', str.charAt(12));
    }

    @Test
    public void testSubstring() {
        String str = "Hello, World!";
        assertEquals("Hello", str.substring(0, 5));
        assertEquals("World", str.substring(7, 12));
    }

    @Test
    public void testConcat() {
        String str1 = "Hello";
        String str2 = ", World!";
        assertEquals("Hello, World!", str1.concat(str2));
    }

    @Test
    public void testIndexOf() {
        String str = "Hello, World!";
        assertEquals(7, str.indexOf("World"));
        assertEquals(-1, str.indexOf("Java"));
    }

    @Test
    public void testContains() {
        String str = "Hello, World!";
        assertTrue(str.contains("World"));
        assertFalse(str.contains("Java"));
    }

    @Test
    public void testStartsWith() {
        String str = "Hello, World!";
        assertTrue(str.startsWith("Hello"));
        assertFalse(str.startsWith("World"));
    }

    @Test
    public void testEndsWith() {
        String str = "Hello, World!";
        assertTrue(str.endsWith("!"));
        assertFalse(str.endsWith("Hello"));
    }

    @Test
    public void testToUpperCase() {
        String str = "Hello, World!";
        assertEquals("HELLO, WORLD!", str.toUpperCase());
    }

    @Test
    public void testTrim() {
        String str = "  Hello, World!  ";
        assertEquals("Hello, World!", str.trim());
    }

    @Test
    public void testIsEmpty() {
        String str1 = "";
        String str2 = "Hello";
        assertTrue(str1.isEmpty());
        assertFalse(str2.isEmpty());
    }

    @Test
    public void testEquals() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        assertTrue(str1.equals(str2));
        assertFalse(str1.equals(str3));
    }

    @Test
    public void testEqualsIgnoreCase() {
        String str1 = "Hello";
        String str2 = "hello";
        assertTrue(str1.equalsIgnoreCase(str2));
    }

    @Test
    public void testReplace() {
        String str = "Hello, World!";
        assertEquals("Hello, Java!", str.replace("World", "Java"));
    }

    @Test
    public void testReplaceAll() {
        String str = "abc123abc";
        assertEquals("abcabc", str.replaceAll("\\d", ""));
    }

    @Test
    public void testSplit() {
        String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        assertArrayEquals(new String[]{"apple", "banana", "orange"}, fruits);
    }

    @Test
    public void testToLowerCase() {
        String str = "HELLO, WORLD!";
        assertEquals("hello, world!", str.toLowerCase());
    }

    @Test
    public void testJoin() {
        String[] elements = {"apple", "banana", "orange"};
        assertEquals("apple,banana,orange", String.join(",", elements));
    }

    @Test
    public void testValueOf() {
        int number = 42;
        assertEquals("42", String.valueOf(number));
    }

    @Test
    public void testFormat() {
        String template = "Hello, %s!";
        String name = "John";
        assertEquals("Hello, John!", String.format(template, name));
    }
}

