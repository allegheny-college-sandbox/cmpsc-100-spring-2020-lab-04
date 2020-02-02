package labfour;

/** Divides G. Wiz's lottery winnings with their friends.
 *
 * @author Solution Repository
 */

public class HatPurchase {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Initial amounts
    double winnings = 1337.0;
    System.out.println("How G. Wiz spent his lottery money");
    System.out.println();
    System.out.println("Initial amount:\t\t" + winnings);
    
    // Take out taxes
    double taxRate = .09;
    double taxesPaid = winnings * taxRate;
    winnings -= taxesPaid;
    System.out.println("Taxes paid:\t\t-" + taxesPaid);
    
    // Buy some CrocScout cookies
    double cookieCost = 10.00;
    cookieCost *= 5;
    cookieCost += cookieCost * taxRate;
    winnings -= cookieCost;
    System.out.println("CrocScout cookies:\t-" + cookieCost);
    
    // Buys the latest edition of The Clawparazzi
    double magazineCost = 5.00;
    magazineCost += magazineCost * taxRate;
    winnings -= magazineCost;
    System.out.println("Latest Clawparazzi:\t-" + magazineCost);
    
    // Pay Wizard Union dues
    double unionDues = 200;
    double lateFee = .16;
    unionDues += unionDues * lateFee;
    winnings -= unionDues;
    System.out.println("Wizard Union dues:\t-" + unionDues);
    
    // Take out shares owed to friends
    int shares = 4;
    winnings /= shares;
    double friendShare = winnings * (shares - 1);
    System.out.println("Owed to friends:\t-" + friendShare);
    
    // Does G. Wiz have enough to buy his hat?
    double hatCost = 215;
    hatCost += hatCost * taxRate;
    System.out.println("Hat cost:\t\t-" + hatCost);
    boolean canAffordHat = winnings >= hatCost;
    winnings -= hatCost;
    
    // Conclusion to our thrilling tale of financial frenzy
    System.out.println("Can afford a hat:\t" + canAffordHat);
  }
}