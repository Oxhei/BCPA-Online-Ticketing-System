public class UserProfile {
    private String username;
    private String email;
    private int balance;

    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
        this.balance = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBalance() {
        return balance;
    }

    public void updateBalance(int amount) {
        this.balance += amount;
    }

    public void printProfileDetails() {
        System.out.println("User Profile:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Balance: " + balance);
    }
}
