import java.util.*;
import java.io.*;
public class pp8{
    public static void main(){
        int lengthFirst = 9;int lengthSecond = 29;
        for(int i = 8;i >= 0;i--){
            
            for(int j = lengthFirst-1;j >= 0;j--){
                System.out.print(" ");
            }
            
            if(i == 8){
                System.out.println("+------------------------------+");
            }else{
                System.out.print("/");
                for(int k = lengthSecond-1;k >= 0;k--){
                    System.out.print(" ");
                }
                System.out.println("/");
            }
        }
        
    }

}