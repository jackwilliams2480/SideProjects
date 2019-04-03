
// Building Java Programs
// Chapter 7
// Pg 447 Temperature1 code
// Alter this program as specified in class with Mr Marques.

import java.util.*;

public class Temperature1 
{

    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int numDays = console.nextInt();
        int temps[] = new int[numDays];
        int greatestTemp = Integer.MIN_VALUE;
        int leastTemp = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Day " + (i+1) + "'s high temp: ");
            temps[i] = console.nextInt();
            if(temps[i] > greatestTemp){
                greatestTemp = temps[i];
            }
            if(temps[i] < leastTemp){
                leastTemp = temps[i];
            }
            sum += temps[i];
        }
        double average = (double) sum / numDays;
        System.out.println();
        System.out.println("Average = " + average);
        System.out.println("Greastest = " + greatestTemp);
        System.out.println("Least = " + leastTemp);
    }  // main

    public void doubleIt(int a[]){
    
    }
} // Temperature1

