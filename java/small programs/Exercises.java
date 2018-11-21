class Exercises {
    public static void main() {
        System.out.println("Exercise 1: ");
        int[] array1 = {74,85,102,99,101,85,56};
        System.out.println(Ex1(array1,85) + "\n");
        
        System.out.println("Exercise 2: ");
        int[] array2 = {36,12,25,19,46,31,22};
        System.out.println(Ex2(array2) + "\n");
        
        System.out.println("Exercise 3: ");
        int[] array3 = {14,1,22,17,36,7,-43,5};
        System.out.println(Ex3(array3,4,17) + "\n");
        
        System.out.println("Exercise 4: ");
        double[] array4 = {16.1,12.3,22.2,14.4};
        System.out.println(Ex4(array4) + "\n");
        
        System.out.println("Exercise 5: ");
        int[] array5 = {27,15,15,11,27};
        System.out.println(Ex5(array5) + "\n");

    }

    public static int Ex1(int[] arr, int value)
    {
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] == value)
            {
                return arr[i] % 10;
            }
        }
        return -1;
    }

    public static int Ex2(int [] arr)
    {
        int max = 0, min = arr[0];
        for (int i = 0; i<arr.length; i++)
        {
            min = Math.min(min, arr[i]);
            max = Math.max(arr[i], max);
        }
        return max - min + 1;
    }

    public static int Ex3(int [] arr, int min, int max)
    {
        int count = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] >= min && arr[i] <= max)
                count++;
        }
        return count;
    }

    public static boolean Ex4(double [] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= arr[i+1]);
            return false;
        }
        return true;
    }

    public static int Ex5(int [] arr)
    {
        int count = 0, maxValue = 0, maxCount = 0;
        for (int i : arr) 
        {
            count = 0;
            for (int j : arr) 
            {
                if (j == i)
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static double Ex6(int[] arr)
    {
        int total = 0;

        for(int i : arr)
        {
            total += arr[i];
        }

        int mean = total / arr.length;
        total = 0;
        for(int i : arr)
        {
            total += Math.pow(arr[i] - mean, 2);
        }
        return Math.sqrt(total / arr.length - 1);
    }

    public static int Ex7(int k, int[] a)
    {
        int max = a[0];
        for(int i : a)
        {
            max = Math.max(max, a[i]);
        }
        for (int i=1; i<=k; i++)
        {
            for (int j : a)
                if (a[j] == max)
                    a[j] = 0;

            for(int j : a)
            {
                max = Math.max(max, a[i]);
            }
        }
        return max;
    }

    public static int Ex8(int[] a)
    {
        int count = 0, output = -1;
        int[] arr = new int[100];

        for(int i = 0; i< a.length; i++)
        {
            arr[a[i]]++;
        }

        for(int i = 0; count < a.length / 2; i++)
        {
            if(arr[i] > 0)
            {
                count += i;
                output = arr[i];
            }
        }
        return output;
    }

    public static int Ex9(int[] a)
    {
        if (a.length < 2)
            return 0;

        int min = a[0] - a[1], holder;
        for(int i = 0; i < a.length; i++)
        {
            holder = a[i] - a[i + 1];
            min = Math.min(holder, min);
        }
        return min;
    }

    public static double Ex10(int[] a)
    {
        int count = 0;
        for(int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
                count++;
        }
        if (count == 0)
            return 0.0;
        return count / a.length;
    }

    public static boolean Ex11(int[] a)
    {
        int max = a[0], min = a[0];
        for(int i : a)
        {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        int length = max - min;
        if(min < 0)
        {
            for(int i : a)
            {
                a[i]+= (min * -1);
            }
        }
        int[] sort = new int[max];
        for(int i = 0; i < length; i++)
        {
            sort[a[i]]++;
        }

        for(int i = 0; i < sort.length; i++)
        {
            if(sort[i] > 1)
                return false;
        }
        return true;
    }

    public static int Ex12(int[] a, int price)
    {
        int rightPrice = -1;

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] <= price && a[i] > rightPrice)
            {
                rightPrice = a[i];
            }
        }

        return rightPrice;
    }

    public static int Ex13(int[] a)
    {
        int lengthMax = 0, holder = 0;

        for(int i = 0; i < a.length - 1; i++)
        {
            if(a[i] < a[i+1])
                holder++;
            else
            {
                if (i == a.length - 2)
                    holder++;

                lengthMax = Math.max(holder, lengthMax);
                holder = 0;
            }
        }

        return lengthMax;
    }

    public static boolean Ex14(int[] a, int[] b)
    {
        for(int i = 0; i < a.length; i++)
        {
            int count = 0;
            if(a[i] == b[0])
                count++;
            else
                count = 0;
            if(count == b.length)
            {
                return true;
            }
        }

        return false;
    }

    public static int[] Ex15(int[] a)
    {
        int[] collapse;
        if (a.length % 2 == 0)
            collapse = new int[a.length / 2];
        else
            collapse = new int[(a.length / 2) + 1];

        for(int i = 0; i < collapse.length * 2 / 2; i++)
        {
            collapse[i] = a[2*i] + a[(2*i) + 1];
        }

        if (collapse.length % 2 == 1)
            collapse[collapse.length - 1] = a[a.length - 1];
        return collapse;
    }

    public static int[] Ex16(int[] a, int[] b)
    {
        int[] append = new int[a.length + b.length];
        int i = 0;
        for(int j = 0; j < a.length; j++)
        {
            append[i] = a[j];
            i++;
        }
        for(int j = i; j < b.length; j++)
        {
            append[i] = b[j];
            i++;
        }
        return append;
    }

    public static int[] Ex17(String in)
    {
        int[] vowelCount = new int[5];
        for(int i = 0; i < in.length(); i++)
        {
            if(in.indexOf(i) == 'a')
                vowelCount[0]++;
            else if(in.indexOf(i) == 'e')
                vowelCount[1]++;
            else if(in.indexOf(i) == 'i')
                vowelCount[2]++;
            else if(in.indexOf(i) == 'o')
                vowelCount[3]++;
            else if(in.indexOf(i) == 'u')
                vowelCount[4]++;
        }
        return vowelCount;
    }
    
    public static void Ex18(int list[],String input)
    {
        
    }

}