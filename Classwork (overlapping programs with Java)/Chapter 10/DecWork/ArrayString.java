public class ArrayString
{
    
    public static void main(){
        System.out.println(test());
    }
    
    public static boolean test()
    {
        String[][] arr = {{"A","A","A","B"},
                          {"C","C","D","A"},
                          {"A","B","C","A"},
                          {"A","B","C","C"},};
        //If double letters go back one letter
        int count = 0;String key = "AABCD";
        for(int x = 0;x <= arr.length-1;x++){

            for(int y = 0;y <= arr[0].length-1;y++){
                if(arr[x][y].equals(key.substring(count,count+1))){
                    System.out.println("Test " + arr[x][y] + " = " + key.substring(count,count+1) + " " + count);
                    if(count == key.length()-1)return true;
                    count++;
                }else{
                    count = 0;
                }
            }

        }
        return false;

    }

}