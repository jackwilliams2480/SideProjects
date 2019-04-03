public class ArrandAlgorithmsBook 
{
    public static void main()
    {
        System.out.print(trinice(tri(10)));
    }
    
    public static int tri(int n)
    {
        if(n == 1)
        {
            return 1;
        }else
        {
            return n + tri(n-1);
        }
    }
    
    public static String trinice(int n)
    {
        return "[" + n + "]";
    }
    
    public static void findKey()
    {
        int[] MainBox = new int[]{1,2,3,4};
        boolean key = false;
        while(key == false)
        {
            for(int i = 0;i < 4;i++)
            {
                if(MainBox[i] == 4)
                {
                    key=true;
                }else
                {
                    System.out.println("The Key was not found!");
                }
            }
        }
        System.out.println("They Key was found!");
    }
}