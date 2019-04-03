import java.util.*;
public class arrayLists{
    public static void main(){
        test();
    }

    public static void test(){
        ArrayList<String> list = new ArrayList();        
        //["It", "was", "a", "dark", "and", "stormy", "night"]
        list.add("It");
        list.add("was");
        list.add("a");
        list.add("dark");
        list.add("and");
        list.add("storm");
        list.add("night");
        System.out.println("alphabet = " + list);
        System.out.println();  
        list.remove("was");
        list.add(1,"IS");
        System.out.println("alphabet = " + list);
        System.out.println(); 
    }
}