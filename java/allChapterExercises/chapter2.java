public class Chapter_2Exercises{
    public static void main(){
        one(); 
        two(); 
        three(); 
        four();
        five();
        six();
        seven();
        eight();
        nine();
        ten();
        eleven();
        twelve();
        thirteen();
        fourteen();
        fifteen();
        sixteen();
        seventeen();
        eightteen();
        twenty();
        twentyone();
        twentytwo();
        twentythree();
    }

    public static void one(){
        System.out.println("exercise 1");
        for(int i=1;i<=10;i++){
            System.out.print(", ");
        }
        System.out.println();
    }

    public static void two(){
        System.out.println("exercise 2");
        for(int i=1;i<=10;i++){
            System.out.print(i*i +", ");
        }
        System.out.println();
    }

    public static void three(){
        System.out.println("exercise 3");
        int a=1;
        int b=1;
        int c=0;
        for(int i=1;i<=10;i++){
            System.out.print(a + ", ");
            a=b+c;
            c=b;
            b=a;
        }
        System.out.println();
    }

    public static void four(){
        System.out.println("exercise 4");
        for(int i=1;i<=1;i++){
            for(int j=1;j<=4;j++){
                System.out.println("*****");
            }
        }
    }

    public static void five(){
        System.out.println("exercise 5");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }    
            System.out.println();
        }
    }

    public static void six(){
        System.out.println("exercise 6");
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }    
            System.out.println();
        }
    }

    public static void seven(){
        System.out.println("exercise 7");
        for(int i=1;i<=5;i++){
            for(int j=i;j<=4;j++){
                System.out.print(" ");
            }    
            System.out.println(i);
        }
    }

    public static void eight(){
        System.out.println("exercise 8");
        for(int i=1;i<=5;i++){
            for(int j=i;j<=4;j++){
                System.out.print(" ");
            }    
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void nine(){
        int i;
        int j;
        System.out.println("exersise 9");
        for(i=1; i<=1; i++){
            for(j=1; j<=40; j++)
                System.out.print("-");
            System.out.println();
            for(j=1; j<=10; j++)
                System.out.print("_-^-");
            System.out.println();
            for(j=1; j<=20; j++){
                System.out.print(j%10);
                System.out.print(j%10);
            }
            System.out.println();
            for(j=1; j<=40; j++)
                System.out.print("-");
        }
        System.out.println();
    }

    public static void ten(){
        System.out.print("exersise 10");
        System.out.println();
        for(int i=1;i<=6;i++){
            System.out.print("         |");
        }
        System.out.println();
        for(int a=1;a<=6;a++){
            for(int i=1;i<=9;i++){
                System.out.print(i);
            } 
            for(int j=1;j<=1;j++){
                System.out.print("0");
            }
        }
    }





    public static void eleven(){
        System.out.print("exersise 11");
        System.out.println();
        for(int i=1;i<=10;i++){
            System.out.print("    |");
        }
        System.out.println();
        for(int a=1;a<=10;a++){
            for(int i=1;i<=4;i++){
                System.out.print(i);
            } 
            for(int j=1;j<=1;j++){
                System.out.print("0");
            }
        }
        System.out.println("");
        for(int i=1;i<=6;i++){
            System.out.print("         |");
        }
        System.out.println();
        for(int a=1;a<=6;a++){
            for(int i=1;i<=9;i++){
                System.out.print(i);
            } 
            for(int j=1;j<=1;j++){
                System.out.print("0");
            }
        }
    }

    public static void twelve(){
        System.out.println("exersise 12");
        for(int a=1;a<=3;a++){
            for(int i=0;i<=9;i++){
                for(int j=1;j<=3;j++){
                    System.out.print(i);
                }
            }  
            System.out.println();
        }
    }  

    public static void thirteen(){
        System.out.println("exersise 13");
        for(int a=1;a<=5;a++){
            for(int i=9;i>=0;i--){
                for(int j=1;j<=4;j++){
                    System.out.print(i);
                }
            }  
            System.out.println();
        }
    }   

    public static void fourteen(){
        System.out.println("exersise 14");
        for(int a=1;a<=4;a++){
            for(int i=9;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
            }  
            System.out.println();
        }
    } 

    public static void fifteen(){
        System.out.println("exersise 15");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("-");
            }    
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i*2-1);
            }   
            for(int j=1;j<=6-i;j++){
                System.out.print("-");
            } 
            System.out.println();
        }
    }

    public static void sixteen(){
        System.out.println("exersise 16");
        for(int i=6;i>=1;i--){
            for(int j=1;j<=12-i*2;j++){
                System.out.print("\\");
            }    
            for(int j=1;j<=4*i-2;j++){
                System.out.print("!");
            }   
            for(int j=1;j<=12-i*2;j++){
                System.out.print("/");
            } 
            System.out.println();
        }
    }

    public static void seventeen(){
        System.out.println("exersise 17");
        for(int i=4;i>=1;i--){
            for(int j=1;j<=8-i*2;j++){
                System.out.print("\\");
            }    
            for(int j=1;j<=4*i-2;j++){
                System.out.print("!");
            }   
            for(int j=1;j<=8-i*2;j++){
                System.out.print("/");
            } 
            System.out.println();
        }
        System.out.println();
        for(int i=8;i>=1;i--){
            for(int j=1;j<=16-i*2;j++){
                System.out.print("\\");
            }    
            for(int j=1;j<=4*i-2;j++){
                System.out.print("!");
            }   
            for(int j=1;j<=16-i*2;j++){
                System.out.print("/");
            } 
            System.out.println();
        }
    } 

    public static void eighteen(){
        System.out.println("exersise 18");
        for(int i=1;i<=2;i++){
            System.out.println("+===+===+");
            for(int k=1;k<=3;k++){
                for(int j=1;j<=3;j++){
                    System.out.print("|   ");
                }
                System.out.println();
            }    
        } 
        System.out.println("+===+===+");
    }

    public static void twenty(){
        System.out.println("exersise 20");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=20-i*4;j++){
                System.out.print("/");
            }    
            for(int j=1;j<=8*i-8;j++){
                System.out.print("*");
            }   
            for(int j=1;j<=20-i*4;j++){
                System.out.print("\\");
            }
            System.out.println();
        }        
    }

    public static void twentyone(){
        System.out.println("exersise 21");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=12-i*4;j++){
                System.out.print("/");
            }    
            for(int j=1;j<=8*i-8;j++){
                System.out.print("*");
            }   
            for(int j=1;j<=12-i*4;j++){
                System.out.print("\\");
            }
            System.out.println();
        } 
        System.out.println();
        for(int i=1;i<=6;i++){
            for(int j=1;j<=24-i*4;j++){
                System.out.print("/");
            }    
            for(int j=1;j<=8*i-8;j++){
                System.out.print("*");
            }   
            for(int j=1;j<=24-i*4;j++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void twentytwo(){
        System.out.println("exersise 22");
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i-2+1;j++){
                System.out.print("**");
            }
            for(int j=7;j>=i;j--){
                System.out.print("$");
            }
            for(int j=14;j>=2*i-1;j--){
                System.out.print("*");
            }
            for(int j=7;j>=i;j--){
                System.out.print("$");
            }
            for(int j=1;j<=i-2+1;j++){
                System.out.print("**");
            }
            System.out.println();
        }        
    }
    public static void twentythree(){
        System.out.println("exersise 23");
        int height=7;
        for(int i=1;i<=height;i++){
            for(int j=1;j<=i-2+1;j++){
                System.out.print("**");
            }
            for(int j=height;j>=i;j--){
                System.out.print("$");
            }
            for(int j=14;j>=2*i-1;j--){
                System.out.print("*");
            }
            for(int j=height;j>=i;j--){
                System.out.print("$");
            }
            for(int j=1;j<=i-2+1;j++){
                System.out.print("**");
            }
            System.out.println();
        }        
    }
    public static void line(){
        System.out.print("+===+===+");
    }
}
