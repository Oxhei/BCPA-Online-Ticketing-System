import java.util.ArrayList;

public class Manager {
    private UserProfile userProfile;
    private Purchase buyIt;
    private CancelPurchase cancelP;
    private ManageEvent manage;
    private Promotion promo;
    private ArrayList<ManageEvent> data;
    private int checkTheBalance;
    private int BuyTic = 0;
    private int Payment = 0;
    private int RefundIt = 0;
    private int Max = 0;
    private int Price = 0;
    private String Name;
    private int totalDiscount;
    private int price;
    private int max;
    private String eventName;
    private int disc;

    /**
     * Constructor for Manager class.
     * Initializes related objects and allows method calls from other classes.
     * @param username The username of the manager.
     * @param email The email address of the manager.
     */
    public Manager(String username, String email) {
        this.userProfile = new UserProfile(username, email);
        this.buyIt = new Purchase();
        this.cancelP = new CancelPurchase();
        this.manage = new ManageEvent(eventName, price, max);
        this.promo = new Promotion();
        this.data = new ArrayList<>();
    }

    /**
     * Sets the discount for the event.
     * @param sDis Discount amount
     */
    public void setDiscount(int sDis) {
        promo.setPromo(sDis);
        disc += sDis;
    }

    /**
     * Method to purchase tickets.
     * @param pBuy Number of tickets to buy
     */
    public void buy(int pBuy) {
        buyIt.buyTicket(pBuy);
        BuyTic = pBuy;
    }

    /**
     * Method to pay for the tickets.
     * @param pPay Payment amount
     */
    public void pay(int pPay) {
        buyIt.insertMoney(pPay);
        Payment = pPay;
    }

    /**
     * Checks and returns the balance of payment.
     * @return Balance amount
     */
    public int checkBalance() {
        checkTheBalance = buyIt.balance;
        return checkTheBalance;
    }

    /**
     * Processes the refund.
     * @param cRefund Refund amount
     */
    public void refund(int cRefund) {
        cancelP.cancel(cRefund);
        RefundIt = cRefund;
    }

    /**
     * Sets the event's name.
     * @param eName Event name
     */
    public void editName(String eName) {
        manage.setName(eName);
        Name = eName;
        data.add(new ManageEvent(Name, Price, Max));
    }

    /**
     * Sets the maximum number of tickets available for purchase.
     * @param eMax Maximum ticket limit
     */
    public void editMax(int eMax) {
        manage.setMax(eMax);
        Max = eMax;
        data.add(new ManageEvent(Name, Price, Max));
    }

    /**
     * Sets the price for the event.
     * @param ePrice Event price
     */
    public void editPrice(int ePrice) {
        manage.setPrice(ePrice);
        Price = ePrice;
        data.add(new ManageEvent(Name, Price, Max));
    }

    /**
     * Prints details about the refund.
     */
    public void printRefund() {
        cancelP.print();
    }

    /**
     * Prints ticket/purchase details.
     */
    public void printTicket() {
        buyIt.printTicket();
    }

    /**
     * Prints details about the event.
     */
    public void printEvent() {
        manage.printEventDetails();
    }

    /**
     * Prints the user profile details of the manager.
     */
    public void printUserProfile() {
        userProfile.printProfileDetails();
    }
}
