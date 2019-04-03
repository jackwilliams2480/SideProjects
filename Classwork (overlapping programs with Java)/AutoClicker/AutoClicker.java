import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClicker{
    public static void main() {
        try{
            Thread t = new Thread();
            Robot robot = new Robot();
            t.sleep(1000);
            while(true){
                robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            }
        }catch(Exception e){
            System.out.println("oof");
        }
    }
}