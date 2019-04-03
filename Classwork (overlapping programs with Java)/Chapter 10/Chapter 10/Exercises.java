import java.util.*;
public class Exercises{
    public static void main(){
        Ex12();
    }

    public static void Ex12(){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("this","is","lots","of","fun","for","Java","coders"));
        for(int i = 0;i < list.size();i++){
            if(list.get(i).length() == 4){
                list.add(i,"****");i++;
            }
        }
        System.out.println(list);
    }
}