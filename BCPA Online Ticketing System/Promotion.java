/**
 * Class for handling promotions in the ticket purchasing system.
 * 
 * @author Richard and Brunaldo
 * @version 0.2
 */
public class Promotion {
    // Variable to store the discount amount
    public int discount; 

    /**
     * Constructor for the Promotion class.
     * Initializes the discount to zero.
     */
    public Promotion() {
        discount = 0; 
    }
    
    /**
     * Method to set a promotion discount for Saturday evening shows.
     * @param disOne Discount amount to be added
     */
    public void setPromo(int disOne) {
        discount += disOne;   
    }
}

