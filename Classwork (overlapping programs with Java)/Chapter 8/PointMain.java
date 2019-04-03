public class PointMain
{

    public static void main()
    {
        //Create two objects
        Point p1 = new Point(7,2);
        p1.x = 7;
        p1.y = 2;
        
        Point p3 = new Point(2,2);
        
        Point p2 = new Point(4,3);
        p2.x = 4;
        p2.y = 3;
    
        //Warning
        System.out.println("Point x and y values will change throught the output, but each exercise still works correctly \n");
        //translate both points
        p1.translates(2,2);
        p2.translates(2,2);
        System.out.println("Point 1 = " + p1 + ", Distance from the Origin is : " + p1.distanceFromOrigin() + " ");
        System.out.println("Point 2 = " + p2 + ", Distance from the Origin is : " + p2.distanceFromOrigin() + "\n");
    
        //what quadrant the point is in
        System.out.println("Point p1 is in quadrant " + p1.quadrant() + "\n");
        
        //flips x and y values
        System.out.print("Point p1 goes from" + p1.toString());
        p1.flip();
        System.out.println(" to " + p1.toString() + "\n");
        
        //manhattan distance
        System.out.println("Manhattan distance of Point p1 is " + p1.manhattanDistance() + "\n");
        
        //is the slope zero?
        System.out.println("Are the x values the same for p1 " + p1.toString() + " and p2 " + p2.toString() + "? " + p1.isVertical(p2) + "\n");
        
        //slope of two points
        System.out.println("The slope of p1 and p2 is " + p1.slope(p2));
        
        Point p4 = new Point(0,2);
        Point p5 = new Point(1,4);
        Point p6 = new Point(3,8);
        
        //is collinear
        System.out.println("Is point 1, point 2, and point 3 collinear? " + p4.isCollinear(p5,p6));
        
        
    }
}