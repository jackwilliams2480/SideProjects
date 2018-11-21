import java.util.*;
public class ArrayPrograms2{
    public static void main(){
        System.out.println("Exercise 1: ");
        int ex1[][] = { {10, 30, 50, 200},
                {60, 40, 70, 55},
                {80, 5, 35, 100} };
        Ex1(ex1);
        System.out.println();

        System.out.println("Exercise 2: ");
        int ex2[][] = { {10, 30, 50, 200},
                {60, 40, 70, 55},
                {80, 5, 35, 100} };
        Ex2(ex2);
        System.out.println();

        System.out.println("Exercise 3: ");
        int a[][] = { {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12} }; 
        Ex3(a);
        System.out.println();

        System.out.println("Exercise 4: ");
        int ex4[][] = { {10, 30, 50, 200}, 
                {60, 40, 70, 55},
                {80, 5, 35, 100} };
        Ex4(ex4);
        System.out.println();

        System.out.println("Exercise 5: ");
        int ex5[][] = { {10, 30, 50, 200}, 
                {60, 40, 70, 55},
                {80, 5, 35, 100} };
        Ex5(ex5);
        System.out.println();

        System.out.println("Exercise 7: ");
        String words[][] = { {"dog", "kitty", "moose", "ant", "elephant"},
                {"frog",  "bird", "bat", "porcupine", "mice"},
                {"lion",  "zebra", "snake", "toad", "turtle"} };
        Ex7(words);
        System.out.println();

        System.out.println("Exercise 8: ");
        int board[][] = {  {10,10,10,10,10},
                {10,50,50,50,10},
                {10,50,100,50,10},                                                                                
                {10,50,50,50,10},
                {10,10,10,10,10}  };
        Ex8(board);
        System.out.println();

    }

    public static void Ex1(int list[][]){
        double sum = 0;int length = 0;
        for(int i[] : list){    
            length = i.length;
            for(int j : i){
                sum += j;
            }
        }
        System.out.println("Sum = " + sum + " Average " + sum/(list.length*length));
    }

    public static void Ex2(int list[][]){
        int smallest = Integer.MAX_VALUE,largest = Integer.MIN_VALUE;
        for(int i[] : list){   
            for(int j : i){
                if(j > largest){
                    largest =j;
                }else if(j < smallest){
                    smallest = j;
                }
            }
        }
        System.out.println("smallest = " + smallest + " largest = " + largest);  
    }

    public static void Ex3(int list[][]){
        int oddCount = 0,evenCount = 0;
        for(int i[] : list){   
            for(int j : i){
                if(j%2 == 0){
                    evenCount++;
                }else if(j%2 != 0){
                    oddCount++;
                }
            }
        }
        System.out.println("Even count = " + evenCount + " oddCount = " + oddCount);
    }

    public static void Ex4(int list[][]){
        double averageRow = 0;double averageCol = 0;double length = 0;int a = 1;int o = 0;
        for(int i[] : list){   
            averageRow = 0;averageCol = 0;length = 0;
            for(int t = 0; t < list.length;t++){
                averageCol += list[t][o];
            }
            for(int j : i){
                averageRow+=j;
                length = i.length;
            }
            averageRow = averageRow/length;
            System.out.print("Average of row " + a + " = " + averageRow + "  ");
            System.out.println("Average of colum " + a + " = " + averageCol/list[0].length);
            a++;
        }
    }

    public static void Ex5(int list[][]){
        int averageRow = 0;int colRow = 0;int length = 0;
        for(int i[] : list){   

            for(int j : i){
                averageRow+=j;
                //length = j.length;
            }
            //averageRow = averageRow/lenght;
            System.out.println("Average of row " + i + " = " + averageRow);
        }
        //System.out.println("smallest = " + smallest + " largest = " + largest); 
    }

    public static void Ex7(String list[][]){
        int vowelCount = 0, maxCount = Integer.MIN_VALUE,row = 0,col = 0,i = 0,j = 0,k = 0;
        //Amount of colums
        for(i = 0;i < list[0].length;i++){
            //Amount of rows
            for(j = 0;j < list.length;j++){
                for(k = 0;k < list[j][i].length();k++){
                    if(list[j][i].charAt(k) == 'a' || list[j][i].charAt(k) == 'e' || list[j][i].charAt(k) == 'i' 
                    || list[j][i].charAt(k) == 'o' || list[j][i].charAt(k) == 'u'){
                        vowelCount++;

                    }  

                }
                if(vowelCount > maxCount){
                    maxCount = vowelCount;
                    col = i;
                    row = j;

                }
                vowelCount = 0;
            }
        }
        System.out.println(list[row][col] + " row = " + row + " col = " + col + " vowelCount = " + maxCount);
    }

    public static void Ex8(int board[][]){
        Random r = new Random();
        int shots = 3, rowHit = 0, colHit = 0,sum = 0;
        for(int i = 1; i <= 3;i++){
            rowHit = r.nextInt(4)+1;colHit = r.nextInt(4)+1;
            System.out.println("Hit row: " + (rowHit + 1) + " col: " + (colHit + 1) + " Point: " + board[rowHit][colHit]);
            sum += board[rowHit][colHit];
        }
        System.out.println("Sum = " + sum);
    }
}

