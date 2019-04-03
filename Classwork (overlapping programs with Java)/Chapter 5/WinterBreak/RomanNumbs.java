import java.util.*;
public class RomanNumbs
{
    public static Scanner s = new Scanner(System.in);
  
    public static void main()
    {
        RomanNumbers(s);
    }
   
    public static void RomanNumbers(Scanner s) {
        int year = 0;
        while(year!=-1){
            System.out.println("What is the year: ");
            year = s.nextInt();
        if(year == -1){
            break;
        }else if (year > 3000 || year < 1000) {
            System.out.println("Please enter valid year: 1000<=year<=3000");
        }else {
        String rn = "M";

            //first num
            switch (year / 1000) {
            case 1:
                break;
            case 2:
                rn += "M";
                break;
            case 3:
                rn += "MM";
                break;
        }
        //second number 
        switch ((year % 1000) / 100) {
            case 0:
                break;
            case 1:
                rn += "C";
                break;
            case 2:
                rn += "CC";
                break;
            case 3:
                rn += "CCC";
                break;
            case 4:
                rn += "CD";
                break;
            case 5:
                rn += "D";
                break;
            case 6:
                rn += "DC";
                break;
            case 7:
                rn += "DCC";
                break;
            case 8:
                rn += "DCCC";
                break;
            case 9:
                rn += "CM";
                break;
        }
        //third number
        switch ((year % 100) / 10) {
            case 0:
                break;
            case 1:
                rn += "X";
                break;
            case 2:
                rn += "XX";
                break;
            case 3:
                rn += "XXX";
                break;
            case 4:
                rn += "XL";
                break;
            case 5:
                rn += "L";
                break;
            case 6:
                rn += "LX";
                break;
            case 7:
                rn += "LXX";
                break;
            case 8:
                rn += "LXXX";
                break;
            case 9:
                rn += "XC";
                break;
        }
        //fourth number
        switch (year % 10) {
            case 0:
                break;
            case 1:
                rn += "I";
                break;
            case 2:
                rn += "II";
                break;
            case 3:
                rn += "III";
                break;
            case 4:
                rn += "IV";
                break;
            case 5:
                rn += "V";
                break;
            case 6:
                rn += "VI";
                break;
            case 7:
                rn += "VII";
                break;
            case 8:
                rn += "VIII";
                break;
            case 9:
                rn += "IX";
                break;
        }
            System.out.println("In Roman years: " + rn);
        }
        }
        System.out.println("Thank you for playing with the Romans!!! \nGood Bye!");
    }
}
