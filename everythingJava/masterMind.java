import java.util.*;

/**
 * Write a description of class masterMind here.
 *
 * @author Jack Williams
 * @version 1.0 | 11/2/2018
 */
public class masterMind
{
    public static Random r = new Random();
    public static Scanner s = new Scanner(System.in);
    public static void main()
    {
        mastermind();
    }
    
    public static void mastermind()
    {
        //variables
        int guessCount = 0, white = 0, black = 0;
        int solution[] = {r.nextInt(6),r.nextInt(6),r.nextInt(6),r.nextInt(6)};
        int userguess[] = {0,0,0,0};
        while(guessCount < 10)
        {
            white = 0; black = 0;
            System.out.println("0 = blue, 1 = green, 2 = orange, 3 = purple, 4 = red, 5 = yellow");
            for(int a = 0;a < 4;a++)
            {
                System.out.println("What is your guess for the " + a + " slot");
                userguess[a] = s.nextInt();
            }

            for(int i = 0; i < userguess.length;i++)
            {
                for(int j = 0;j < solution.length;j++)
                {
                    if(userguess[i] == solution[j])
                    {
                        if(i == j)
                        {
                            black++;
                            solution[j] = -1;
                        }else
                        {
                            white++;
                        }
                        break;
                    }
                }  
            }
           
            System.out.println("Solution = " + Arrays.toString(solution) + "\n");
            
            if(black == 4){
                System.out.println("Congratulations, you have won!");
                break;
            }else{
                System.out.println(Arrays.toString(userguess) + " Black = " + black + " White = " + white);
            }
        
        
        }
    }
    
}
