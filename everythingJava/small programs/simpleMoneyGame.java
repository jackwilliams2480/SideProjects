import java.util.*;

public class Info {
    
    //variable declarations
    public static Scanner console = new Scanner(System.in);
    public static double roll = (Math.random() * 100);
    public static double result = 0.0;
    
        public static void main(String[] args) {
            System.out.println("How much money would you like to bet?");
            double balance = console.nextDouble();
        
            System.out.println();
        
            System.out.println("What multiplyer would you like to bet at?");
            System.out.println("1 = 50%");
            System.out.println("2 = 30%");
            System.out.println("3 = 15%");
            System.out.println("4 = 10%");
            System.out.println("5 = 5%");
        
            //Calculating what the roll would be and setting some variables
            double multiplyer = console.nextDouble();
        
        
            //Determines what the result of the program would be
            System.out.println("Would you like to roll over or under?");
            System.out.println("Note that 0 = under and 1 = roll");
            int ovOrund = console.nextInt();
        
        
            System.out.println();
            System.out.println("Calculating . . .");
            System.out.println();
        
            //If the user chooses to roll under
            if(ovOrund == 0) {
                
                if(multiplyer == 1) {
                    result = balance * 2;
                    System.out.println("Your roll was " + roll);
                    if(roll <= 50) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled over and lost");
                    }
                
                }else if(multiplyer == 2) {
                    result = balance * 3;
                    System.out.println("Your roll was " + roll);
                    if(roll <= 30) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled over and lost");
                    }
                
                }else if(multiplyer == 3) {
                    result = balance * 6;
                    System.out.println("Your roll was " + roll);
                    if(roll <= 15) {
                        System.out.println("You just made $" + result);
                   }else {
                       System.out.println("Sorry you rolled over and lost");
                   }
                
                }else if(multiplyer == 4) {
                    result = balance * 10;
                    System.out.println("Your roll was " + roll);
                    if(roll <= 10) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled over and lost");
                    }
                
                }else if(multiplyer == 5) {
                    result = balance * 20;
                    System.out.println("Your roll was " + roll);
                    if(roll <= 5) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled over and lost");
                    }
                }
            }
        
            //If the user chooses to roll over
            else if(ovOrund == 1){
    
                if(multiplyer == 1) {
                    result = balance * 2;
                    System.out.println("Your roll was " + roll);
                    if(roll >= 50) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled under and lost");
                    }
            
                }else if(multiplyer == 2) {
                    result = balance * 3;
                    System.out.println("Your roll was " + roll);
                    if(roll >= 60) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled under and lost");
                    }
            
                }else if(multiplyer == 3) {
                    result = balance * 6;
                    System.out.println("Your roll was " + roll);
                    if(roll >= 85) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled under and lost");
                    }
            
                }else if(multiplyer == 4) {
                    result = balance * 10;
                    System.out.println("Your roll was " + roll);
                    if(roll >= 90) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled under and lost");
                    }
            
                }else if(multiplyer == 5) {
                    result = balance * 20;
                    System.out.println("Your roll was " + roll);
                    if(roll >= 95) {
                        System.out.println("You just made $" + result);
                    }else {
                        System.out.println("Sorry you rolled under and lost");
                    }
                }
            }
    }
}
