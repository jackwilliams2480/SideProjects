public class recursion{

    public static int[] a = {1,2,3,4};
    
    static int findSum(int A[], int N) 
    { 
        if (N <= 0) 
            return 0; 
        return (findSum(A, N - 1) + A[N - 1]); 
    } 
    
    public static void main(){
        System.out.println(findSum(a,4));
    }
}