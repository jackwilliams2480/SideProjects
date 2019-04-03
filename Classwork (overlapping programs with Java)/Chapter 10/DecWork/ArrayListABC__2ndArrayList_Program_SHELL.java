import java.util.*;
import java.io.*;
public class ArrayListABC__2ndArrayList_Program_SHELL
{    
    public static void main() 
    {
        // ==========>  declare letterList ArrayList here <===========
        List<String> letterList = new ArrayList<>(
        Arrays.asList("A","B","D","A","C","A","E","H","F","H","G","C","B"));
        Random r = new Random();

        String letter;
        int k = 1;  // Position we are on.
        int count = 1; 
        int newPos;  // New Position randomly picked.
        int newLetter;  // New Letter randomly picked.
        String temp;  // Holding variable.   

        // =====>  YOUR CODE HERE <=======
        // Go through the loop adding, setting, removing, or ignoring elements 
        // as described above printing out the letterList each time through.

        k = 0;      
        count = 1;
        while (count < letterList.size())
        {  

            // =====>  YOUR CODE HERE <=======         
            temp = letterList.get(k);

            switch(temp){
                case "A":
                    letterList.add(k,"A");
                case "B":
                    letterList.set(k,"Z");
                case "C":
                    letterList.remove(k);
                case "D":
                    newPos = r.nextInt(letterList.size()-1);
                    letter = letterList.get(newPos);
                    letterList.set(newPos,"D");
                    letterList.set(k,letter);
                case "E":
                    newPos = r.nextInt(letterList.size()-1);
                    letter = letterList.get(newPos);
                    letterList.set(newPos,"E");
                    letterList.set(k,letter);
                case "F":
                    int letters = (r.nextInt(9)+65);
                    letterList.set(k,Character.toString((char)letters));
                case "G":
                    //ignore for now
                case "H":
                    //ignore
            }
            
            
            // Output the ArrayList
            System.out.print("count = " + count + ": ");
            for (int i=0; i < letterList.size(); i++)
                System.out.print("   ("+i+")" + letterList.get(i));
            System.out.println("\n");
            count++; 
            k++;
        } // while

    }  // main

}  // ArrayListABC
