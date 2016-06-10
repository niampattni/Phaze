import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
/**
 * The Instructions class is meant for the user to read before playing the game. This way they can ensure that they
 * fully understand it before playing it. This class is a series of 4 slides describing the game and its rules.
 * <p>
 * <b>Instance Variables: </b>
 * <p>
 * <b>image </b> Instance of the BufferedImage class.
 * <p>
 * <b>current </b> Integer representing the index number of the current slide.
 * <p>
 * <b>label </b> Instance of the JLabel class.
 * @author Phaze Inc.
 * @version FINAL - June 10, 2016
 */
public class Instructions extends JPanel {
  BufferedImage image;
  int current = 0;
  JLabel label;
  
  /**
   * The constructor reads the initial image which is added to the JFrame.
   */
  public Instructions() {
    try {
      image = ImageIO.read(this.getClass().getResource("images\\Instructions" + current + ".png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    label = new JLabel(new ImageIcon(image));
    add(label);
    label.addMouseListener(listener);
  }
  
  /**
   * The nextImage() method reads in the next image in the slide sequence and repaints the screen to display it.
   */
  private void nextImage() {
    remove(label);
    label.removeMouseListener(listener);
    try {
      image = ImageIO.read(this.getClass().getResource("images\\Instructions" + current + ".png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    label = new JLabel(new ImageIcon(image));
    add(label);
    label.addMouseListener(listener);
    revalidate();
    repaint();
  }
  
  MouseListener listener = new MouseListener() {
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {
      current++;
      if (current > 3) {
        current = 0;
        Driver.changeScreens("MainMenu");
      } else {
        nextImage();
      }
    }
  };
  
  /**
   * Repaints the screen with the image as the background.
   */
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
  }
}