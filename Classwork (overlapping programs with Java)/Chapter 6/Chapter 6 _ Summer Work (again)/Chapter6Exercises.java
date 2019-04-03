import java.util.*;
import java.io.*;
public class Chapter6Exercises{
    public static void main(){
        File f = new File("inputFile.txt");
        File f2 = new File("inputFile2.txt");
        try{
            Scanner input = new Scanner(f);
            Scanner input2 = new Scanner(f2);
            collapseSpaces(input);
            System.out.println();
            inputStats(input2);
        }catch(FileNotFoundException exception)
        {
            System.out.println("The file was not found.");
        }

    }
    
    public static void boyGirl(Scanner input) {
        int i = 0, bSum = 0, gSum = 0;
        while (input.hasNext()) {
            String s = input.next();
            if (i%2 == 0) {
                bSum += input.nextInt(); 
            } else {
                gSum += input.nextInt();
            }
            i++;
        }
        SOP(i - i/2 + " boys, "); // easier to use printf!!!
        SOPL(i/2 + " girls");
        SOPL("Difference: " + Math.abs(bSum - gSum));
    }

    public static void evenNumbers(Scanner input) {
        int elementCount = 0, sum = 0, evenCount = 0;
        double percentEven; //possibly unnecessary, but should get into mindset that 
        //barely make a difference and would be better for coding practice if included
        while (input.hasNextInt()) {
            int element = input.nextInt();
            elementCount++;
            sum += element;
            if (element%2 == 0) evenCount++;
        }
        percentEven = (double) evenCount / elementCount * 100;
        System.out.println(elementCount + " numbers, sum = " + sum);
        SOPL(evenCount + " evens ("+percentEven+"%)");
    }

    public static boolean negativeSum(Scanner input) {
        int sum = 0, elementCount = 0;
        while (input.hasNextInt()) {
            sum += input.nextInt();
            elementCount++;
            if (sum < 0) {
                SOPL("sum of "+sum+" after "+elementCount+" steps");
                return true;
            }
        }
        SOPL("no negative sum");
        return false;
    }

    public static void cointCoins(Scanner input) {
        double sum = 0, penny = .01, nickel = .05, dime = .1, quarter = .25;
        while (input.hasNextInt()) {
            int qty = input.nextInt();
            String s = input.next();
            if (s.toLowerCase().equals("pennies")){
                sum += qty * penny;
            } else if (s.toLowerCase().equals("nickels")){
                sum += qty * nickel;
            } else if (s.toLowerCase().equals("dimes")){
                sum += qty * dime;
            } else {
                sum += qty * quarter; 
            }
        }
        System.out.printf("Total money = %.2f", sum);
    }

    public static void collapseSpaces(Scanner input) {
        if (input.hasNext()) {
            SOP(input.next());
            while (input.hasNext()) {
                System.out.print(" " + input.next());
            }
        }
    } 
    
    public static String readEntireFile(Scanner input) {
        String s = "";
        while (input.hasNext()) {
            s += input.next() + " ";
        }
        return s;
    }

    public static void flipLines(Scanner input) {
        while (input.hasNextLine()) {
            String s1 = input.nextLine();
            if (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
            System.out.println(s1);
        }
    }

    public static void doubleSpace(Scanner input, PrintStream output) {
        if (input.hasNextLine()) {
            output.println(input.nextLine());
        }
        while (input.hasNextLine()) {
            output.println();
            output.println(input.nextLine());
        }
    }
    
    public static final int MAX_LENGTH = 60;
    public static void wordWrap(Scanner input) {
        while (input.hasNextLine()) {
            String s = input.nextLine();
            while (s.length() > MAX_LENGTH) {
                System.out.println(s.substring(0, MAX_LENGTH));
                s = s.substring(MAX_LENGTH);
            }
            System.out.println(s);
        }
    }

    public static void wordWrap2(Scanner input) {
        int count = 0;
        while (input.hasNext()) {
            String s = input.next();
            if (count == 0) {
                count += s.length();
                System.out.print(s);
            } else if (count+s.length()+1 <= MAX_LENGTH) {
                count += s.length()+1;
                System.out.print(" " + s);
            } else {
                count = 0;
                System.out.println();
            }
        }
    }

    public static void stripHtmlTags(Scanner input) {
        while (input.hasNextLine()) {
            String line = input.nextLine();
            while (line.indexOf("<") != -1) {
                int start = line.indexOf("<");
                int end = line.indexOf(">");
                line = line.replace(line.substring(start, end+1), "");
            }
            if (!line.equals("")) System.out.println(line);
        }
    }

    public static void stripComments(Scanner input) {
        boolean isComment = false;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (!isComment) {
                int temp = 0;
                while (line.indexOf("/*") != -1) {
                    if (line.indexOf("*/") != -1) {
                        int start = line.indexOf("/*");
                        int end = line.indexOf("*/");
                        line = line.replace(line.substring(start, end+2), "");
                    } else {
                        isComment = true;
                        temp = line.indexOf("/*");
                        line = line.replace(line.substring(line.indexOf("/*")), "");
                    }
                }
                if (line.indexOf("//") != -1) {
                    if (line.indexOf("//") < temp) isComment = false;
                    line = line.replace(line.substring(line.indexOf("//")), "");
                }
                if (!line.equals("")) System.out.println(line);
            } else if (line.indexOf("*/") != -1) {
                int end = line.indexOf("*/");
                String s = line.substring(0, end+2);
                if (!line.equals("")) System.out.println(line.replace(s, ""));
                isComment = false;
            }
        }
    }

