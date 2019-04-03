import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.*;
public class Robo {
    
    public static void main() throws IOException, AWTException, InterruptedException{
        String command = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(command);
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        // Create an instance of Robot class
        Robot robot = new Robot();
        
        for(int i = 1;i <= 26;i++){
        robot.keyPress(64+i);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_COMMA);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(100);
        }
        
    }

}
