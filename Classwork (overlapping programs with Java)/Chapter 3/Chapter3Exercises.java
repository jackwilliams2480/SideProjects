import java.util.Scanner;
public class Chapter3Exercises{ 
    
    public static void main(){
        System.out.println("Exercise 1: ");
        Exercise1(15);
        Exercise1(5);
        System.out.println("\n");
        
        System.out.println("Exercise 2: ");
        Exercise2(3);
        Exercise2(10);
        System.out.println("\n");
        
        System.out.println("Exercise 2 alternative: Need to Fix");
        Exercise2Alt(3);
        Exercise2Alt(10);
        System.out.println("\n");
        
        System.out.println("Exercise 3: ");
        Exercise3(4,3);
        Exercise3(5,6);
        Exercise3(-2,8);
        System.out.println("\n");
        
        System.out.println("Exercise 3 alternative: Need to fix");
        //Exercise3(4,3);
        //Exercise3(5,6);
        //Exercise3(-2,8);
        System.out.println("\n");
       
        System.out.println("Exercise 4:");
        Exercise4(3,7);
        
        System.out.println("\n");
       
        System.out.println("Exercise 5:");
        Exercise5(4,6);
        
        System.out.println("\n");
        System.out.println("Exercise 6:");
        Exercise6(11,2);
        Exercise6(4,-5);
        
        System.out.println("\n");
        System.out.println("Exercise 7:");
        Exercise7(7,-2,-11);
        Exercise7(-4,5,2);
        
        System.out.println("\n");
        System.out.println("Exercise 8:");
        Exercise8(1,-7,12);
        Exercise8(1,3,2);
        
        System.out.println("\n");
        System.out.println("Exercise 9:");
        System.out.println(Exercise9(3572));
        System.out.println(Exercise9(-947));
        
        System.out.println("\n");
        System.out.println("Exercise 10:");
        System.out.println(Exercise10(2.0));
        
        System.out.println("\n");
        System.out.println("Exercise 11:");
        System.out.println(Exercise11(1,0,4,4));
        System.out.println(Exercise11(10,2,3,15));
        
        System.out.println("\n");
        System.out.println("Exercise 12:");
        System.out.println(Exercise12(6.23,5));
        System.out.println(Exercise12(1.9,-2));
        
        System.out.println("\n");
        System.out.println("Exercise 13:");
        System.out.println(Exercise13(5.50,6));
        System.out.println(Exercise13(4.00,11));
        
        System.out.println("\n");
        System.out.println("Exercise 14:");
        System.out.println(Exercise14(3.0,4.5));
        
        System.out.println("\n");
        System.out.println("Exercise 15: Need to Fix");
        System.out.println(Exercise15(2.0));
        
        System.out.println("\n");
        System.out.println("Exercise 16:");
        System.out.println(Exercise16(8,5.2,7.1));
        
        System.out.println("\n");
        System.out.println("Exercise 17:");
        System.out.println(Exercise17("hello",8));
        System.out.println(Exercise17("congratulations",10));
        
        System.out.println("\n");
        System.out.println("Exercise 18:");
        Exercise18("hey now");
        
        System.out.println("\n");
        System.out.println("Exercise 19:");
        Exercise19("hello there!");
        
        System.out.println("\n");
        System.out.println("Exercise 20:");
        System.out.println("No output because i commented out the Scanner input");
        //Exercise20();
        
        System.out.println("\n");
        System.out.println("Exercise 21:");
        System.out.println("No output because i commented out the Scanner input");
        //Exercise21();
        
        System.out.println("\n");
        System.out.println("Exercise 22:");
        System.out.println("No output because i commented out the Scanner input");
        //Exercise22();
    }

    public static void Exercise1(int n){
        for(int i = 1; i <= n; i++){
            System.out.print("["+i+"]");
        
        }
        System.out.println();
    }
    
    public static void Exercise2(int n){
        for(int i = 0; i <= n;i++){
            System.out.print((int)Math.pow(2,i) + " ");
        
        }
        System.out.println();
    
    }
   
    public static void Exercise2Alt(int n){
        
    }
    
    public static void Exercise3(int n, int k){
        for(int i = 0;i <= k;i++){
            System.out.print((int)Math.pow(n,i)+" ");
        
        }
        System.out.println();
    }
    
    public static void Exercise3Alt(){
        for(int i = 0;i <= 6;i++){
            System.out.print("");
        
        }
        System.out.println();
    
    }
    
