public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean equals(User otherUser) {
        return this.username.equals(otherUser.username) && this.password.equals(otherUser.password);
    }
}
