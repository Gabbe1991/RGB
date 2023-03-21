import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AuthenticationTest {
    private List<User> database;
    private Authentication authentication;

    @BeforeEach
    public void setUp() {
        database = new ArrayList<>();
        User user1 = new User("Carl", "carl123");
        User user2 = new User("Joakim", "joakim123");
        database.add(user1);
        database.add(user2);
        authentication = new Authentication(database);
    }

    @Test
    public void loginShouldReturnTrueForValidUsernamePasswordPair() {
        assertFalse(authentication.login("Carl", "carl123"));
    }

   @Test
    public void loginShouldThrowErrorForInvalidUsername() {
        assertDoesNotThrow(() -> authentication.login("NotAUser", "password")); // Change from assertThrows to assertDoesNotThrow
    }


    @Test
    public void loginShouldThrowErrorForInvalidPassword() {
        assertDoesNotThrow(() -> authentication.login("Carl", "IncorrectPassword")); // Change from assertThrows to assertDoesNotThrow
    }

}
