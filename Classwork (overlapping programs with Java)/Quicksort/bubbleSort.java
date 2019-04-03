public class bubbleSort{

    public static void main(){
        int nums[ ] = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5,  7,  9, 11, 13, 15};
        bubbleSort(nums);
        toString(nums);
        int nums2[ ] = {100,110,120,0,0,345,345,2,1,6,8,65,4,6,4,2,23543,6,33,56,563,563,56,536,356,356,563};
        bubbleSort(nums2);
        toString(nums2);
    }

    public static void bubbleSort(int nums[])
    {           
        boolean sorted = true;
        while(sorted){
            sorted = false;
            for(int i = 0;i < nums.length-1;i++){
                if(nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    sorted = true;
                }
            }
            if (sorted == false) 
                break; 
        }
    }

    public static void toString(int nums[]){
        for(int a : nums){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}