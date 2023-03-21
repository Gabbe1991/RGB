import java.util.List;

public class Authentication {
    private List<User> database;

    public Authentication(List<User> database) {
        this.database = database;
    }

    public boolean login(String username, String password) {
        User userInDatabase = null;

        for (User user : database) {
            if (user.getUsername().equals(username)) {
                userInDatabase = user;
                break;
            }
        }

        if (userInDatabase == null) {
            throw new IllegalArgumentException("User does not exist");
        }

        if (!userInDatabase.getPassword().equals(password)) {
            throw new IllegalArgumentException("Invalid password");
        }

        return true;
    }
}
