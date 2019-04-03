import java.util.*;
public class Transporter
{
    public static Scanner s = new Scanner(System.in);
    public static void main(){
        //Start of program
        System.out.print("How much cash do you have for today? $");double myBank = s.nextDouble();
        char again = 'Y';int tripCount = 1;
        while(again == 'Y'){
            //Input
            System.out.println("(1) Atlantic \n(2) Eastern \n(3) Central \n(4) Mountain \n(5) Pacific");
            System.out.print("What is the starting region? (1-5) ");
            int startingRegion = s.nextInt();
            System.out.print("What is the destination region? (1-5) ");
            int destinationRegion = s.nextInt();
            System.out.print("What time do your start? ");
            int startTime = s.nextInt();
            System.out.print("AM or PM? (a/p) ");
            char amOrPm = s.next().toUpperCase().charAt(0);
            //Backend 
            double oldBank = myBank;
            double cost = cost(startingRegion,destinationRegion);
            myBank -= cost;
            
            //Time Calculations
                //if the time goes from am to pm, or pm to am and the time results in a negative return, example 2am => 11pm because it went backwards
            
            //Check exception
            if(myBank<0){
                System.out.println("*** Insufficient funds. Bank = $" + oldBank + " ***");
                System.out.println("*** Transport Denied !!! ***");
            }else{
                //Output
                System.out.println("\nFrom " + region(startingRegion) + " to " + region(destinationRegion) + " starting @ " + startTime + " " + amOrPm + "M");
                int endTime = startTime;
                if(amOrPm == 'P' && startTime < 12)
                    endTime+=12;
                if(amOrPm == 'A' && startTime == 12){
                    endTime = 0;
                }
                endTime += startingRegion-destinationRegion;
                
                if(endTime<0){
                    endTime+=24;
                }
                if(endTime>24){
                    endTime-=24;
                }
                if(endTime == 0 || endTime == 24){
                    endTime = 12; amOrPm = 'A';
                }else if(endTime > 12){
                    endTime-=12;amOrPm = 'P';
                }else if(startTime<12 && amOrPm == 'A' && endTime == 12){
                    amOrPm = 'P';
                }else if(startTime<=12 && amOrPm == 'P' && endTime < 12){
                    amOrPm = 'A';
                }
                    
                    
                System.out.println("you will arrive @ " + endTime + " " + amOrPm + "M");
                System.out.println("Cost = " + cost);
                System.out.println("Trip count = " + tripCount); tripCount++;
                System.out.println("Bank = " + myBank + "\n");
            }
            System.out.print("Do you want to transport another? (y/n) \n");again = s.next().toUpperCase().charAt(0);
        }
        System.out.println("\n\nThank you for Traveling Today!\nHave a great day!!");
        System.out.println();
    }
    
    public static String region(int region){
        switch (region) {
            case 1: return "Atlantic";
            case 2: return "Eastern";
            case 3: return "Central";
            case 4: return "Mountain";
            case 5: return "Pacific";
            default: return "Invalid month";
        }
    }
    
    public static double cost(int start,int end){
        double Fee = 0;
        if(start==1 || end == 1)Fee+=0.75;
        if(start==4 || end == 4 || (start==5 && end <4) || (end==5 && start!=5))Fee+=0.50;
        if(start==end){
            return 0;
        }else if(end>start){
            return (end-start) + Fee;
        }else{
            return (start-end) + Fee;
        }
    }
}