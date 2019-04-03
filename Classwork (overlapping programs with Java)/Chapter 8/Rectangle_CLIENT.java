public class Rectangle_CLIENT
{

    public static void main()
    {
        Rectangle r1, r2;
        Point p1, p2;

        r1 = new Rectangle(3,15,5,10);        
        //System.out.println("r1.getHeight() = " + r1.getHeight());
        System.out.println("r1.getWidth() = " + r1.getWidth());        
        System.out.println("r1.getX() = " + r1.getX());
        System.out.println("r1.getY() = " + r1.getY());        
        System.out.println("r1.toString() = " + r1.toString());

        r2 = new Rectangle(new Point(3,15),5,10);        
        //System.out.println("r2.getHeight() = " + r2.getHeight());
        System.out.println("r2.getWidth() = " + r2.getWidth());        
        System.out.println("r2.getX() = " + r2.getX());
        System.out.println("r2.getY() = " + r2.getY());        
        System.out.println("r2.toString() = " + r2.toString());

    }
}
