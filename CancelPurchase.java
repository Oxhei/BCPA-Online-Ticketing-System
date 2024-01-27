
/**
 * Write a description of class CancelPurchase here.
 * 
 * @author: Richard and Brunaldo
 * @version 0.2
 */
public class CancelPurchase
{
    // call variable from purchase clss. 
    private Purchase cBalance;
    // the amount left in balance. 
    public int left;
    //amount to refund
    public int amountToRefund;

    /**
     * Constructor for objects of class CancelPurchase
     */
    public CancelPurchase()
    {
        cBalance= new Purchase();
    }
    
    /**
     * Refund method. 
     */
    public void cancel(int amountToRefund)
    {
        left= cBalance.balance - amountToRefund;
    }
    
    /**
     * Print details
     */
    public void print()
    {
        System.out.println("");
        System.out.println("------------------------");
        System.out.println(" Amount to refund: " + amountToRefund);
        System.out.println(" Balance: " +left);
        System.out.println("------------------------");
        System.out.println("");
    }
}
