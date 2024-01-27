/**
 * Class containing methods for purchasing tickets.
 * 
 * @author Richard and Brunaldo
 * @version 0.2
 */
public class Purchase {
    private ManageEvent manage;
    private Promotion promo;
    public int noTicket = 0; 
    public int balance = 0; 
    public int total = 0;
    public int amount = 0;
    
    public String eventName; 
    public int price; 
    public int max; 
    public int rowNo; 
    public int seatNumber; 
    public String blockS; 
    
    public Purchase() {
        manage = new ManageEvent(eventName, price, max);
        promo = new Promotion();
    }
    
    public void selectSeat(String block, int row, int sNumber) {
        blockS = block; 
        rowNo = row; 
        seatNumber = sNumber; 
        
        System.out.println("Block: " + blockS);
        System.out.println("Row: " + rowNo);
        System.out.println("Seat number: " + seatNumber);
    }
    
    public void buyTicket(int noTicket) {
        for(int i = 0; i < noTicket; i++) {
            selectSeat(blockS, rowNo, seatNumber);
        }
        
        if(noTicket <= manage.max) {
            total = noTicket * manage.price;
            total -= promo.discount;
            
            System.out.println("\n-----------------------------");
            System.out.println("You have bought " + noTicket + " ticket(s).");
            System.out.println("Discount: £" + promo.discount);
            System.out.println("Total cost: " + total);
            System.out.println("-----------------------------\n");
        } else {
            System.out.println("\n-----------------------");
            System.out.println("Maximum limit exceeded: " + manage.max);
            System.out.println("-----------------------\n");
        }
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void insertMoney(int amount) {
        if(amount > 0) {
            balance += amount;
        } else {
            System.out.println("Use a positive amount rather than: " + amount);
        }
    }
    
    public void printTicket() {
        if(balance >= total) {
            System.out.println("\n\nTicket Details:");
            System.out.println("~~~~~~~~~~~~~~~~~");
            System.out.println("Discount: £" + promo.discount);
            System.out.println("Cost in total: " + total + " cents.");
            System.out.println("~~~~~~~~~~~~~~~~~\n");

            total += total - promo.discount;
            balance -= total;
        } else {
            System.out.println("More money required: " + (total - balance) + " cents.");
        }
    }
}
