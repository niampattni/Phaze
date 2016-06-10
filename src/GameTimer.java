import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GameTimer implements ActionListener{
  private int time=0;
  private int startTime=0;
  JLabel clock = new JLabel();
  Timer timer = new Timer(1000,this); 
  
  public GameTimer(int startTime){
    this.startTime=startTime;
    clock.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
    clock.setForeground(Color.WHITE);
    clock.setText(""+time);
  }
  public int getStart() {
    return startTime;
  }
  public void actionPerformed(ActionEvent ae){
    time--;
    clock.setText(""+time);
  }
  public int getTime()
  {
    return time;
  }
  public void start()
  {
    time=startTime;
    timer.start();
  }
  public void pause(){
    timer.stop();
  }
  public void stop()
  {
    timer.stop();
    time=0;
  }
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