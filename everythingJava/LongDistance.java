import java.util.Scanner;
public class LongDistance{
    public static void main(){
        double total;
        boolean cont=true;
        total=0;
        Scanner console= new Scanner(System.in);
        while(cont){
            double cost =LongDistance.calculateCost();
            total += cost;
            String input = console.next();
            cont=(input.equalsIgnoreCase("y"));
        }       
        System.out.println("****************************************************** \nGrand total: $" + total+"\nThx for playing and have a great day!!!\n******************************************************");
    }    

    public static double calculateCost(){
        String day;
        int hour;
        double minute;
        int talking;
        double total=0;
        double grand;
        int endtime;
        int starttime;
        int minuteday=1440;
        int minuteInday;
        Scanner console= new Scanner(System.in);
        System.out.println("Start day");
        day=console.next();
        System.out.println("Start hour");
        hour=console.nextInt();
        System.out.println("Start minute");
        minute=console.nextDouble();
        System.out.println("Number of minutes talking");
        talking=console.nextInt();

        switch (day) {
            case "u": starttime = 0;
            break;
            case "m":  starttime = minuteday * 1;
            break;
            case "t":  starttime = minuteday * 2;
            break;
            case "w":  starttime = minuteday * 3;
            break;
            case "r":  starttime = minuteday * 4;
            break;
            case "f":  starttime =minuteday * 5;
            break;
            case "a":  starttime = minuteday * 6;
            break;
            default: throw new IllegalArgumentException("Invalid day entered");
        }

        starttime +=(hour * 60) + minute;

        endtime=starttime + talking;

        for(int i=starttime;i<endtime;i++){
            int number = i/ minuteday;
            int dayOftheWeek = number%7;
            minuteInday = i - number* minuteday;
            int hourInDay = minuteday / 60;

            switch(dayOftheWeek) {
                case 0: total += 0.15;
                break;
                case 1: 
                case 2:
                case 3: 
                case 4:
                case 5: 
                if (hour>=8 && hour<=16) {
                    total += 0.40;
                }
                else {
                    total += 0.25;
                }
                break;
                case 6: total += 0.15;
                break;
            }
        }
        return total;
    }
}