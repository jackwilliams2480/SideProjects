public class GroupProject{
    public static void main(){
        //First number is the minimum, Second number is the maximum
        Exercise4(1,9);
    }
    
    public static void Exercise4(int MIN_NUMBER,int MAX_NUMBER){
            for(int j = (MIN_NUMBER - 1);j <= (MAX_NUMBER - 1);j++){
                for(int k = (j+1);k <= MAX_NUMBER;k++){
                    System.out.print(k);
                }
                
                for(int k = MIN_NUMBER;k <= j;k++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
   
}