/**
 * Class to manage events, including setting and retrieving event details.
 *
 * @author Richard and Brunaldo 
 * @version 0.2
 */
public class ManageEvent {
    public String newName;
    public int newMax;
    public int newPrice;

    // Price of a ticket for this event.
    public int price;
    // Maximum number of tickets a user can buy per event.
    public int max;
    // Name of the event.
    public String eventName;

    /**
     * Constructor for ManageEvent class.
     * @param eventName Name of the event
     * @param price Price of a ticket
     * @param max Maximum number of tickets available for purchase
     */
    public ManageEvent(String eventName, int price, int max) {
       this.eventName = eventName;
       this.price = price; 
       this.max = max; 
    }
    
    /**
     * Sets the name of the event.
     * @param newName New name for the event
     */
    public void setName(String newName) {
        eventName = newName; 
    }

    /**
     * Sets the maximum number of tickets available for the event.
     * @param newMax New maximum ticket limit
     */
    public void setMax(int newMax) {
        max = newMax; 
    }
    
    /**
     * Sets the price for the event tickets.
     * @param newPrice New ticket price
     */
    public void setPrice(int newPrice) {
        price = newPrice; 
    }
    
    /**
     * Returns the ticket price.
     * @return Ticket price
     */
    public int getPrice() {
        return price;
    }
    
    /**
     * Returns the maximum number of tickets available for purchase.
     * @return Maximum ticket limit
     */
    public int getMax() {
        return max;
    }
    
    /**
     * Prints the details of the event.
     */
    public void printEventDetails() {
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Event's name: " + eventName);
        System.out.println("Price: £" + price);
        System.out.println("Max per purchase: " + max);
        System.out.println("--------------------");
    }
}
