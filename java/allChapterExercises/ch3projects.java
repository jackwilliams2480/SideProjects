public class main{
    
    public static void main(){
        Prog1(3,4);
        Base();
    }

    public static void Prog1(int segments,int height ) {
        for(int h=1;h<=segments;h++){
            
            
            for(int i = 1;i <= 10;i+=2){
                
                for(int j = (height*2);j >= i;j-=2){
                    System.out.print(" ");
                }
                
                for(int j = 1;j <= i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }
    
    public static void Base(){
        for(int i = 1;i <= 2;i++){
            for(int j = 8;j >= i;j-=2){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i = 1;i <= 1;i++){
            for(int j = 1;j >= i;j--){
                System.out.print(" ");
            }
            System.out.println("*******");
        }
    }
}

#6 Almost working
public class ProgrammingProjects{
    public static void main(){
        Start(31,6);
        //numbers();
    }
    
    public static void Start(int numOfDays,int firstSunday){
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        for(int i = 1;i <= 7;i++){
            System.out.print("+______");
        }
        System.out.println("+");
        
        for(int i = 1;i <= 5;i++){
            for(int j = 1;j <= 7;j++){
                System.out.print("|");
                

                if(i<=1){System.out.print( padded(j,4) );}
                else if(i<=2){System.out.print( padded(j+7,4) );}
                else if(i<=3){System.out.print( padded(j+14,4) );}
                else if(i<=4){System.out.print( padded(j+21,4) );}
                else if(i<=5){
                    if(j+28<=numOfDays){System.out.print( padded(j+28,4) );}
                    else{System.out.print("    ");}
                }
                System.out.print("  ");
            }
            System.out.print("|");
            System.out.println();
        }
        
        for(int i = 1;i <= 7;i++){
            System.out.print("+______");
        }
        System.out.println("+");
        
    }
    
    // Returns a string of the number n, left-padded
    // with spaces until it is at least the given width.
    public static String padded(int n, int width) {
        String s = "" + n;
        for (int i = s.length(); i < width; i++) {
            s = " " + s;
        }
        return s;
    }
    
}
