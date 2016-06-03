import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class Game {
  
  public BufferedImage blankImage;
  public BufferedImage colourImage;
  public BufferedImage bImg;
  public JLabel blank;
  public JLabel colour;
  public JLabel bg;
  
  public int currentPic = 0;
  public int x = 0;
  public int y = 0;
  public int bgx = 0;
  public int bgy = 0;
  
  public static final Color RED = new Color(255, 0, 0);
  public static final Color BLUE = new Color(0, 0, 255);
  public static final Color YELLOW = new Color(255, 255, 0);
  public static final Color ORANGE = new Color(255, 128, 0);
  public static final Color GREEN = new Color(0, 255, 0);
  public static final Color PURPLE = new Color(102, 0, 102);
  
  public String[] blankPics = {"TeddyBear.png"};
  public String[] colourPics = {"TeddyBearC.png"};
  
  public void colour(Color newColour, int x, int y) {
    //pixel1 = new Pixel(blankImage, x, y);
    //if (pixel1.getRed() != 0 || pixel1.getGreen() != 0 || pixel1.getBlue() != 0) {
      //return;
    //}
    //pixel1.setColor(newColour);
    //blankImage = pixel1.getImage();
    //updateScreen();
    if (x + 1 < blankImage.getWidth()) {
      colour(newColour, x + 1, y);
    } else if (x - 1 > 0) {
      colour(newColour, x - 1, y);
    } else if (y + 1 < blankImage.getHeight()) {
      colour(newColour, x, y + 1);
    } else if (y - 1 > 0) {
      colour(newColour, x, y - 1);
    }
    System.out.println("Coloured");
  }
  
}