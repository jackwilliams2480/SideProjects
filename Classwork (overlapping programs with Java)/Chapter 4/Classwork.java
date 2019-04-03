import java.util.*;

public class Classwork {
    public static Scanner console = new Scanner(System.in);
    
    public static void main(){
        int a = 1;
        while(a == 1){
             String input = console.nextLine();
             for(int i = 0;i < input.length();i++){
                 if(input.charAt(i) == 'a'){
                     System.out.println("String contained the letter a, so it was terminated");
                     a++;
                }
            }
            
        }
    }
    
}

