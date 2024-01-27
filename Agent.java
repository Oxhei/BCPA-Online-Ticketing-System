public class Agent {
    private UserProfile userProfile;
    private Purchase buyIt;
    public int BuyTic = 0;
    public int Payment = 0;
    public int checkTheBalance;

    public Agent(String username, String email) {
        this.userProfile = new UserProfile(username, email);
        this.buyIt = new Purchase();
    }

    public void buy(int pBuy) {
        buyIt.buyTicket(pBuy);
        BuyTic = pBuy;
    }

    public void pay(int pPay) {
        buyIt.insertMoney(pPay);
        Payment = pPay;
    }

    public int checkBalance() {
        checkTheBalance = buyIt.balance;
        return checkTheBalance;
    }

    public void printUserProfile() {
        userProfile.printProfileDetails();
    }
}

