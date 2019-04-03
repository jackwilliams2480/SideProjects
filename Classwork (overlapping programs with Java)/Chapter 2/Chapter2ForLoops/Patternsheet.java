 public class Patternsheet{
     public static void main(){
        Count();
    }
    
        public static void Count(){
        //VARIABLES :
        
        System.out.print("#1 : ");
        for(int i = 0; i <= 5; i++){
            
            int a = (int) Math.pow(10, i);
            
            System.out.print(a +", ");
            
        }
        
        int b = 0;
        System.out.println("\n");
        System.out.print("#2 : ");
        for(int i = 0; i <= 5; i++){
            
            b = b + 180;
            
            System.out.print(b +", ");
            
        }
        
        int c = -9;
        System.out.println("\n");
        System.out.print("#3 : ");
        for(int i = 9; i <= 16; i++){
            
            c = c + i; 
            
            System.out.print(c +", ");
            
        }    
        
        int d = 0;
        System.out.println("\n");
        System.out.print("#4 : ");
        for(int i = 1; i <= 8; i++){
            
            d = d + i; 
            
            System.out.print(d +", ");
            
        }  
        
        int e = 0;
        System.out.println("\n");
        System.out.print("#5 : ");
        for(int i = 1; i <= 15; i+=2){
            
            e = e + i; 
            
            System.out.print(e +", ");
            
        }
        
        double f = 0;
        System.out.println("\n");
        System.out.print("#5 : ");
        for(double i = 0; i < 1; i+=(1/6)){ 
            
            f = f + i; 
            
            System.out.print(f +", ");
            
        }
                
    }
    
}
