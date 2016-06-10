import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.util.*;

/**
 * The LevelThree class is a JPanel which is reposncible for setting up the game
 * aspects which are unique to Level 3 as well as using PictureExplorer to colour
 * the images appropriately. It also reads in 2 images from files, starts the timer,
 * and changes the size of the JFrame ot 1400, 900.
 * <p>
 * <b>Instance Variables: </b>
 * <p>
 * <b>blankImage </b> Creates an instance of the BufferedImage class.
 * <p>
 * <b>bImg </b> Creates an instance of the BufferedImage class.
 * <p>
 * <b>pic </b> Creates an instance of the picture class.
 * @author Phaze Inc.
 * @version FINAL - June 10, 2016
 */
public class LevelThree extends JPanel {
  BufferedImage blankImage, bImg;
  Picture pic;
  
  /**
   * The constructor is responsible for removing the current contents of the
   * JPanel, reading in the current image as well as the Background image,
   * creating a new instance of the Picture class which is used to create an
   * instance of the PictureExplorer class. It adds this JPanel to itself, starts
   * the GameTimer and sets the JFrame size.
   */
  public LevelThree() {
    remove(Images.panel);
    try {
      blankImage = ImageIO.read(this.getClass().getResource("images\\" + Images.names[Images.current] + ".png"));
      bImg = ImageIO.read(this.getClass().getResource("images\\Level3BG.png"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    pic = new Picture(blankImage);
    Images.panel = pic.explore();
    add(Images.panel);
    Images.timer.start();
    Driver.frame.setSize(1400, 930);
  }
  
  /**
   * The overridden paintComponent() method redraws the background image at
   * the coordinate location 0, 0.
   */
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(bImg, 0, 0, this);
  }
}