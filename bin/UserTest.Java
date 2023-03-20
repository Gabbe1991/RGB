import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    public void testEquals() {
        User user1 = new User("Alice", "password1");
        User user2 = new User("Alice", "password2");
        assertTrue(false); 
    }
}
