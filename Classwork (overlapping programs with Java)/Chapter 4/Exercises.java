import java.util.Scanner;
public class Exercises{
    //Variables
    public static Scanner console = new Scanner(System.in);
    
    public static void main(){
        System.out.println("Exercise 1: ");
        Exercise1(5);
        
        System.out.println("\n");
        System.out.println("Exercise 2: ");
        Exercise2("hello",3);
        
        System.out.println("\n");
        System.out.println("Exercise 3: ");
        //Exercise3();
        
        System.out.println("\n");
        System.out.println("Exercise 4: ");
        Exercise4(2);
        
        System.out.println("\n");
        System.out.println("Exercise 5: ");
        Exercise5(3,4);
        
        System.out.println("\n");
        System.out.println("Exercise 6: ");
        Exercise6(3,7);
        Exercise6(19,11);
        Exercise6(5,5);
        
        System.out.println("\n");
        System.out.println("Exercise 7: ");
        //Exercise7(5);
        //Exercise7(6);
        
        System.out.println("\n");
        System.out.println("Exercise 8: ");
        //Exercise8();
        
        System.out.println("\n");
        System.out.println("Exercise 9: ");
        //Exercise9();
        
        System.out.println("\n");
        System.out.println("Exercise 10: ");
        //Exercise10();
        
        System.out.println("\n");
        System.out.println("Exercise 11: ");
        //Exercise11();
        
        System.out.println("\n");
        System.out.println("Exercise 12: ");
        Exercise12(5,7,7);
        Exercise12(6,6,6);
        Exercise12(5,7,8);
        Exercise12(2,18,2);
        
        System.out.println("\n");
        System.out.println("Exercise 13: ");
        System.out.println(Exercise13(5,6));
        
        System.out.println("\n");
        System.out.println("Exercise 14: ");
        Exercise14(-4.0,3);
        Exercise14(4.0,-2);
        
        System.out.println("\n");
        System.out.println("Exercise 15: ");
        Exercise15(63);
        Exercise15(94);
        
        System.out.println("\n");
        System.out.println("Exercise 16: ");
        Exercise16("abba");
        
        System.out.println("\n");
        System.out.println("Exercise 17: ");
        Exercise17("example");
        Exercise17("hello there");
        
        System.out.println("\n");
        System.out.println("Exercise 18: ");
        System.out.print(Exercise18("hello"));
        System.out.println();
        System.out.print(Exercise18("how are you?"));
        System.out.println();
        System.out.print(Exercise18(" this  string has wide spaces "));
        System.out.println();
        System.out.print(Exercise18(" "));
        System.out.println();
        
        System.out.println("\n");
        System.out.println("Exercise 19: ");
        Exercise19(-2.3,3.5);
        Exercise19(4.5,-4.5);
        
        System.out.println("\n");
        System.out.println("Exercise 20: ");
        Exercise20(18,3,4);
        Exercise20(6,7,6);
        
        System.out.println("\n");
        System.out.println("Exercise 21: ");
        Exercise21(28);
        Exercise21(500);
        System.out.println("Need to Fix");
    }
    
    public static void Exercise1(int n){
        double sum = 0;
        int i;
        for(i = 1;i <= n;i++){
            sum += 1.0/i;
            System.out.print(sum + ", ");
        }
    }
    
    public static void Exercise2(String input,int rep){
        for(int i = 1;i <= rep;i++){
            System.out.print(input);
        }
    }
    
    public static void Exercise3(int month,int day){
        
    }
    
