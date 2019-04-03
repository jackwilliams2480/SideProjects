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