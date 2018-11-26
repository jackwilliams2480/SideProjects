import java.util.*;
public class pascals{
    public static int array[][];

    public static void main(){
        pascal(8);
        pascal2nd(8);
        //pascal3rd(8);
    }

    public static void pascal(int scale){
        array = new int[scale+1][scale*2+1];
        array[0][scale] = 1;
        array[1][scale-1] = 1;
        array[1][scale+1] = 1;
        int row = 2;int colum = scale-2;
        int algRow = row;int algColum1 = colum;int algColum2 = colum;
        int increment = 1;
        while(array[scale][array[0].length-1] == 0){
            int tempRow = row;
            int tempColum = colum;
            algRow = row - 1;
            array[row][colum] = 1;
            for(int i = 0;i <= increment;i++){
                colum+=2;
                algColum1 = colum-1;
                algColum2 = colum+1;
                if(row < 0 || colum < 0 || colum > 16 || row > 8
                || algRow < 0 || algColum1 < 0 || algColum1 > 16 || algRow > 8
                || algColum2 < 0 || algColum2 > 16)break;
                array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;
            array[row][colum] = 1;
            row++;colum = tempColum-1;
        }

        //Print out array
        for(int i = 0;i <= array.length-1;i++){
            for(int a = scale*2;a>=0;a--){
                System.out.print(" ");
            }
            scale--;
            for(int j = 0;j <= array[0].length-1;j++){
                if(array[i][j] != 0 & i < 4)System.out.print(array[i][j] + "  ");
                else if(array[i][j] != 0)System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

    }
    
    public static void pascal2nd(int scale){
        array = new int[scale+1][scale+1];
        array[0][0] = 1;
        array[1][0] = 1;
        array[1][1] = 1;
        int row = 2;int colum = 0;
        int algRow = row;int algColum1 = colum;int algColum2 = colum;
        int increment = 1;
        while(array[scale][array[0].length-1] == 0){
            //int tempRow = row;
            int tempColum = colum;
            algRow = row - 1;
            array[row][colum] = 1;
            for(int i = 0;i <= increment;i++){
                colum++;
                algColum1 = colum;
                algColum2 = colum-1;
                if(row < 0 || colum < 0 || colum > 8 || row > 8
                || algRow < 0 || algColum1 < 0 || algColum1 > 8 || algRow > 8
                || algColum2 < 0 || algColum2 > 8)break;
                array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;
            array[row][colum] = 1;
            row++;colum = tempColum;
        }

        //Print out array
        for(int i = 0;i <= array.length-1;i++){
            for(int a = scale*2;a>=0;a--){
                System.out.print(" ");
            }
            scale--;
            for(int j = 0;j <= array[0].length-1;j++){
                if(array[i][j] != 0 & i < 4)System.out.print(array[i][j] + "  ");
                else if(array[i][j] != 0)System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }    

    public static void pascal3rd(int scale){
        array = new int[scale+1][scale/2+1];
        array[0][0] = 1;
        array[1][0] = 1;
        int row = 2;int colum = 0;
        int algRow = row;int algColum1 = colum;int algColum2 = colum;
        int increment = 1;
        while(array[scale][array[0].length-1] == 0){
            //int tempRow = row;
            int tempColum = colum;
            algRow = row - 1;
            array[row][colum] = 1;
            for(int i = 1;i <= increment/2;i++){
                colum++;
                algColum1 = colum;
                algColum2 = colum-1;
                if(row < 0 || colum < 0 || colum > 8 || row > 8
                || algRow < 0 || algColum1 < 0 || algColum1 > 8 || algRow > 8
                || algColum2 < 0 || algColum2 > 8)break;
                array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;
            array[row][colum] = 1;
            row++;colum = tempColum;
        }

        //Print out array
        for(int i[] : array){
            System.out.println(Arrays.toString(i));
        }
    } 
}
