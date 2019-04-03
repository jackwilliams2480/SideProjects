import java.util.Scanner;
public class LongDistance{
    public static void main(){
        double total;
        boolean cont=true;
        total=0;
        String input = "";
        Scanner console= new Scanner(System.in);
        while(cont){
            double cost =LongDistance.calculateCost();
            System.out.println("Total cost: $" + Math.round(cost * 1000.0) / 1000.0);
            total += cost;
            System.out.println();
            do{
                System.out.print("Enter another (y/n)? ");
                input = console.next();
                System.out.println();
                cont=(input.equalsIgnoreCase("y"));
                if(!(input.equalsIgnoreCase("y")||input.equalsIgnoreCase("n")))
                    System.out.println("Invalid input");
            }while(!(input.equalsIgnoreCase("y")||input.equalsIgnoreCase("n")));
        }       
        System.out.println("****************************************************** \nGrand total: $"
            + Math.round(total * 1000.0) / 1000.0+"\nThx for playing and have a great day!!!\n******************************************************");
    }    
    public static double calculateCost(){
        String day;
        int hour;
        int minute;
        int talking;
        double total=0;
        int endtime;
        int starttime;
        int minuteday=1440;
        int minuteInday;
        Scanner console= new Scanner(System.in);
        System.out.print("Start day: ");
        day=console.next().toLowerCase();
        System.out.print("Start hour: ");
        hour=console.nextInt();
        System.out.print("Start minute: ");
        minute=console.nextInt();
        System.out.print("Number of minutes talking: ");
        talking=console.nextInt();
        System.out.println();
        switch (day) {
            case "m": starttime = 0;
            break;
            case "t":  starttime = minuteday * 1;
            break;
            case "w":  starttime = minuteday * 2;
            break;
            case "r":  starttime = minuteday * 3;
            break;
            case "f":  starttime = minuteday * 4;
            break;
            case "a":  starttime = minuteday * 5;
            break;
            case "u":  starttime = minuteday * 6;
            break;
            default: throw new IllegalArgumentException("Invalid day entered");
        }
        starttime +=(hour * 60) + minute;
        endtime=starttime + talking;
        for(int i=starttime;i<endtime;i++){
            int dayOftheWeek = i/minuteday%7;
            int hourInDay = (hour + minute/60)%24;
            minute++;
            switch(dayOftheWeek) {
                case 0: 
                case 1: 
                case 2:
                case 3: 
                case 4:
                if (hourInDay>=8 && hourInDay<18) {
                    total += 0.40;
                }
                else {
                    total += 0.25;
                }
                break;
                case 5:
                case 6: total += 0.15;
                break;
            }
        }
        return total;
    }
}
