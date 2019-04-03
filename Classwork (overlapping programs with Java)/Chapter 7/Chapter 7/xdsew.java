import java.util.*;
/**
 * Write a description of class xdsew here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class xdsew
{
    public static void main()
{int ARRAY[][] =  {{1,2,3,4,5},
                  {6,7,8,9,10},
                  {11,12,13,14,15},
                  {16,17,18,19,20},
                  {21,22,23,24,25} };

        int temp;
        for(int i =0;i<ARRAY.length;i++)
        {
            for(int j =0;j<ARRAY.length;j++)
            {
                temp = ARRAY[j][i];
                ARRAY[i][j] = temp;

            }

        }
        System.out.println(Arrays.deepToString(ARRAY));
    }
}