import java.util.*;
public class ProgramingProjectsNum5 {
    public static void main(){
        pP5(7);
    }
    public static void pP5(int stairs){
        String spaces1 = "",spaces2 = "     ";
        for(int i = 1;i < stairs;i++){
                spaces1 += "     ";
        }
        for(int j = 1;j <= stairs;j++){
            if(j == 1)System.out.println(spaces1 + "  o  *******");
            System.out.println(spaces1 + " /|\\ *" + spaces2 + "*");
            System.out.println(spaces1 + " / \\ *" + spaces2 + "*");
            if(j == stairs)break; 
            if(!((spaces1.length()-5 < 0)))spaces1 = spaces1.substring(0,spaces1.length()-5);
            else spaces1 = "";
            System.out.println(spaces1 + "  o  ******" + spaces2 + "*");
            spaces2 += "     ";
            
        } 
        for(int i = 1;i <= stairs*5+7;i++){
            System.out.print("*");
        }
    }
    
    public static void pP8(){
    
    }
}