    public static void Exercise4(int MIN_NUMBER,int MAX_NUMBER){
        for(int j = (MIN_NUMBER - 1);j <= (MAX_NUMBER - 1);j++){
            for(int k = (j+1);k <= MAX_NUMBER;k++){
                System.out.print(k);
            }
                
            for(int k = MIN_NUMBER;k <= j;k++){
                System.out.print(k);
            }
                System.out.println();
        }
    }
    
    public static void Exercise5(int Width, int Length){
        
        for(int i = 1; i <= Width;i++){

            for(int j = 1; j <= Length; j++){
                
                System.out.print(i + (j * Width) - 4 + " ");

            }
            System.out.println();
        }
    
    }
    
    public static void Exercise6(int a,int b){
        System.out.println(Math.max(Math.abs(a),Math.abs(b)));
    }
    
    public static void Exercise7(int a,int b,int c){
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);
        System.out.println(Math.max(Math.max(a,b),c));
    }
    
    public static void Exercise8(int a,int b,int c){
        double square = Math.sqrt( Math.pow(b,2) - 4 * a * c);
        double k = (-b - square)/2*a;
        double l = (-b + square)/2*a;
        
        System.out.println(a + "x^2 " + b + "x + " + c);
        System.out.println("x = " + k + ";x = " + l);
        System.out.println("");
    }
    
    public static int Exercise9(int lastDigit){
        lastDigit = Math.abs(lastDigit % 10);
        return lastDigit;
    }
    
    public static double Exercise10(double radius){
        double answer = (Math.PI) * Math.pow(radius,2);
        return radius;
    }
    
    public static double Exercise11(double x,double y,double x2,double y2){
        double answer = Math.sqrt( Math.pow((x2 - x),2) + Math.pow((y2 - y),2));
        return answer;
    }
    
    public static double Exercise12(double base,double exp){
        double answer = base * (Math.pow(10,exp));
        return answer;
    }
    
    public static double Exercise13(double salary,double hours){
        if (hours <= 8){
            double answer = salary * hours;
            return answer;
        }else{
            double answer = ((salary * 1.50) * (hours - 8)) + (salary * 8);
            return answer;
        } 
    }
    
    public static double Exercise14(double radius,double height ){
        double answer =( 2 * Math.PI * Math.pow(radius,2) )+ 2 * Math.PI * radius * height;
        return answer;
    }
    
    public static double Exercise15(double radius){
        double answer = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        return answer; 
    }
    
    public static double Exercise16(double a,double b, double c){
        double s = (a + b + c) / 2;
        double answer = Math.sqrt( s * (s - a)*(s - b)*(s - c));
        return answer;
    }
    
    public static String Exercise17(String a,int spaces){
        String s1 = a;
        int length = s1.length();
            for(int i = 1;i <= (spaces-length);i++){
                s1+=" ";
            }
            s1 += ".";
            return s1;
    }

    public static void Exercise18(String input){
        for(int i = 0;i < input.length();i++){
            System.out.println(input.charAt(i));
        }
    }
    
    public static void Exercise19(String input){
        for(int i = input.length();i > 0;i--){
            System.out.print(input.charAt(i-1));
        }
    }
    
    public static void Exercise20(){
        Scanner console = new Scanner(System.in);
        
        System.out.println("On what day of the month were you born?: ");
        String day = console.nextLine();
        System.out.println("What is the name of the month in which you were born?: ");
        String month = console.nextLine();
        System.out.println("During what year were you born?: ");
        String year = console.nextLine();
        System.out.println("You were born on " + month + " " + day + ", " + year + ". You’re mighty old!");
    }
    
    public static void Exercise21(){
        Scanner console = new Scanner(System.in);
        
        System.out.println("Please enter your full name:");
        String fullName = console.nextLine();
        int space = fullName.indexOf(" ");
        System.out.println("Your name in reverse order is ");
        for(int i = space; i <= (fullName.length()-1);i++){
            System.out.print(fullName.charAt(i));
        }
        System.out.print(", ");
        for(int i = 0; i <= space;i++){
            System.out.print(fullName.charAt(i));
        }
    }
    
    public static void Exercise22(){
        Scanner console = new Scanner(System.in);
        System.out.println("University admission program!");
        
        System.out.print("What is your GPA?");
        double GPA = console.nextDouble();
        System.out.println(GPA);
        
        System.out.print("What is your SAT score?");
        double SAT = console.nextDouble();
        System.out.println(SAT);
        
        if(GPA > 1.80 & SAT > 900){
            System.out.println("You were accepted!");
        }else if(SAT < 900){
            System.out.println("You were rejected");
        }else if(GPA < 1.80){
            System.out.println("You were rejected");
        }
    }
    
}