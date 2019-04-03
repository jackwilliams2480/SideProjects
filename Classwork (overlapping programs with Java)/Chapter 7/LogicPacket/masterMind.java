import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.Event;

public class masterMind{
    public static void main() throws IOException, InterruptedException
    {
        String[] ans = new String[4];
        Random rand = new Random();
        int num;
        for (int i = 0; i < 4; i++)
        {
            num = rand.nextInt(6);

            if (num == 0)
            {
                ans[i] = "K";
            }
            else if (num == 1)
            {
                ans[i] = "B";
            }
            else if (num == 2)
            {
                ans[i] = "Y";
            }
            else if (num == 3)
            {
                ans[i] = "W";
            }
            else if (num == 4)
            {
                ans[i] = "R";
            }
            else
            {
                ans[i] ="G";
            }

        }
        System.out.println(Arrays.toString(ans));

        Scanner console = new Scanner(System.in);
        String[][] guesses = new String[10][4];
        for(String[] s : guesses){
            Arrays.fill(s, " ");
        }
        boolean[] ansTrue = {true, true, true, true};
        boolean[] guessTrue = {true, true, true, true};

        System.out.println();
        String current = "";

        for (int i = 0; i < 10; i++)
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println(Arrays.toString(ans));
            System.out.println("|MASTERMIND|");
            for(String[] row : guesses){
                System.out.println(Arrays.toString(row));
            }
            System.out.println("Hints? : " + current);
            System.out.print("What's your guess? ");
            String guess = console.nextLine();
            for (int j = 0; j < 4; j++){
                guesses[i][j] = "" + guess.charAt(j);
            }

            current = "";

            for (int j = 0; j < 4; j++)
            {
                if (ans[j].equalsIgnoreCase(guesses[i][j]))
                {
                    current+="X";
                    ansTrue[j] = false;
                    guessTrue[j] = false;
                }
            }

            for (int j = 0; j < 4; j++)
            {
                for (int k = 0; k < 4; k++)
                {
                    if (ans[j].equalsIgnoreCase(guesses[i][k]) && ansTrue[j] && guessTrue[k])
                    {
                        current+="O";
                        ansTrue[j] = false;
                        guessTrue[k] = false;
                    }
                }
            }

            for (int j = 0; j < 4; j++)
            {
                guessTrue[j] = true;
                ansTrue[j] = true;
            }

            if (current.equalsIgnoreCase("XXXX"))
            {
                System.out.println("Congratulations! It took " + (i+1) + " tries.");
                break;
            }
        }

        if (!current.equalsIgnoreCase("XXXX"))
        {
            System.out.println("Sorry, you lost. The correct values were " + Arrays.toString(ans));
        }
    }
    
    public static void masterMindBot() throws AWTException{
        Robot r = new Robot();
        String guess = "KKBB";
        
    }
}