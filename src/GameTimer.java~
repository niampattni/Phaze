import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * This class will create a timer that will be used to time the player when they are colouring in the pages
 * <b> Instance Variable</b>
 * <p>
 * <b> time </b> this will store how much time has passed
 * <p>
 * <b> startTime </b> this will store how much time can pass before stopping
 * <p>
 * <b> clock </b> this creates a new instance of JLabel to show how much time is left
 * <p>
 * <b> timer </b> this creates a new instance of the Timer class
 * @author Phaze Inc.
 * @version FINAL - June 10 2016
*/
public class GameTimer implements ActionListener{
  private int time=0;
  JLabel clock = new JLabel();
  Timer timer = new Timer(1000,this); 
  /**
   * The constructor of this class sets the start time for the timer, and sets the text on the 
   * JLabel
   * @param startTime chooses the start time the GameTimer will be given
   */
  public GameTimer(){
    clock.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
    clock.setForeground(Color.WHITE);
    clock.setText(""+time);
  }
  /**
   * This overrides the actionPerformed method in ActionListener
   * @param ae what action is performed
   */
  public void actionPerformed(ActionEvent ae){
    time++;
    clock.setText(""+time);
  }
  /**
   * This is a return method to return how much time has passed
   * @return time how much time has passed
   */
  public int getTime()
  {
    return time;
  }
  
  /**
   * This method starts the timer
   */
  public void start()
  {
    timer.start();
  }
  /**
   * This method pauses the timer
   */
  public void pause(){
    timer.stop();
  }
  /**
   * this method stops the timer, and resets the start time
   */
  public void stop()
  {
    timer.stop();
    time=0;
  }
  /**
   * method only for testing the timer
   * @param args String array
   */ 
}