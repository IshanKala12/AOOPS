package week3;

public class UserAuthentication {
    private static UserAuthentication instance;
    private String loggedInUser;

    private UserAuthentication() {
        this.loggedInUser = null;
    }

    public static UserAuthentication getInstance() {
        if (instance == null) {
            instance = new UserAuthentication();
        }
        return instance;
    }

    public void login(String username, String password) {
        
        this.loggedInUser = username;
        System.out.println("User " + username + " logged in successfully.");
    }

    public void logout() {
        System.out.println("User " + loggedInUser + " logged out.");
        this.loggedInUser = null;
    }

    public String getLoggedInUser() {
        return loggedInUser;
    }
}
