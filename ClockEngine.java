import javax.swing.JFrame;
import javax.swing.Timer;
/**
 * ClockEngine
 * 
 * @author William Chern
 * @version 1/13/2016 (start)
 */
public class ClockEngine
{
    public static void main(String[] args) {
        // Create a frame
        JFrame clockFrame = new JFrame("JClock");
        //Set size of Frame
        clockFrame.setSize(ClockComponent.frameH, ClockComponent.frameW);
        
        // Construct graphical component of clock
        ClockComponent c = new ClockComponent();
        // Add graphical component of clock to frame
        clockFrame.add(c);
        // Make frame visible
        clockFrame.setVisible(true);
        
        // Animate, make clock go tic-toc
        Timer t = new Timer(50, c); // Timer will generate an Event, every 1000 milliseconds
        // response to this event is in actionPerformed() method
        t.start(); // starts the timer so it can generate and send Events
    }
}
