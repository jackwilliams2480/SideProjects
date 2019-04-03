  import java.util.*;
public class name{

    public static void main(){
        //namebackwords();
        stringinsensitivety();
    }
    
    public static void namebackwords(){
        Scanner console = new Scanner(System.in);
        
        System.out.println("Type your first and last name: ");
        String imput = console.nextLine();
        
        imput.substring(imput.charAt(' '),imput.length());
        System.out.print(imput.charAt(imput.charAt(' ')));
    }
    
    public static void stringinsensitivety()
    {
        String s = "hello world the best";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'e' || s.charAt(i) == 'E')
            {
            count++;
            }
        }
        System.out.println(count);
    }
}