import java.util.*; 
Import java.lang.*;

public class Exercises
{
    public static Random r = new Random();
    
    public static void main(){
    }
    
    public static void Exercise1(int number){
        int count = 0;
        while(number%2==0){   
            System.out.print(" 2 *");
            number/=2;
            count++;
        }
        if(count==0){System.out.println("No Factors");
        }else System.out.println(" " + number);
    }
    
    public static void Exercise2(int a,int b){
        int count = 0;int GCF = 0;int biggest;if(a>b){biggest = a;}else{biggest = b;}
        for(int i = 1;i <= biggest;i++){
            
            if(a%i==0 && b%i==0) GCF = i;count++;

        }
        if(GCF==0){System.out.print("There is no GCF");}
        else{System.out.println("The GCF is " + GCF);}
    }
    
    public static String Exercise3(int n){
        String b = "";
        int mod = 0;
        while(n>0){
            mod=n%2;
            b = "" + mod + b;
            n/=2;
        }
        return b;
    }
    
    public static void Exercise4(){
        String output = "";
        while(output.length() < 16){
            output = "";
            int random = r.nextInt(16)+5;
            for(int i = 1;i <= random;i++){
                output += "x";
            }
            System.out.println(output);
            System.out.println(" Length is : " + output.length());
        }
    }
    
    public static void Exercise5(){
        int random = r.nextInt(6)+5;
        for(int i = 0;i <= random;i++){
            for(int j = 0;j <= r.nextInt(81)+1;j++){
                System.out.print((char)(r.nextInt(26)+97));
            }
            System.out.println();
        }
    }
    
    public static void Exercise6(){
        int guess = 0;int counter = 1;
        while(guess<=48){
            guess = r.nextInt(50)+1;
            System.out.println("Guess = " + guess);
            counter++;
        }
        System.out.println("total guesses = " + counter);
    }
    
    public static void Exercise7(Scanner input){
        int a = 0;int b = 0;int sum = input.nextInt();
        do{
            System.out.print(a + " " + b + " = " + (a+b));
        }while(a+b==sum);
    }
    
    
    public static void Exercise8(){      
        int position = 0; int move = 0; int max = 0;
        while(position!=3 && position!=-3){
            move = r.nextInt(3)-1;
            if(move!=0){
                if(move<0)
                position-=1;
                if(move>0)
                position+=1;
                if(position>max)
                max = Math.max(position, max);
                System.out.println("   position = " + position);
            }
        }
        System.out.println("   max position = " + max);
    }
    
    public static void Exercise9(int n){
        if(n<0)throw new IllegalArgumentException("no negatives");
            System.out.print("   "+1);
        for(int i=2;i<=n;i++)
            if(n%i==0)System.out.print(" and " + i + " ");
    }
    
    public static void Exercise10(int hops){
        int i = 1;
        if(hops < 0)throw new ArithmeticException("hops cannot be negative");
        
        System.out.printf("%5s\n",i);
        for(int j = 2;j <= (hops*3)+1;j+=3){
            System.out.printf("%d %7d\n %4d\n",j,j+1,j+2);       
        }
    }
    
    public static void Exercise11(){
        int r1,r2,r3;
        r1 = 3;r2 = 3; 
        Random r = new Random();
        do{
            r3=r2;
            r2=r1;
            r1 = r.nextInt(2);
                if(r1 == 0){
                    System.out.print("T ");
                }
                if(r1 == 1){
                    System.out.print("H ");
                }
        }while(!(r1==1 && r2==r1 && r3==1));
        System.out.println();
        System.out.println("Three heads in a row!");
    }
    
    public static void Exercise12(){
        int sum = 0; int in = 0;double count=0.0;
        Scanner c = new Scanner(System.in);
        System.out.print("Type a number: ");
        in = c.nextInt();
        if(in>=0){
            do{
                sum+=in;
                System.out.print("Type a number: ");
                in = c.nextInt();
                count++;
            }while(in >= 0);
            System.out.println(sum/count);
        }else{
            System.out.println("Don't start negative");
        }
    }
    
