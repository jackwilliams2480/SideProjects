class Solution {
    public static void main(){
        isPalindrome(121);
    }
    
    public static boolean isPalindrome(int x) {
        String s = "";int initial = x;
        while(x > 0){
            s += String.valueOf(x%10);
            x /= 10;
        }
        System.out.println(Integer.parseInt(s));
        if(Integer.parseInt(s) == initial){
            return true;
        }
        return false;
    }
}