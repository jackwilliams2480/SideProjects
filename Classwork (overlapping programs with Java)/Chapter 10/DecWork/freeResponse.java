import java.util.*;
public class freeResponse{
    public static void main(){
        int arr2d[][] = {{1,3,2,7,3},
                          {10,10,4,6,2}, 
                          {5,3,5,9,6},
                          {7,6,4,2,1}};
        System.out.println(Arrays.toString(arr2D(arr2d)));
    }

    public static int[] arr2D(int [][] arr2d){
        int arrsums[] = new int[arr2d[0].length-1];
        for(int i = 0;i < arr2d.length;i++){
            arrsums[i] = arrsums(arr2d[i]);        
        }
        return arrsums;
    }
    
    public static int arrsums(int arr[]){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }

    //public static boolean isDiverse(int arr[]){
        //for(int i){
        
        //}
    
    //}
}