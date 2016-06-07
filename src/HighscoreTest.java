import javax.swing.*;
import java.awt.event.*;
public class HighscoreTest extends JFrame{
  Highscores h = new Highscores();
  public HighscoreTest(){
    this.add(h);
    setSize(1200,930);
    setVisible(true);
  }
  public static void main (String [] args)
  {
    HighscoreTest t = new HighscoreTest();
  }
}