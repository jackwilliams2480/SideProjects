import java.util.*;
/*
 * QuickSort An Array Via Index Pointers
 * Write a program called “QuickSortAnArrayViaPointers.java” that will QuickSort an array of numbers WITHOUT 
 * moving the numbers around themselves.  Instead, you QuickSort the ‘sorted’ array which pt to ‘nums’.

 * So in array ‘nums’ and ‘sorted’ we had:
 * nums:   8, 4, 12, 2, 6, 10, 14, 1, 3, 5,  7,  9, 11, 13, 15
 * index:  0  1   2  3  4   5   6  7  8  9  10  11  12  13  14

 * sorted: 0  1   2  3  4   5   6  7  8  9  10  11  12  13  14
 * index:  0  1   2  3  4   5   6  7  8  9  10  11  12  13  14

 * Then after the call to quickSort( ), the array nums would NOT have changed but ‘sorted’ would as:
 * nums:   8, 4, 12, 2, 6, 10, 14, 1, 3, 5,  7,   9,   11,  13, 15
 * index:    0  1   2   3  4   5   6   7  8   9  10  11  12   13  14

 * sorted:  7  3  8  1  9   4  10  0  11  5  12   2  13   6   14 
 * index:   0  1   2  3  4   5   6   7   8  9  10  11  12  13  14
 */

// CLIENT – NO other classes needed
public class QuickSortAnArray
{
    public static void main()
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(8, 4, 12, 2, 6, 10, 14, 1, 3, 5,  7,  9, 11, 13, 15));
        //int nums[ ] = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5,  7,  9, 11, 13, 15};
        //int sorted[ ] = new int[nums.size()];

        printList(nums);
        quickSort(nums);
        printList(nums);

    } // main



    // Keeping ‘nums’ EXACTLY as is, quickSort will move the ‘sorted’ arrays values
    //   around to express nums as sorted.
    public static void quickSort(ArrayList nums)
    {           
        int indexOfPivot = nums.size()-1;
        for(int i = 0;i < nums.size();i++){
            if((int)nums.get(i) > (int)nums.get(indexOfPivot)){
                int temp = (int)nums.get(i);
                nums.remove(i);
                nums.add(nums.size()-1);
            }else if((int)nums.get(i) < (int)nums.get(indexOfPivot)){
                int temp = (int)nums.get(i);
                nums.remove(i);
                nums.add(0);
            }
        }
    }


    public static void printList(ArrayList nums)
    {
        System.out.println(" This is the arraylist:  ");
        System.out.println(nums.toString());
        // >>> Your Code here.  Print ‘nums’ via the values acting as pointers inside of ‘sorted’ <<<

        System.out.print("\n\n\n");
    }
} // QuickSortAnArray

