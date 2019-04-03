import java.util.*;
public class pascals{
    public static int array[][];

    public static void main(){
        pascal(8);
        System.out.println();
        pascal2nd(8);
        System.out.println();
        pascal3rd(8);
        test(8);
        System.out.println();
        pascal4th(8);
        test(8);
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
                if(algColum2 != scale*2+1)array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;
            array[row][colum] = 1;
            row++;colum = tempColum-1;
        }

        //Print out array
        System.out.println("Original array #1");
        for(int i[] : array){
            System.out.println(Arrays.toString(i));
        }   
        
        for(int i = 0;i <= array.length-1;i++){
            for(int a = scale*2;a>=0;a--){
                System.out.print(" ");
            }
            scale--;
            for(int j = 0;j <= array[0].length-1;j++){
                if(array[i][j] != 0 & i < 4)System.out.print(array[i][j] + "   ");
                else if(array[i][j] != 0 && array[i][j] > 9 )System.out.print(array[i][j] + "  ");
                else if(array[i][j] != 0)System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }

    }
    
    public static void test(int scale){
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
                if(algColum2 != scale*2+1)array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;
            array[row][colum] = 1;
            row++;colum = tempColum-1;
        }
 
        
        for(int i = 0;i <= array.length-1;i++){
            for(int a = scale*2;a>=0;a--){
                System.out.print(" ");
            }
            scale--;
            for(int j = 0;j <= array[0].length-1;j++){
                if(array[i][j] != 0 & i < 4)System.out.print(array[i][j] + "   ");
                else if(array[i][j] != 0 && array[i][j] > 9 )System.out.print(array[i][j] + "  ");
                else if(array[i][j] != 0)System.out.print(array[i][j] + "   ");
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
                if(algColum2 != scale*1+1)array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;
            array[row][colum] = 1;
            row++;colum = tempColum;
        }
        
        //Print out array
        System.out.println("Original array #2");
        for(int i[] : array){
            System.out.println(Arrays.toString(i));
        }   
        
        for(int i = 0;i <= array.length-1;i++){
            for(int a = scale*2;a>=0;a--){
                System.out.print(" ");
            }
            scale--;
            for(int j = 0;j <= array[0].length-1;j++){
                if(array[i][j] != 0 & i < 4)System.out.print(array[i][j] + "   ");
                else if(array[i][j] != 0 && array[i][j] > 9 )System.out.print(array[i][j] + "  ");
                else if(array[i][j] != 0)System.out.print(array[i][j] + "   ");
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
        int increment = 0;int finalNum = 0;
        while(array[scale][array[0].length-1] == 0){
            //int tempRow = row;
            int tempColum = colum;
            algRow = row - 1;
            array[row][colum] = 1;
            for(int i = 0;i <= increment;i+=2){
                colum++;
                algColum1 = colum;
                algColum2 = colum-1;
                if(i >= increment)array[row][colum] = (array[algRow][algColum2] + array[algRow][algColum2]);
                    else array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;finalNum++;
            row++;colum = tempColum;
        }

        //Print out array
        System.out.println("Original array #3");
        for(int i[] : array){
            System.out.println(Arrays.toString(i));
        }
       /*
        //Print out correct Triangle??
        int incrementVal = 1;
        for(int i = 0;i <= array.length-1;i++){
            
            for(int a = scale*2;a>=0;a--){
                System.out.print(" ");
            }
            
            
            for(int j = 0;j <= array[0].length-1;j++){
                if(array[i][j] == 1 && j == 0){System.out.print(1 + "  ");}
                else if(array[i][j] == 1)System.out.print(array[i][j] + "  ");
                else if(array[i][j] != 0 && i % 2 != 0){
                    int itemp = i;
                    int jtemp = j;
                    for(int a = 1;a <= incrementVal;a++){
                        System.out.print(array[itemp][jtemp] + "  ");
                    }
                    incrementVal++;
                }
                else if(array[i][j] != 0)System.out.print(array[i][j] + "  ");
            }
            
            if( i != 0)System.out.print(1 + "  ");
            System.out.println();scale--;
            
        }*/
        /*
        //System.out.print(space.substring(0,space.length()//-count));
        for(int i =1;i<array.length;i++){
          for(int a = scale*2;a>=0;a--){
                System.out.print(" ");
            }
            scale--;
          //System.out.println(array[i]);
          for(int k =0;k<array[i].length;k++){
            
            if(array[i][k]!=0 )
            System.out.print(array[i][k] + "  ");
          }
          for(int j=array[i].length-1;j>=0;j--){
              if(array[i][j]!=0)
            System.out.print(array[i][j] + "  ");
          }
          System.out.println();
        }
        */
    } 
    
    public static void pascal4th(int scale){
        array = new int[scale-1][scale/2];int value = 2;
        array[0][0] = value;
        array[1][0] = ++value;
        int row = 2;int colum = 0;
        int algRow = row;int algColum1 = colum;int algColum2 = colum;
        int increment = 0;int finalNum = 0;
        while(array[scale-2][array[0].length-1] == 0){
            //int tempRow = row;
            int tempColum = colum;
            algRow = row - 1;
            array[row][colum] = ++value ;
            for(int i = 0;i <= increment;i+=2){
                colum++;
                algColum1 = colum;
                algColum2 = colum-1;
                if(i >= increment)array[row][colum] = (array[algRow][algColum2] + array[algRow][algColum2]);
                    else array[row][colum] = (array[algRow][algColum1] + array[algRow][algColum2]);
            }
            increment++;finalNum++;
            row++;colum = tempColum;
        }
        
        //Print out array
        System.out.println("Original array #4");
        for(int i[] : array){
            System.out.println(Arrays.toString(i));
        }
        
        //Print out correct triangle ???
    }
}