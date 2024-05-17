package lesson28.classwork.example01;
import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


public class Test01 {

    @BeforeAll
    public static void beforeMethode(){
        System.out.println("Этот метод будет выполняться 1 раз до всех тестов");
    }

    @BeforeEach void beforeMethode2(){
        System.out.println("Этот метод будет выполняться перед каждом тестом");
    }

    @Test @Disabled // выключает метод из теста
    public void test(){
        assertTrue(2>1);
    }

    @Test
    public void test0(){
        Random random = null;
        assertNull(random);
    }

    @Test @DisplayName("Test for null reference")
    public void testEquals(){

        String s1 = "111";
        String s2 = "2222";

        String res = s1 + s2;
        int expected = 7;
        int actual = res.length();
        assertEquals(expected, actual);

    }
}
