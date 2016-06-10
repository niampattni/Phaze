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
  private int startTime=0;
  JLabel clock = new JLabel();
  Timer timer = new Timer(1000,this); 
  /**
   * The constructor of this class sets the start time for the timer, and sets the text on the 
   * JLabel
   * @param startTime chooses the start time the GameTimer will be given
   */
  public GameTimer(int startTime){
    this.startTime=startTime;
    clock.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
    clock.setForeground(Color.WHITE);
    clock.setText(""+time);
  }
  /**
   * This is a return method that will return the start time
   * @return startTime the amount of time the player has until it gets to 0
   */
  public int getStart() {
    return startTime;
  }
  /**
   * This overrides the actionPerformed method in ActionListener
   * @param ae what action is performed
   */
  public void actionPerformed(ActionEvent ae){
    time--;
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
    time=startTime;
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
  public static void main (String [] args)
  {
    JFrame frame = new JFrame();
    frame.setLayout(new FlowLayout());
    final GameTimer t = new GameTimer(30);
    frame.setSize(640,500);
    JButton start = new JButton("Start");
    JButton pause = new JButton ("Pause");
    JButton stop = new JButton("Stop");
    start.addActionListener(new ActionListener ( )
                              {
      public void actionPerformed (ActionEvent e)
      {
        t.start();
      } } ) ;
    pause.addActionListener(new ActionListener ( )
                              {
      public void actionPerformed (ActionEvent e)
      {
        t.pause();
      } } ) ;
    
    stop.addActionListener(new ActionListener ( )
                             {
      public void actionPerformed (ActionEvent e)
      {
        t.stop();
        t.clock.setText(""+t.getTime());
      } } ) ;
    frame.add(start);
    frame.add(pause);
    frame.add(stop);
    
    frame.add(t.clock);
    SwingUtilities.updateComponentTreeUI(frame);
    frame.setVisible(true);
  }
}