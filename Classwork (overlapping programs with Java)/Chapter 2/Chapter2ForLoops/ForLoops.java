 public class ForLoops{
    public static void main(){
        Count();
    }
    
    public static void Count(){
        //VARIABLES :
        int a = 0;
        int b = -11;
        int c = 40;
        int d = -11;
        int e = 100;

        System.out.print("Sequence a: ");
        for(int i = 0; i <= 10; i += 2){
            a = a + 2;
            System.out.print(a+", ");
        }
       
        System.out.println("");
        System.out.print("Sequence b: ");
        for(int i = 0; i <= 10; i += 2){
            b = b + 15;
            System.out.print(b+", ");
        }
        
        System.out.println("");
        System.out.print("Sequence c: ");
        for(int i = 0; i <= 10; i += 2){
            c = c - 10;
            System.out.print(c+", ");
        }
    
        System.out.println("");
        System.out.print("Sequence d: ");
        for(int i = 0; i <= 10; i += 2){
            d = d + 4;
            System.out.print(d+", ");
        }
    
        System.out.println("");
        System.out.print("Sequence d: ");
        for(int i = 0; i <= 10; i += 2){
            e = e -3 ;
            System.out.print(e+", ");
        }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Gamble(){
        
        for (int i = 0; i <= 14; i += 1){
    
            double random = Math.random() * 100 + 1;
            
            if(random >= 75){
                System.out.println("WIN = " + random);
            }else{
                System.out.println("LOSE = " + random);
            }
            
        }
    }
}
