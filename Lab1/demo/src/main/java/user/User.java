
package user;

public class User {
    private int id;
    private String username;
    private String passwordHash;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.passwordHash = hash(password);
    }

    private String hash(String password) {
        return Integer.toHexString(password.hashCode());
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public String getPasswordHash() {
        return passwordHash;
    }

}
