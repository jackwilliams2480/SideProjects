public class LogicProblems{
    public static void main(){
        System.out.println("Fahrenheit -> Celcius: ");
        System.out.println(Tempa(212.0));
        System.out.println("Celcius -> Fahrenheit: ");
        System.out.println(Tempb(100.0) + "\n");

        System.out.println("Quadratic equations: ");
        quadraticEquasion(1,0,-4);
        quadraticEquasion(1,2,1);
        quadraticEquasion(1,2,3);
        System.out.println();

        System.out.println("Planet conversions: ");
        System.out.println(forceOfGravity(100,2)); //Venus
        System.out.println(forceOfGravity(139,9) + "\n"); //Pluto

        System.out.println("Minute plan for phone: ");
        System.out.println(phone(2));
        System.out.println(phone(4));
        System.out.println(phone(8));
        System.out.println(phone(15)+ "\n");

        System.out.println("Triangle sides: ");
        System.out.println(triangle(3,4,5));
        System.out.println(triangle(3,5,3));
        System.out.println(triangle(3,3,3)+ "\n");

        System.out.println("Add,Subtract,Multiply,Divide fractions");
        asmdFractions(2,3,7,3);
        asmdFractions(4,5,3,7);
        System.out.println();

        System.out.println("Find slope of two given points");
        findSlope(7,8,3,5);
        findSlope(7,5,3,8);
        findSlope(3,5,7,8);
        findSlope(3,5,3,8);
        System.out.println();

        System.out.println("Largest and Smallest");
        largestAndSmallest(5,7,10,2,5);
        System.out.println();

        System.out.println("Average of grades");
        grades(78,66,86,92,77);
        System.out.println();

        System.out.println("Divide larger by smaller");
        divide(7,3);
        System.out.println();

        System.out.println("Sci Notation");
        SciNotation(987654);
        System.out.println();

        System.out.println("digitsEqualK");
        digitsEqualK(13233443,3);
        System.out.println();

        System.out.println("Less than or greater than k");
        lessGreaterThanK(122342536,3);
        System.out.println();

        System.out.println("Even: ");
        even(2234566);
        System.out.println();

        System.out.println("Are all numbers even?");
        evenAll(224642);
        evenAll(221464);
        System.out.println();

        System.out.println("Is this number a palindrome?");
        palindrome(12321);
        palindrome(123421);
        System.out.println();

        System.out.println("Is this number a palindrome?");
        palindromePrint(123456);
        System.out.println();
        
        System.out.println("binary to decimal");
        //binaryToDecimal(10110);
        //binaryToDecimal(100010);
        System.out.println();
        
        System.out.println("decimal to binary");
        //binaryToDecimal(10110);
        //binaryToDecimal(100010);
        System.out.println();
        
        System.out.println("Day of the week");
        dayOfWeek(5,23,1983);
        System.out.println();

        System.out.println("Is num prime?");
        isPrime(15);
        isPrime(17);
        System.out.println();

        System.out.println("All prime numbers to num");
        printPrime(20);
        System.out.println("\n");

        System.out.println("Abundant, Perfect, or Deficient?");
        PorAorD(6);
        PorAorD(12);
        PorAorD(9);
        System.out.println();

        System.out.println("Start count:");
        starCount(5,3);
        System.out.println();

        System.out.println("rowCount");
        rowCount(5);
    }

    public static double Tempa(double Fahrenheit){
        return (Fahrenheit - 32.0) * (5.0/9);
    }

    public static double Tempb(double Celsius){
        return Celsius * 9.0/5 + 32;
    }

    public static void quadraticEquasion(double a,double b,double c){
        double root1 = ((-b + Math.pow((b*b-4*a*c),0.5))/2*a);
        double root2 = ((-b - Math.pow((b*b-4*a*c),0.5))/2*a);
        double disc = b*b-4*a*c;
        if(disc>0){System.out.println(2 + ", x = " + root1 + " x = " + root2);}
        else if(root1==root2){System.out.println(1 + ", x = " + root1);}
        else{System.out.println(0);}
    }

    public static double forceOfGravity(double weight, int planet){
        switch(planet){
            case 1 : 
            return weight * 0.38;
            case 2 : 
            return weight * 0.78;
            case 3 : 
            return weight;
            case 4 : 
            return weight * 0.39;
            case 5 : 
            return weight * 2.65;
            case 6 : 
            return weight * 1.17;
            case 7 : 
            return weight * 1.05;
            case 8 : 
            return weight * 1.23;
            case 9 : 
            return weight * 0.05;
            default:
            return 0;
        }
    }

    public static double phone(double minutes){
        if(0 <= minutes && minutes <= 3){
            return minutes * 1.25;
        }else if(4 <= minutes && minutes <= 6){
            return (3*1.25)+((minutes-3)*1.50);
        }else if(7 <= minutes && minutes <= 9){
            return (3*1.25)+(3*1.50)+((minutes-6)*1.75);
        }else if(minutes >= 10){
            return (3*1.25)+(3*1.50)+(3*1.75)+((minutes-9)*2.00);
        }else{
            System.out.println("Invalid");
            return 0;
        }
    }

    public static String triangle(double s1,double s2,double s3){
        if(s1 == s2 && s2 == s3 && s1 == s3){
            return "Equilateral";
        }else if(s1 == s2 || s2 == s3 || s1 == s3){
            return "Isosceles";
        }else if(s1 != s2 && s2 != s3 && s1 != s3){
            return "Scalene";
        }else{
            return "Invalid entry";
        }
    }

    public static void asmdFractions(int n1,int d1,int n2,int d2){
        int n1OG = n1;int n2OG=n2;int d1OG=d1;int d2OG=d2;
        if(d1!=d2){
            d1=d1*d2;
            d2=d2OG*d1OG;
            n1=n1OG*d2OG;
            n2=n2OG*d1OG;
            System.out.print("Add: " + (n1+n2) + " / " + d1);
            System.out.print("  Subtract: " + (n1-n2) + " / " + d1);
        }
        System.out.print("  Multiply: " + (n1OG*n2OG) + " / " + (d1OG*d2OG));
        System.out.println("  Divide: " + (n1OG*d2OG) + " / " + (d1OG*n2OG));
    }

    public static void findSlope(int x1,int y1,int x2,int y2){
        if(x1==x2){
            System.out.println("Slope = NOT POSSIBLE / NO SLOPE");
        }else{
            System.out.println("Slope = " + (y2 - y1) +"/"+ (x2 - x1));
        }
    }

    public static void largestAndSmallest(int n1,int n2,int n3,int n4,int n5){
        int max = 0,min = 0;
        System.out.println("Smallest = " + Math.min(Math.min(Math.min(n1,n2),Math.min(n3,n4)),n5));
        System.out.println("Largest = " + Math.max(Math.max(Math.max(n1,n2),Math.max(n3,n4)),n5));
    }

    public static void grades(int g1,int g2,int g3,int g4,int g5){
        int max = 0,min = 0;
        System.out.println("Average = " + ((g1+g2+g3+g4+g5)-(Math.min(Math.min(Math.min(g1,g2),Math.min(g3,g4)),g5))) / 4);
    }

    public static void divide(int n1,int n2){
        System.out.println((Math.max(n1,n2)/Math.min(n1,n2)) + " R " + (Math.max(n1,n2)%Math.min(n1,n2)));
    }

    public static void SciNotation(double num){
        int length = (int) (Math.log10(num) + 1);
        System.out.println((num)/(Math.pow(10,(length-1))) + "x 10^" + (length-1));
    }

    public static void digitsEqualK(int num,int k){
        int numOfK = 0;    
        while(num != 0){
            if(num % 10 == k)numOfK++;
            num=num/10;
        }
        System.out.println(k + " appears " + numOfK + " times");
    }

    public static void lessGreaterThanK(int num,int k){
        int numOfKGreater = 0;int numOfKLess = 0;    
        while(num != 0){
            if(num % 10 > k)numOfKGreater++;
            if(num % 10 < k)numOfKLess++;
            num=num/10;
        }
        System.out.println(numOfKLess + " < numbers < k " + numOfKGreater +" numbers > k");
    }

    public static void even(int num){
        int numEven = 0;    
        while(num != 0){
            if((num % 10)/2 == 0)numEven++;
            num=num/10;
        }
        System.out.println("Even digit count = " + numEven);
    }

    public static void evenAll(int num){
        int numEven = 0;    
        while(num != 0){
            if((num % 10)/2 == 0)numEven++;
            num=num/10;
        }
        if(numEven>0){System.out.println("False");}
        else{System.out.println("True");}
    }

    public static void palindrome(int num){
        int palindrome = num;int x = 0;
        while(palindrome != 0){
            int remainder = palindrome % 10;
            x = x * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if(num == x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void palindromePrint(int num){
        int palindrome = num;int x = 0;
        while(palindrome != 0){
            int remainder = palindrome % 10;
            x = x * 10 + remainder;
            palindrome = palindrome / 10;
        }
        System.out.println("reverse number = " + x);
    }
 
    public static void binaryToDecimal(int bin){
        int power = 1;int result = 0;int temp = 0;
        for(int i = 0;i < (int)(Math.log10(bin));i++){
            int firstDigit = Integer.parseInt(Integer.toString(temp+bin).substring(0,i));
            if(temp==temp+bin){
                result+=0;
            }else{
                result += (int)Math.pow(2,i);
            }
            temp = temp+bin;
        }
        System.out.println("Decimal to " + result);
    }
    

    public static void dayOfWeek(int month,int date,int year){ 
        int temp = month;int total = (year%100) / 4;String day = "";
        total += (year%100) + date;
        switch(month){
            case 1:case 10:
            month = 1;break;
            case 2: case 3: case 11:
            month = 4;break;
            case 4: case 7:
            month = 0;break;
            case 9: case 12:
            month = 6;break;
            case 5:
            month = 2;break;
            case 6:
            month = 5;break;
            case 8:
            month = 3;break;
            default:
            month = 0;
            System.out.print("Error");
            break;
        }
        total += month;
        int dayNum = total%7;
        switch (dayNum){
            case 0:
            day = "Saturday";break;
            case 1:
            day = "Sunday";break;
            case 2:
            day = "Monday";break;
            case 3:
            day = "Tuesday";break;
            case 4:
            day = "Wednesday";break;
            case 5:
            day = "Thursday";break;
            case 6:
            day = "Friday";break;
            default:
            day = "ERROR!"; break;

        }
        System.out.println(temp + "/" + date + "/" + year + " was on a " + day);
    }

    public static void isPrime(int num){
        int factor = 0;
        for(int i = 1;i <= num;i++){
            if(num%i == 0 && i != 1 && i != num){
                factor = i;
                break;
            }
        }
        if(factor==0)System.out.println("Yes!");else{System.out.println("No, " + factor + " is a factor");}
    }

    public static void printPrime(int num){
        boolean prime = true;
        for(int i = 1;i <= num;i++){
            for(int j = 2;j < i;j++){
                if(i%j==0){
                    prime = false;
                    break;
                }
            }
            if(prime)System.out.print(i + ",");prime=true;
        }
    }

    public static void PorAorD(int num){
        int factor = 0;
        for(int i = 1;i <= num;i++){
            if(num%i == 0 && i != num){
                factor += i;
            }
        }
        if(factor == num){
            System.out.println("Perfect");
        }else if(factor > num){
            System.out.println("Abundant");
        }else if(factor < num){
            System.out.println("Deficient");
        }else{
            System.out.println("Error");
        }
    }

    public static void starCount(int start,int row){
        String space = "";
        for(int i = 1;i <= row;i++){
            if(i!=1)System.out.print(space);
            for(int j =1;j <= start;j++){
                System.out.print("*");
            }
            System.out.println();space+=" ";
        }
    }

    public static void rowCount(int rowCount){
        String spaces = " ";
        System.out.println("(a)");
        for(int i = 1;i <= rowCount;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("\n(b)");
        int spacesCount = rowCount - 2;
        for(int i = 1;i <= rowCount;i++){
            for(int k = 0; k <= spacesCount;k++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1;j--){
                System.out.print(j);
            }
            System.out.println();
            spacesCount--;
        }
        System.out.println("\n(c)");
        spacesCount = rowCount - 1;
        for(int i = 1;i <= rowCount;i++){
            for(int a = 1;a <= i;a++){
                System.out.print(a);
            }
            for(int k = 0; k <= spacesCount*2;k++){
                System.out.print(" ");
            }
            for(int j = i;j >= 1;j--){
                System.out.print(j);
            }
            System.out.println();
            spacesCount--;
        }
    }
}
 