public class Gamble {    
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