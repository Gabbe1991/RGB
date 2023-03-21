import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testEquals() {
        User user1 = new User("Alice", "password1");
        User user2 = new User("Alice", "password1");
        assertEquals(user1, user2);
    }

    @Test
    public void testNotEquals() {
        User user1 = new User("Alice", "password1");
        User user2 = new User("Bob", "password1");
        assertNotEquals(user1, user2);
    }

    @Test
    public void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> new User(null, "password1"));
        assertThrows(IllegalArgumentException.class, () -> new User("", "password1"));
    }

    @Test
    public void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> new User("Alice", null));
        assertThrows(IllegalArgumentException.class, () -> new User("Alice", ""));
    }
}
