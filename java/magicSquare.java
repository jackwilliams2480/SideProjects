import java.util.*;
import java.lang.*;
public class magicSquare{
    public static void main(){
        System.out.println("Enter any odd, non-negative integer");
        Scanner s = new Scanner(System.in);
        magic(s.nextInt());
    }

    public static void magic(int scale){
        int magicSquare[][] = new int[scale][scale];int xtemp=0;
        int numcount = 1;int x = 0,y = scale/2;
        magicSquare[x][y] = numcount;numcount++;
        while(numcount != scale*scale+1){
            x--;y++;
            if(x < 0 && y < scale){
                xtemp = x;
                x = magicSquare.length-1;
                if(magicSquare[x][y] != 0){
                    x = xtemp + 1;y--;
                }

            }else if(y > magicSquare.length-1 && x != -1){
                y = 0;
                if(magicSquare[x][y] != 0){
                    x = xtemp + 1;y = magicSquare.length-1;
                }

            }else if(x == -1 && y == scale){
               x = 1;y = magicSquare[0].length-1;
            
            }else if(magicSquare[x][y] != 0){
                x += 2;y--;

            }
            if(x > scale-1 || y > scale-1 || x < 0 || y < 0)break;
            magicSquare[x][y] = numcount;
            numcount++;
        }
        for(int a[] : magicSquare){
            System.out.println(Arrays.toString(a));
        }    
    }

}