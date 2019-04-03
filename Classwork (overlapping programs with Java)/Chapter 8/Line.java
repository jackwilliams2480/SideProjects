public class Line{
    private Point p1 = new Point(0,0);
    private Point p2 = new Point(0,0);

    public Line(){
        this(0,0,0,0);
    }

    public Line(int x1, int y1, int x2, int y2){
        this.p1.x = x1;
        this.p1.y = y1;
        this.p2.x = x2;
        this.p2.y = y2;
    }

    public Line(Point p1,Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return p1;
    }

    public Point getP2(){
        return p2;
    }

    public double getSlope(){
        if(p2.x - p1.x == 0){
            return 0;
        }else{
            return (p2.y - p1.y) / (p2.x - p1.x);
        }
    }

    public boolean isCollinear(Point p1, Point p2){
        double scale = Math.pow(10, 4);
        double slope1 = Math.round((p2.y-p1.y)/(p2.x - p1.x) * scale) / scale;
        double slope2 = Math.round((p2.y-p1.y)/(p2.x - p1.x) / scale);
        if(slope1 == slope2){
            return true;
        }else{
            return false;
        }
    }


    
    public String toString(){
        return "(" + p1.x + "," + p1.y + "), (" + p2.x + "," + p2.y + ")";
    }
}