package NGlesson40.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    /*
Используйте аннотацию @Test для каждого тестового метода.
Используйте методы утверждений (assertEquals, assertNotEquals, assertTrue, assertFalse, assertNull, assertNotNull)
для проверки правильности работы каждого метода.
Напишите тест для проверки исключения IllegalArgumentException в методах setLogin, setPassword и setEmail.
Напишите тест для проверки метода isValidPassword.
     */

    private final  User user = new User("user1", "password123", "user1@example.com");

    @Test
    void testSetLogin() {

        // Валидный логин
        user.setLogin("newUser");
        assertEquals("newUser", user.getLogin());
        assertNotEquals("user1", user.getLogin());

        // Не валидный логин (Менее 3 символов)
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> user.setLogin("us"));
        assertEquals("Логин должен быть не менее 3 символов!", thrown.getMessage());
    }

    @Test
    void testSetPassword() {

        // Валидный пароль
        user.setPassword("newPassword");
        assertEquals("newPassword", user.getPassword());

        // Не валидный пароль (Менее 8 символов)
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> user.setPassword("pass"));
        assertEquals("Пароль должен быть не менее 8 символов!", thrown.getMessage());
    }

    @Test
    void testSetEmail() {

        // Валидный емайл
        user.setEmail("newemail@example.com");
        assertEquals("newemail@example.com", user.getEmail());

        // Не валидный емейл (без @)
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> user.setEmail("invalidEmail"));
        assertEquals("Email должен содержать '@'!", thrown.getMessage());
    }

    @Test
    void testIsValidPassword() {

        // Валидный пароль
        assertTrue(user.isValidPassword("password123"));

        // Не валидный пароль
        assertFalse(user.isValidPassword("wrongPassword"));
    }

    @Test
    void testConstructor() {

        assertEquals("user1", user.getLogin());
        assertEquals("password123", user.getPassword());
        assertEquals("user1@example.com", user.getEmail());
    }

    @Test
    void testSetters() {

        user.setLogin("newLogin");
        user.setPassword("newPassword123");
        user.setEmail("newemail@example.com");

        assertEquals("newLogin", user.getLogin());
        assertEquals("newPassword123", user.getPassword());
        assertEquals("newemail@example.com", user.getEmail());
    }

    @Test
    void testNullPassword() {

        assertNotNull(user.getPassword());
    }

    @Test
    void testNullEmail() {

        assertNotNull(user.getEmail());
    }
}