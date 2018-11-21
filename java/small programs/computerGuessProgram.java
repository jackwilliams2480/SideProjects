import java.util.*;
public class computerGuessProgram{
    
    public static Random r = new Random();
    public static Scanner console = new Scanner(System.in);
    
    public static void main(){
        computerGuess2();
    }
    
        
    public static void computerGuess(){
        int a = r.nextInt(11);int test = 0;int count = 1;
        
        while(test == 0){
            int guess = console.nextInt();
            if(guess == a){
                System.out.print("Your guess of " + guess + " was correct");
                System.out.println(", it took you " + count + " tries to guess correctly");
                test = 1;
            }else{
                System.out.println("Your guess was incorrect, try again");
                count++;
            }
        }
    }
    
    public static void computerGuess2(){
        int a = r.nextInt(10001);int test = 0;int count = 1;
        
        while(test == 0){
            int guess = r.nextInt(10001);
            System.out.println(guess);
            if(guess == a){
                System.out.print("Your guess of " + guess + " was correct");
                System.out.println(", it took you " + count + " tries to guess correctly");
                test = 1;
            }else{
                System.out.println("Your guess was incorrect, try again");
                count++;
            }
        }
    }
        
}