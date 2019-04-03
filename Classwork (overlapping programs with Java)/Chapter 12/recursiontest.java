public class recursiontest{

    public static void main(){
        System.out.println(test(420));
    }


    public static int test(int i){
        if(i == 0){
            return 1;
        }else{
            return test(i - 1);
        }
    }
}