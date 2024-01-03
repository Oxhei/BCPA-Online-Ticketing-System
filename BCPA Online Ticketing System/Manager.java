import java.util.ArrayList;

/**
 * A class for the venue manager. 
 * Allows managing details of events. Methods in this class call from other classes.
 *
 * @author Richard and Brunaldo
 * @version 0.2
 */
public class Manager {
    private Purchase buyIt;
    private CancelPurchase cancelP;
    private ManageEvent manage;
    private Promotion promo;
    private ArrayList<ManageEvent> data; // Stores event data
    
    // Variables for internal tracking
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
     */
    public Manager() { 
        buyIt = new Purchase();
        cancelP = new CancelPurchase();
        manage = new ManageEvent(eventName, price, max);
        promo = new Promotion();
        
        data = new ArrayList<ManageEvent>();
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
}