    public static void Exercise4(int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("there are 31 days in this month");
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("there are 30 days in this month");
        }else{
            System.out.println("there are 28 days in this month");
        }
    }
    
    public static void Exercise5(int a,int b){
        System.out.print(a);
        for(int i = 1;i <= b-1;i++){
            System.out.print(" * " + a);
        }
        System.out.print(" = " +(int)Math.pow(a,b));
    }
    
    public static void Exercise6(int a,int b){
        if(a <= b){
            for(int i = a;i <= b;i++){
                System.out.print(i + " ");
            }
        }else if (a >= b){
            for(int i = a;i >= b;i--){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void Exercise7(int size){
        System.out.print("x");
        for(int i = 1;i <= size-2;i++){
            System.out.print("o");
        }
        System.out.print("x");
        System.out.println();
        
    }
    
    public static void Exercise8(){
        System.out.print("How many numbers do you want to enter? ");
        int numbers = console.nextInt();
        for(int i = 1;i <= numbers;i++){
            System.out.print("Number " + i + ": ");
            int num = console.nextInt();

        }
    }
    
    public static void Exercise9(){
        System.out.println("How many integers? : ");
        int sum = 0;int largest = 0;
        int integers = console.nextInt();
        for(int i = 1;i <= integers;i++){
            System.out.print("Next Integer? : ");
            int input = console.nextInt();
            if(input % 2 == 0){
                sum += input;
            }
            if(input > largest){
                largest = input;
            }
        }
        System.out.println("The sum of all the even numbers is " + sum + ", and the largest even number was " + largest);
    }
    
    public static void Exercise10(){
        System.out.print("Enter a student record: ");
        String name = console.nextLine();
        double numOfGrades = console.nextInt();
        double sum = 0;
        
        for(int i = 1;i <= numOfGrades;i++){
            double grades = console.nextInt();
            sum += grades;
        }
        System.out.println(name + "'s grade is " + (sum/numOfGrades));
    }
    
    public static void Exercise11(){
        int max = 0;
        System.out.println("How many names would you like to enter? : ");
        int numofnames = console.nextInt();
        
        for(int i = 1;i <= numofnames;i++){
            System.out.print("Name #" + i + "? ");
            String name = console.nextLine(); 
            
            if(name.length() > max){
                max = name.length();
            }
        }
    }
    
    public static void Exercise12(int a,int b, int c){
        if(a == b && b == c && a == c){
            System.out.println("Equilateral");
        }else if(a == b || a == c || b == c){
            System.out.println("Isosceles");
        }else if(a != b && b != c && a != c){
            System.out.println("Scalene");
        }
    
    }
    
    public static double Exercise13(double a,double b){
        return (a+b) / 2;
    }
    
    public static void Exercise14(double a,int b){
        System.out.print(" = " +Math.pow(a,b));
        System.out.println();
    }
    
    public static void Exercise15(int grade){
        double sum = 0.7;
        if(grade < 60){
            System.out.println(0.0);
        }else if (grade >= 60 && grade <= 62){
            System.out.println(0.7);
        }else {
            for(int i = 63;i <= grade;i ++){
                sum += 0.1;
            }
            System.out.printf("%.1f", sum);
            System.out.println();
        }
    }
    
    public static void Exercise16(String word){
        word = word.toLowerCase();
        String palindrome = "";
        for(int i = word.length()-1; i >= 0;i--){
            palindrome += word.charAt(i);
        }
        if(palindrome.equals(word)){
            System.out.println(palindrome + " is a palindrome");
        }else{
            System.out.println(palindrome + " is not a palindrome");
        }
    }
    
    public static void Exercise17(String swapPairs){
        String finished = "";
        String wordOne = "";
        String wordTwo = "";
        for(int i = 1;i < swapPairs.length();i+=2){
            wordOne = "" + swapPairs.charAt(i - 1);
            wordTwo = "" + swapPairs.charAt(i);
            finished += wordTwo + wordOne; 
        }
        if(swapPairs.length() % 2 != 0){
            finished += swapPairs.charAt(swapPairs.length()-1);
            System.out.print(finished);
        }else{
            System.out.print(finished);
        }
        System.out.println();
    }
    
    public static int Exercise18(String word){
        int sum = 1;
        for(int i = 1; i < word.length();i++){
            if(word.charAt(i) == ' '){
                sum += 1;
            }
        }
        if(word.length() == 1){
            sum = 0;
        }else if(word.charAt(0) == ' ' && word.charAt(word.length()-1) == ' '){
            sum -= 2;
        }else if(word.charAt(0) == ' '){
            sum -= 1;
        }
        return sum;
    }
    
    public static void Exercise19(double x,double y){
        if(x > 0 && y > 0){
            System.out.print("Quadrant 1");
        }else if(x < 0 && y > 0){
            System.out.print("Quadrant 2");
        }else if(x < 0 && y < 0){
            System.out.print("Quadrant 3");
        }else if(x > 0 && y < 0){
            System.out.print("Quadrant 4");
        }
        System.out.println();
    }
    
    public static void Exercise20(int a,int b, int c){
        if(a == b && b == c && a == c){
            System.out.println("All 3 numbers are the same");
        }else if(a == b || a == c || b == c){
            System.out.println("Only two numbers are unique");
        }else if(a != b && b != c && a != c){
            System.out.println("All 3 numbers are unique");
        }
    }
    
    public static void Exercise21(int num){
        String answer = "";
        for(int i = 1;i <= num-1;i++){
            if(num % i == 0){
                System.out.print(i + " ");
            } 
        }
        System.out.println(" = " + num);
    }
    
    public static void SelfCheck13(){
        System.out.print("What color do you want? ");
        String input = console.nextLine();
        if(input.equalsIgnoreCase("b")){
            System.out.println("You have chosen Blue.");
        }else if(input.equalsIgnoreCase("g")){
            System.out.println("You have chosen Green.");
        }else if(input.equalsIgnoreCase("r")){
            System.out.println("You have chosen Red.");
        }else {
            System.out.println("Unknown color: " + input);
        }
    }
}
