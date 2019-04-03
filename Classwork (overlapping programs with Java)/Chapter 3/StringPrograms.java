public class StringPrograms{
    public static void main(){
        //Program1("John","Quincy","Adams");
        //Program2("John","Quincy","Adams");
        //Program3("John","Quincy","Adams");
        System.out.println(breakingpoints("abcdefghijk",3,5,9));
    }
    
    public static void Program1(String first,String middle,String last){
        System.out.println(first + " " + middle + " " + last);
    }
    
    public static void Program2(String first,String middle,String last){
        System.out.println(first.charAt(0) + " " + middle.charAt(0) + " " + last.charAt(0));
    }
    
    public static void Program3(String first,String middle,String last){
        System.out.println(last + ", " + first + " " + middle.charAt(0));
    }
    
    public static void Program4(String first,String middle,String last){
        System.out.println(first.charAt(0) + " " + middle.charAt(0) + " " + last.charAt(0));
    }
    
     public static String breakingpoints(String a, int b, int c, int d) {

        return a.substring(c, d) + a.substring(0, b) + a.substring(d, a.length()) + a.substring(b, c);

    }
}