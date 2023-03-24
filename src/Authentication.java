import java.util.List;
import java.util.Optional;

public class Authentication {
    private List<User> database;

    public Authentication(List<User> database) {
        this.database = database;
    }

    public boolean login(String username, String password) {
        Optional<User> userInDatabase = database.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst();

        if (!userInDatabase.isPresent()) {
            throw new IllegalArgumentException("User does not exist");
        }

        if (!userInDatabase.get().getPassword().equals(password)) {
            throw new IllegalArgumentException("Invalid password");
        }

        return true;
    }
}
