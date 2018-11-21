import java.util.*;
import java.io.*;
import java.util.stream.*;
public class ArrayPrograms{
    public static void main(){
        System.out.println("Largest and smallest value in an array: ");
        int num[] = {5,6,3,2,9,6};
        Ex1(num);
        System.out.println();

        System.out.println("How many k?: ");
        int num2[] = {3,5,3,7,3,3,1,2,5,2,9,3,0,8,6};
        Ex2(num2,3);
        System.out.println();

        System.out.println("Longest and shortest words in array of strings: ");
        String num3[] = {"dog", "moose", "ox" , "bird", "fish"};
        Ex3(num3);
        System.out.println();

        System.out.println("Longest and shortest words in array of strings: ");
        int num4[] = {2,6,-8,5,-4,-3,1,-8,4,-1,7,10};
        Ex4(num4);
        System.out.println();
        
        System.out.println("Sum and average of all numbers: ");
        double num5[] = {2.3,6.73,4.01,3.999,7.5};
        Ex5(num5);
        System.out.println();
        
        System.out.println("Sum and average of all numbers: ");
        int num6[] = {10,20,30,40,50};
        Ex6(num6);
        System.out.println();
        
        System.out.println("Sum and average of all numbers: ");
        int num7[] = {5,7,3,1,4,6,2,15};
        Ex7(num7);
        System.out.println();
        
        System.out.println("Mean median and mode of an array of ints: ");
        int num8[] = {1,2,3,4,4,4,5,6,7,7,7};
        Ex8(num8);
        System.out.println();
        
        System.out.println("Int to an array of the equivalent binary number: ");
        Ex9(147);
        System.out.println("\n");

        System.out.println("Seating chart on a plane: ");
        int num10[] = new int[10];
        Ex10(num10);
        System.out.println();
    }

    public static void Ex1(int list[]){
        int largest = Integer.MIN_VALUE;int smallest = Integer.MAX_VALUE;
        for(int i : list){
            if(i > largest){
                largest = i;
            }else if(i < smallest){
                smallest = i;
            }
        } 
        System.out.println("Largest = " + largest + " smallest = " + smallest);
    }

    public static void Ex2(int list[],int k){
        int less = 0,greater = 0,equal = 0;
        for(int i : list){
            if(i > k){
                greater++;
            }else if(i < k){
                less++;
            }else{
                equal++;
            }
        }
        System.out.println("K count = " + equal + " less = " + less + " greater = " + greater);
    }

    public static void Ex3(String list[]){
        int largest = Integer.MIN_VALUE;int smallest = Integer.MAX_VALUE;
        String largestString = "";String smallestString = "";
        for(String i : list){
            if(i.length() > largest){
                largestString = i;
                largest = i.length();
            }else if(i.length() < smallest){
                smallestString = i;
                smallest = i.length();
            }
        }
        System.out.println("Longest = \"" + largestString + "\" position = " + Arrays.asList(list).indexOf(largestString) 
            + " smallest = \"" + smallestString + "\" position = " + Arrays.asList(list).indexOf(smallestString));
    }

    public static void Ex4(int list[]){
        int pos = 0,neg = 0;
        for(int i : list){
            if(i%2 == 0){
                pos++;
            }else{
                neg++;
            }
        }
        System.out.println("positive count = " + pos + " negative count = " + neg);
    }

    public static void Ex5(double list[]){
        double sum = 0;
        for(double i : list){
            sum+=i;
        }
        System.out.println("Sum = " + sum + " average = " + sum/list.length);
    }
    
    public static void Ex6(int list[]){
        int temp;
        for(int i = 0;i <= (list.length-1)/2;i++){
            temp = list[i]; 
            list[i] = list[list.length-(i+1)];
            list[list.length-(i+1)] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
    
    public static void Ex7(int list[]){
        Arrays.sort(list);
        System.out.println("largest = " + list[list.length-1] + " largest2 = " + list[list.length-2] + " largest3 = " + list[list.length-3] + " largest2 + 3 >=< " + list[list.length-1]);
    }
    
    //{1,1,1,6,6,7,9}
    public static void Ex8(int list[]){
        Arrays.sort(list);double sum = IntStream.of(list).sum();int count;int temp = list[0];String maxValue = "";int maxCount = 0;
        System.out.println("Mean = " + sum/list.length + " median = " + list[(list.length-1)/2]);
        for (int i : list) 
        {
            count = 0;
            for (int j : list) 
            {
                if (j == i)
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue += (Integer.toString(i) + ", ");
            }
        }
        System.out.println("Mode = " + maxValue);
    }
    
    public static void Ex9(int num){
        String binary = "";
        while(num!=0){
            if(num%2 == 0){
                binary += "0";
            }else if(num%2 == 1){
                binary += "1";
            }
            num/=2;
        }
        for(int i = binary.length()-1;i >= 0;i--){
            System.out.print( binary.charAt(i));
        }
    }
    
    public static void Ex10(int list[]){
        Scanner s = new Scanner(System.in);
        int seats = 0;
        while((list.length - (seats)) != 0){
            System.out.println("There are " + (list.length - (seats)) + " avaliable seats right now, would you like a 1st or 2nd class seat?");
            int classSeat = s.nextInt();
            list[seats] = classSeat;
            System.out.println(Arrays.toString(list));
            seats++;
        }
        Arrays.sort(list);
        System.out.println("The seats are now full, here is the entire seating chart");
        System.out.println(Arrays.toString(list));
    }
    
    
    
    
    
    
    
    
    
    }