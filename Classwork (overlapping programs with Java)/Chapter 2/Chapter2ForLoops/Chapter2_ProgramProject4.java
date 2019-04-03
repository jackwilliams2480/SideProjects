public class Chapter2_ProgramProject4{
    public static void main(){
        System.out.println("Program project 4");
        drawline();
        for(int i=4;i>=1;i--){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }    
            System.out.print("\\");
            for(int j=1;j<=2*i;j++){
                System.out.print(":");
            }   
            System.out.println("/");
        }
        System.out.println("     ||");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }    
            System.out.print("/");
            for(int j=1;j<=2*i;j++){
                System.out.print(":");
            } 
            System.out.println("\\");
        }
        drawline();
    }

    public static void drawline(){
        int i;
        System.out.print("|");
        for(i=1;i<=10;i++)
        System.out.print("\"");
        System.out.print("|");
        System.out.println();
    }    
}