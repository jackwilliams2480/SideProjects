public class OmarTestProgram{
    public static void main(){
        Line();
        LinePattern();
        NumberPattern();
        NumberPattern();
        System.out.println();
        Line();
    
    
    
    }
   
    public static void Line(){
        for(int i = 1;i <= 40; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void LinePattern(){
        for(int i = 1; i <= 10; i++){
            System.out.print("_-^-");
        }
        System.out.println();
    }
    public static void NumberPattern(){    
        for(int i = 1; i <= 9; i++){
            System.out.print(i*11);
        }
        System.out.print("00");
    }
}
    
    
    
    