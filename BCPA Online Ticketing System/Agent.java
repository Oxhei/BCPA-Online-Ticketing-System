/**
 * Class representing an agent in the ticket purchasing system.
 * 
 * @author Richard and Brunaldo
 * @version 0.2
 */
public class Agent {
    private Purchase buyIt;
    public int BuyTic = 0;
    public int Payment = 0;
    public int checkTheBalance;

    /**
     * Constructor for the Agent class.
     * Initializes a new Purchase object.
     */
    public Agent() {
        buyIt = new Purchase();
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
}
