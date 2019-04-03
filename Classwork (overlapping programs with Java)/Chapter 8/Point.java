public class Point
{
    int x;
    int y;

    public Point(int dx,int dy){
        x = dx;
        y = dy;
    }

    //Read & Write operations
    public void translates(int dx,int dy){
        x = x + dx;
        y = y + dy;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    //Read only operations
    public double distanceFromOrigin(){
        return Math.sqrt(x*x + y*y);
    }

    public int quadrant(){
        if(this.x > 0 & this.x > 0){
            return 1;
        }else if(this.x < 0 & this.y > 0){
            return 2;
        }else if(this.x < 0 & this.y < 0){
            return 3;
        }else if(this.x > 0 & this.y < 0){
            return 4;
        }else{
            return 0;
        }
    }

    public void flip(){
        int temp = this.x;
        this.x = this.y;
        this.y = temp;
    }

    public int manhattanDistance(){
        return Math.abs(this.x) + Math.abs(this.y);
    }

    public boolean isVertical(Point other){
        if(this.x == other.x){
            return true;
        }else{
            return false;
        }
    }

    public double slope(Point other){
        if(this.x == other.x){
            throw new IllegalArgumentException("x values cannot be the same");
        }else if(this.x > other.x){
            return (this.y-other.y)/(this.x - other.x);
        }else{
            return (this.y-other.y)/(this.x - other.x);
        }
    }

    public boolean isCollinear(Point p1, Point p2){
        double scale = Math.pow(10, 4);
        double slope1 = Math.round((slope(p1)) * scale) / scale;
        double slope2 = Math.round((slope(p2)) * scale) / scale;
        if(slope1 == slope2){
            return true;
        }else{
            return false;
        }
    }

}