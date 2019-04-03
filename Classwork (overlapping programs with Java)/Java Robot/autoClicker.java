import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class autoClicker
{    

    public autoClicker() throws IOException,AWTException,InterruptedException
    {
        Robot robot = new Robot();
        
        Thread.sleep(1000);
        Point p = MouseInfo.getPointerInfo().getLocation();
        while(true)
        {
            robot.mouseMove(p.x, p.y);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease( InputEvent.BUTTON1_DOWN_MASK );
        }

    }
    



}