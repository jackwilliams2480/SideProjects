public class Rectangle{
    int x,y,height,width;

    public Rectangle(int x,int y,int height, int width){
        if(height < 0 || width < 0){
            throw new IllegalArgumentException("only non-negative numbers greater than zero");
        }
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public Rectangle(Point p,int width,int height){
        this.x = p.x;
        this.y = p.y;
        this.width = width;
        this.height = height;
    }
    
    public boolean contains(int x,int y){
        return true;
    }
 
    
    public int getWidth(){
        return this.width;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    
    public String toString(){
        return "Rectangle[x =" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
    }
}