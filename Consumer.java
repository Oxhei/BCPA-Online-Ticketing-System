public class Consumer {
    private UserProfile userProfile;
    private Purchase buyIt;
    private Promotion promo;
    public int BuyTic = 0;
    public int Payment = 0;
    public int checkTheBalance;
    private int age;

    public Consumer(String username, String email, int age) {
        this.userProfile = new UserProfile(username, email);
        this.buyIt = new Purchase();
        this.promo = new Promotion();
        this.age = age;
    }

    public void applyAgeBasedDiscount() {
        if (age >= 65) { // Senior discount
            promo.setPromo(20);
        } else if (age <= 12) { // Children discount
            promo.setPromo(25);
        } else if (age >= 13 && age <= 25) { // Student discount
            promo.setPromo(15);
        }
    }

    // ... existing methods ...

    public void printUserProfile() {
        userProfile.printProfileDetails();
    }

    public void printDiscount() {
        System.out.println("Applied Discount: " + promo.discount + "%");
    }
}
