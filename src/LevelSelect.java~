import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
  /**
   * This class creates the level select screen
   * <b> Variables </b>
   * <b>x </b> stores the x coordinate where the user has clicked
   * <p>
   * <b>y </b> stores the y coordinate where the user has clicked
   * <p>
   * <b> bImg </b> will store the background
   * <p>
   * <b> clicked </b> boolean variable that stores if the user has clicked
   * @author Phaze Inc.
   * @version FINAL - June 10 2016
   */ 
public class LevelSelect extends JPanel {
  
  BufferedImage bImg;
  static int x;
  static int y;
  static boolean clicked = false;
  /**
   * The class constructor creates the JPanel and adds the background image and a mouseListener
   * <b> Variables </b> 
   * <p>
   * <b> bg </b> the background
   */
  public LevelSelect() {
    JLabel bg;
    try {
      bImg = ImageIO.read(this.getClass().getResource("LevelSelectBG.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    bg = new JLabel(new ImageIcon(bImg));
    add(bg);
    bg.addMouseListener(LevelSelect.listener);
  }
  
  static MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      if (!clicked) {
        x = e.getX();
        y = e.getY();
      }
      clicked = true;
      if (x >= 540 && x <= 746 && y >= 116 && y <= 226) {
        System.out.println("Level 1");
        Images.level = 1;
        Images.current++;
        Images.timer = new GameTimer(30);
        Driver.changeScreens("LevelOne");
      } else if (x >= 843 && x <= 1011 && y >= 112 && y <= 201) {
        System.out.println("Level 2");
        Images.level = 2;
        Images.current++;
        Images.timer = new GameTimer(45);
        Driver.changeScreens("LevelTwo");
      } else if (x >= 208 && x <= 350 && y >= 121 && y <= 197) {
        System.out.println("Level 3");
        Images.level = 3;
        Images.current++;
        Images.timer = new GameTimer(45);
        Driver.changeScreens("LevelThree");
      }
    }
  };
  /**
   * This paints the background image
   * @param g the graphics of the JPanel
   */
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
  }
  
}