    public static void printDuplicates(Scanner input) {
        while (input.hasNextLine()) {
            Scanner line = new Scanner(input.nextLine());
            String previous = " ";
            int count = 0;
            while (line.hasNext()) {
                String current = line.next();
                if (current.equals(previous)) {
                    count++;
                } else {
                    if (count > 1) {
                        System.out.printf("%s*%d ", previous, count);
                    }
                    count = 1;
                }
                previous = current;
            }
            if (count > 1) {
                System.out.printf("%s*%d", previous, count);
            }
            System.out.println();
        }
    }

    public static void coinFlip(Scanner input) {
        while (input.hasNextLine()) {
            int countFlips = 0;
            int countHeads = 0;
            Scanner set = new Scanner(input.nextLine());
            while (set.hasNext()) {
                String coinFace = set.next().toUpperCase();
                if (coinFace.equals("H")) countHeads++;
                countFlips++;
            }
            double percent = (double) countHeads / countFlips * 100;
            System.out.printf("%d heads (%.1f%%)\n", countHeads, percent);
            if (percent > 50) System.out.println("You win!");
            System.out.println();
        }
    }

    public static void mostCommonNames(Scanner input) {
        while (input.hasNextLine()) {
            Scanner line = new Scanner(input.nextLine());
            String previous = line.next(), mostCommon = previous;
            int count = 1, maxCount = 1;
            while (line.hasNext()) {
                String current = line.next();
                if (current.equals(previous)) {
                    count++;
                } else {
                    if (count > maxCount) {
                        maxCount = count;
                        mostCommon = previous;
                    }
                    count = 1;
                }
                previous = current;
            }
            if (count > maxCount) {
                mostCommon = previous;
            }
            System.out.println("Most common: " + mostCommon);
        }
    }

    public static void plusScores(Scanner input) {
        while (input.hasNextLine()) {
            String name = input.nextLine();
            if (!input.hasNextLine()) throw new IllegalArgumentException();
            String score = input.nextLine();
            int countPlus = 0;
            for (int i = 0; i < score.length(); i++) {
                if (score.charAt(i) == '+') countPlus++;
            }
            double percent = (double) countPlus / score.length() * 100;
            System.out.printf("%s: %.1f%% plus\n", name, percent);
        }
    }

    public static void leetSpeak(Scanner input, PrintStream output) {
        while (input.hasNextLine()) {
            Scanner line = new Scanner(input.nextLine());
            while (line.hasNext()) {
                String original = line.next().toLowerCase();
                output.print("(");
                for (int i = 0; i < original.length(); i++) {
                    if (i == original.length()-1 && original.charAt(i) == 's') {
                        output.print("Z");
                        break;
                    }
                    switch (original.charAt(i)) {
                        case 'o': output.print("0"); break;
                        case 'l': output.print("1"); break;
                        case 'e': output.print("3"); break;
                        case 'a': output.print("4"); break;
                        case 't': output.print("7"); break;
                        default: output.print(original.charAt(i)); break;
                    }
                }
                output.print(") ");
            }
            output.println();
        }
    }
    
    public static void SOPL(String s) {
        System.out.println(s);
    }

    public static void SOP(String s) {
        System.out.println(s);
    }

    public static void inputStats(Scanner input) throws FileNotFoundException
    {
        int tokenEachLine = 0, lineCount = 1;int pos = 0;
        String longest = "";int start = 0;int word = 0;int longestWord = 0;
        while(input.hasNextLine()){
            String line = input.nextLine();
            for(int i = pos;i <= line.length();){
                pos = line.indexOf(" ",pos+1);
                tokenEachLine++;
                if(pos != -1){
                    if(line.length() > longest.length()){longest = line;}
                    word=pos-(start+1);
                    if(word>longestWord) longestWord = word;
                    start=pos;
                }else{
                    word =((line.length())-(start+1));
                    if(word>longestWord) longestWord=word;
                    break;
                }
            }
            System.out.println("Line " + lineCount + " has " + tokenEachLine + " tokens (longest = " + longestWord + ")");
            tokenEachLine = 0; lineCount++;longestWord=0;
        }
        System.out.println("Longest Line: " + longest);
    }

}