    public static boolean Exercise13(int a,int b,int c){
        return
        ((a+1 == b && a+2 == c) || (a+1 == c && a+2 == b) || 
        (b+1 == a && b+2 == c) || (b+1 == c && b+2 == a) || 
        (c+1 == a && c+2 == b) || (c+1 == b && c+2 == a))
        ;
    }
    
    public static boolean Exercise14(int a,int b,int c){
            return (a+b)/2==c || (a+c)/2==b || (b+c)/2==a;
    }
    
    public static void SelfCheck7(){
        for(int i = 1;i <= 30;i++){    
            System.out.println(2*( r.nextInt(25)+24 ) - 1);
        }
    }
    
    public static boolean Exercise15(int a,int b,int c){
        return (a > (b+c) || b > (a+c) || c > (b+a));
    }
    
    public static boolean Exercise16(int a,int b,int c){
       return 
       ((a+b) == 90 || (a+b) == 180 ||
       (a+c) == 90 || (a+c) == 180 || 
       (c+b) == 90 || (c+b) == 180);
    }
    
    //Sean helped me with this one / presented it
     public static boolean Exercuse17(int m1, int d1, int m2, int d2){
        int l=0;
        if(m1<m2){
            if(m1 == 4 || m1 == 6 || m1 == 9 || m1 == 10)
                l = 30;
            else if(m1 == 2)
                l = 28;
            else
                l = 31;
        }else if(m2<m1){
            if(m2 == 4 || m2 == 6 || m2 == 9 || m2 == 10)
                l = 30;
            else if(m2 == 2)
                l = 28;
            else
                l = 31;
        }
        int dist = 0;
        if(m1<m2)
            dist = l - d1 + d2;
        else if(m2<m1)
            dist = l + d1 - d2;
        else
            return false;
        if(dist>l) 
            return true;
        else 
            return false;
    }

    public static int Exercise18(int n){
        int x = Math.abs(n); int sum = 0;
        while(x!=0){
            sum+=x%10;
            x/=10;
        }
        return sum;
    }
    
    public static void Exercise19(int input){
        int b = Math.abs(input);
        while(b > 10){
            b = b/10;
        }
        System.out.println(b);
     
    }
     
    public static void Exercise20(int input){
        int max = 0;
        int min = 10;
        if(input <= 10){
            System.out.println("The range is " + 1);
        }else{
            int input2 = Math.abs(input);
            
        while(input2 > 0){
            int number = input2 % 10;
            input2 = input2 / 10;
            if(number > max){
                max = number;
            }else if(min > number){
                min = number;
            }
        }
            System.out.println("The range is " + (max-min+1)); 
        }
    }
        
    public static void Ex21(int input){
        int input2 = Math.abs(input);
        
        while(input2 > 0){
            int number = input2 % 10;
            input2 = input2 / 10;
            System.out.print(input2);
        }
    }
   public static boolean Ex22(int num)
    {
        int length = (int)(Math.log10(num) + 1);int answer;boolean a = true;
        for(int i =1;i <=length;i++)
        {
            answer = (num/((int)Math.pow(10,length-i)))% 10;
            if(answer % 2 != 0){
                a = true;
            }else{
                a = false;
                break;
            }
        }
        return a;
    }
    
    public static boolean Ex23(int num){
        int length = (int)(Math.log10(num) + 1);int answer;boolean a = true;
        for(int i =1;i <=length;i++)
        {
            answer = (num/((int)Math.pow(10,length-i)))% 10;
            if(answer % 2 == 0){
                a = false;
            }else{
                a = true;
                break;
            }
        }
        return a;
    }
    
    public static boolean Ex24(String input){
        boolean a = true;input = input.toLowerCase();
        for(int i = 0;i <= input.length()-1;i++){
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
                a = true;
            }else {
                a = false;
            }
        }
        return a;
    }
}
