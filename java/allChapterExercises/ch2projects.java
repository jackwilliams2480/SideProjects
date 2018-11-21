public static void main(){
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }
    
    public static void Line(){
        //VARIABLES FOR PROGRAMING PROJECT #3
        int LineLength = 9;
        
        System.out.print("+");
        for(int j = 1;j <= LineLength;j++){
            
                System.out.print("-");
        }
        System.out.println("+");
    }
    
    //The top of the cone
    public static void Top(){
        for (int line = 1; line <= 4; line++) {
            System.out.print("|");
            
            //For Loop for printing 
            for (int i = 1; i <= (5 - line); i++) {
             System.out.print(" ");
            }
            
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print("/");
            }
           
            System.out.print("*");
            
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print("\\");
            }
            
            for (int i = 1; i <= (5 - line); i++) {
                System.out.print(" ");
            }
            
            System.out.println("|");
        }
    }
    
    //The bottom of the cone
        public static void Bottom(){
        for (int line = 4; line >= 1; line--) {
            System.out.print("|");
            
            for (int i = 1; i <= (5 - line); i++) {
             System.out.print(" ");
            }
            
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print("\\");
            }
           
            System.out.print("*");
            
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print("/");
            }
            
            for (int i = 1; i <= (5 - line); i++) {
                System.out.print(" ");
            }
            
            System.out.println("|");
        }
    }
