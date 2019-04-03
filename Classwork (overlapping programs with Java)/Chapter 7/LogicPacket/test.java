import java.util.*;
import java.io.*;
public class test{
    public static int array[][];
    
    public static void main(){
        pascal3rd(8);
    }
    
    public static void pascal3rd(int scale){
        array = new int[scale+1][scale/2+1];
        array[0][0] = 1;
        array[1][0] = 1;
        int row = 2;int colum = 0;
        int algRow = row;int algColum1 = colum;int algColum2 = colum;
        int increment = 0;int finalNum = 0;int lastCol = 1;
        while(array[scale][array[0].length-1] == 0){
            //int tempRow = row;
            int tempColum = colum;
            algRow = row - 1;
            array[row][colum] = 1;
            for(int i = 0;i <= increment/2;i++){
                colum++;
                algColum1 = colum;
                algColum2 = colum-1;
                if(colum == lastCol)array[row][colum] = (array[algRow][algColum2] + array[algRow][algColum2]);
                    else array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;finalNum++;lastCol++;
            row++;colum = tempColum;
        }

        //Print out array
        for(int i[] : array){
            System.out.println(Arrays.toString(i));
        }
    } 

}