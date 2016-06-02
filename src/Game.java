import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
public abstract class Game extends JPanel {
  
  //public abstract void setColourSelection(Color[] colours);
  //public abstract void selectColour();
  
  public BufferedImage blankImage;
  public BufferedImage colourImage;
  private Pixel pixel1;
  private Pixel pixel2;
  public boolean win = false;
  
  public static final Color RED = new Color(255, 0, 0);
  public static final Color BLUE = new Color(0, 0, 255);
  public static final Color YELLOW = new Color(255, 255, 0);
  public static final Color ORANGE = new Color(255, 128, 0);
  public static final Color GREEN = new Color(0, 255, 0);
  public static final Color PURPLE = new Color(102, 0, 102);
  
  public static int currentPic = 0;
  public static String[] blankPics = {"TeddyBear.png"};
  public static String[] colourPics = {"TeddyBearC.png"};
  
  public void loadNextImages() {
    try {
      blankImage = ImageIO.read(this.getClass().getResource(Game.blankPics[Game.currentPic]));
      colourImage = ImageIO.read(this.getClass().getResource(Game.colourPics[Game.currentPic]));
      System.out.println("Read images");
    } catch (IOException e) {
      e.printStackTrace();
    }
    Game.currentPic++;
    if (Game.currentPic > Game.blankPics.length) {
      Game.currentPic = 0;
      win = true;
    }
  }
  
  public void colour(Color newColour, int x, int y) {
    pixel1 = new Pixel(blankImage, x, y);
    if (pixel1.getRed() != 0 || pixel1.getGreen() != 0 || pixel1.getBlue() != 0) {
      return;
    }
    pixel1.setColor(newColour);
    if (x + 1 < blankImage.getWidth()) {
      colour(newColour, x + 1, y);
    } else if (x - 1 > 0) {
      colour(newColour, x - 1, y);
    } else if (y + 1 < blankImage.getHeight()) {
      colour(newColour, x, y + 1);
    } else if (y - 1 > 0) {
      colour(newColour, x, y - 1);
    }
  }
  
  public boolean compare(Color newColour) {
    if (pixel2.getRed() == newColour.getRed() && pixel2.getGreen() == newColour.getGreen() && pixel2.getBlue() == newColour.getBlue()) {
      return true;
    }
    return false;
  }
  
  public boolean checkComplete() {
    return false;
  }
  
}